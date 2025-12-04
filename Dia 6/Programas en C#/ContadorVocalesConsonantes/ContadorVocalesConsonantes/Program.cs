using System;

namespace ContadorVocalesConsonantes
{
    class Program
    {
        static void Main(string[] args)
        {
            string opcion = "";

            do
            {
                string frase = "";
                bool fraseValida = false;

                // Bucle hasta que se ingrese una frase válida
                while (!fraseValida)
                {
                    Console.WriteLine("Ingresa una frase (solo letras y espacios):");
                    frase = Console.ReadLine();

                    if (string.IsNullOrEmpty(frase))
                    {
                        Console.WriteLine("Error: La frase no puede estar vacía.");
                        continue;
                    }

                    if (ContieneCaracteresInvalidos(frase))
                    {
                        Console.WriteLine("Error: La frase contiene caracteres inválidos. Intenta nuevamente.");
                        continue;
                    }

                    fraseValida = true; // Solo salimos si la frase es válida
                }

                // Si la frase es válida, contamos vocales y consonantes
                ContarVocalesConsonantes(frase);

                Console.WriteLine("¿Deseas ingresar otra frase? (s/n):");
                opcion = Console.ReadLine().Trim().ToLower();

            } while (opcion == "s");

            Console.WriteLine("¡Gracias por usar el programa!");
        }

        public static void ContarVocalesConsonantes(string frase)
        {
            int vocales = 0;
            int consonantes = 0;

            frase = frase.ToLower();

            foreach (char c in frase)
            {
                if (c == ' ')
                {
                    continue; // Ignoramos espacios
                }

                if ("aeiou".Contains(c))
                {
                    vocales++;
                }
                else
                {
                    consonantes++;
                }
            }

            Console.WriteLine("Número de vocales: " + vocales);
            Console.WriteLine("Número de consonantes: " + consonantes);
        }

        private static bool ContieneCaracteresInvalidos(string frase)
        {
            foreach (char c in frase)
            {
                if (c != ' ' && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
                {
                    return true;
                }
            }
            return false;
        }
    }
}