// Crear una calculadora basica sin el uso de funciones

Console.WriteLine("Calculadora Basica");
Console.WriteLine("Ingrese el primer numero:");
String numero1 = Console.ReadLine();
Console.WriteLine("Ingrese el segundo numero:");
String numero2 = Console.ReadLine();

Console.WriteLine("Ingrese la operacion (+, -, *, /):");
String operacion = Console.ReadLine();

double resultado = 0;
if (operacion == "+")
{
    resultado = Convert.ToDouble(numero1) + Convert.ToDouble(numero2);
}
else if (operacion == "-")
{
    resultado = Convert.ToDouble(numero1) - Convert.ToDouble(numero2);
}
else if (operacion == "*")
{
    resultado = Convert.ToDouble(numero1) * Convert.ToDouble(numero2);
}
else if (operacion == "/")
{
    resultado = Convert.ToDouble(numero1) / Convert.ToDouble(numero2);
}
else
{
    Console.WriteLine("Operacion no valida");
}

Console.WriteLine("El resultado es: " + resultado);