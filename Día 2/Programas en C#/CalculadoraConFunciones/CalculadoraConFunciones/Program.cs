// Creacion de una calculadora simple en C# con funciones para sumar, restar, multiplicar y dividir.

static double sumar(double a, double b) => a + b;
static double restar(double a, double b) => a - b;
static double multiplicar(double a, double b) => a * b;

static double dividir(double a, double b)
{
    if (b == 0)
    {
        Console.WriteLine("No se puede dividir por cero.");
        return double.NaN;
    }
    else
    {
        return a / b;
    }
}


String opcion = "";
Console.WriteLine("Calculadora Simple");
do
{
    Console.WriteLine("Ingresa el primer numero:");
    String numero1 = Console.ReadLine();
    Console.WriteLine("Ingrese el segundo numero:");
    String numero2 = Console.ReadLine();
    Console.WriteLine("Seleccione la operacion (+, -, *, /):");
    String operacion = Console.ReadLine();
    double num1 = Convert.ToDouble(numero1);
    double num2 = Convert.ToDouble(numero2);

    double resultado;

    switch (operacion)
    {
        case "+":
            resultado = sumar(num1, num2);
            break;
        case "-":
            resultado = restar(num1, num2);
            break;
        case "*":
            resultado = multiplicar(num1, num2);
            break;
        case "/":
            resultado = dividir(num1, num2);
            break;
        default:
            Console.WriteLine("Operacion no valida.");
            continue;
    }

    Console.WriteLine("El resultado es: " + resultado);
    Console.WriteLine("Desea realizar otra operacion? (s/n):");
    opcion = Console.ReadLine();
    Console.Clear();

} while (opcion == "s");

Console.WriteLine("Hasta luego");