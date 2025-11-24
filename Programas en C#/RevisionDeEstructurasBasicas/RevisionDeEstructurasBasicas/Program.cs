// Crear un programa que solicita el nombre de un usuario y lo muestra en pantalla.

using System.Timers;

// Personalizamos la consola
Console.BackgroundColor = ConsoleColor.Green;
Console.ForegroundColor = ConsoleColor.White;

Console.Clear();

Console.WriteLine("Por favor, ingrese su nombre:");
String nombre = Console.ReadLine();
Console.WriteLine("Hola, " + nombre + "!");
Console.WriteLine("Por favor, ingresa dos numeros");
String numero1 = Console.ReadLine();
String numero2 = Console.ReadLine();

int num1 = Convert.ToInt32(numero1); // Primer Metodo de conversion de String a numero
int num2 = int.Parse(numero2); // Segundo Metodo de conversion de String a numero

Console.WriteLine("La suma de los numeros es: " + (num1 + num2));
Console.WriteLine("La resta de los numeros es: " + (num1 - num2));
Console.WriteLine("La multiplicacion de los numeros es: " + (num1 * num2));
Console.WriteLine("La division de los numeros es: " + (num1 / num2));

Console.WriteLine("El numero mayor es:");
Console.WriteLine(num1 > num2 ? num1 : num2);

Console.WriteLine(((num1 + num2) % 2 == 0) ? "Es par" : "Es impar");

int[] array = new int[5];

Console.WriteLine("Ingrese 5 numeros");

for (int i = 0; i < 5; i++)
{
    String num = Console.ReadLine();
    array[i] = int.Parse(num);
}

for (int i = 0; i < 5; i++)
{
    Console.Write(array[i] + " ");
}

Console.WriteLine("\nIngresa dos numeros para multiplicarlos: ");
num1 = Convert.ToInt32(Console.ReadLine());
num2 = Convert.ToInt32(Console.ReadLine());

Console.WriteLine(multiplicacion(num1, num2));

static String multiplicacion(int n, int m)
{
    int mult;
    String res = "El resultado de la multiplicacion es: " + (n * m);

    return res;
}