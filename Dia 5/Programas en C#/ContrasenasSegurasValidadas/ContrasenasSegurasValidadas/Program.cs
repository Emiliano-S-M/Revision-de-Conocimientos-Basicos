using System;
using System.Security.Cryptography;
using System.Text;

namespace ContrasenasSeguras
{
    class Program
    {
        static void Main(string[] args)
        {
            int longitud = 0;
            bool repetir;

            string mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            string minus = "abcdefghijklmnopqrstuvwxyz";
            string numeros = "0123456789";
            string simbolos = "!@#$%^&*()-_=+[]{}";

            string todos = mayus + minus + numeros + simbolos;

            RandomNumberGenerator rng = RandomNumberGenerator.Create();
            StringBuilder sb = new StringBuilder();

            do
            {
                repetir = false;
                Console.WriteLine("Ingrese la longitud deseada para tu contraseña (mínimo 8): ");
                string input = Console.ReadLine();

                if (int.TryParse(input, out longitud))
                {
                    if (longitud < 8)
                    {
                        Console.WriteLine("Longitud inválida, debe ser 8 o más.");
                        repetir = true;
                    }
                }
                else
                {
                    Console.WriteLine("Debes ingresar un número entero.");
                    repetir = true;
                }
            } while (repetir);

            sb.Append(GetRandomChar(mayus, rng));
            sb.Append(GetRandomChar(minus, rng));
            sb.Append(GetRandomChar(numeros, rng));
            sb.Append(GetRandomChar(simbolos, rng));

            for (int i = 4; i < longitud; i++)
            {
                sb.Append(GetRandomChar(todos, rng));
            }

            string contraseña = Mezclar(sb.ToString(), rng);

            Console.WriteLine("Tu contraseña segura es: " + contraseña);
        }

        private static char GetRandomChar(string source, RandomNumberGenerator rng)
        {
            byte[] buffer = new byte[4];
            rng.GetBytes(buffer);
            int value = BitConverter.ToInt32(buffer, 0);
            value = Math.Abs(value % source.Length);
            return source[value];
        }

        private static string Mezclar(string input, RandomNumberGenerator rng)
        {
            char[] arr = input.ToCharArray();
            for (int i = arr.Length - 1; i > 0; i--)
            {
                int j = GetRandomIndex(i + 1, rng);
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            return new string(arr);
        }

        private static int GetRandomIndex(int max, RandomNumberGenerator rng)
        {
            byte[] buffer = new byte[4];
            rng.GetBytes(buffer);
            int value = BitConverter.ToInt32(buffer, 0);
            return Math.Abs(value % max);
        }
    }
}