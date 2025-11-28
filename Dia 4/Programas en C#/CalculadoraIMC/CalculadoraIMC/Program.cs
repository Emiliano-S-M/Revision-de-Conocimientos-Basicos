// Calculadora de IMC

double kilos, metros;
bool sonKilos, sonMetros;
string peso, altura;

Console.WriteLine("Calculadora de IMC");

do
{
    Console.Write("Ingrese su peso en kilogramos: ");
    peso = Console.ReadLine();

    if (string.IsNullOrWhiteSpace(peso))
    {
        Console.WriteLine("El peso no puede estar vacío. Intente de nuevo.");
    }

    sonKilos = double.TryParse(peso, out kilos);

    if (!sonKilos)
    {
        Console.WriteLine("El peso no puede ser de texto, por favor, ingresa un numero");
        sonKilos = false;
        continue;
    }
    if (kilos <= 0)
    {
        Console.WriteLine("El peso no puede ser menor a 0");
        sonKilos = false;
    }

}
while (!sonKilos);

do
{
    Console.Write("Ingrese su altura en metros: ");
    altura = Console.ReadLine();

    if (string.IsNullOrWhiteSpace(altura))
    {
        Console.WriteLine("La altura no puede estar vacía. Intente de nuevo.");
    }
    sonMetros = double.TryParse(altura, out metros);
    if (!sonMetros)
    {
        Console.WriteLine("La altura no puede ser de texto, por favor, ingresa un numero");
        sonMetros = false;
        continue;
    }
    if (metros <= 0)
    {
        Console.WriteLine("La altura no puede ser menor a 0");
        sonMetros = false;
    }
}
while (!sonMetros);

if (sonMetros && sonKilos)
{
    double imc = kilos / (metros * metros);
    Console.WriteLine($"Su IMC es: {imc:F2}");
    if (imc < 18.5)
    {
        Console.WriteLine("Peso muy bajo");
    }
    else if (imc >= 18.6 && imc <= 24.9)
    {
        Console.WriteLine("Peso normal");
    }
    else if (imc >= 25 && imc <= 29.9)
    {
        Console.WriteLine("Sobrepeso");
    }
    else if (imc >= 30 && imc <= 34.9)
    {
        Console.WriteLine("Obesidad grado I");
    }
    else if (imc >= 35 && imc <= 39.9)
    {
        Console.WriteLine("Obesidad grado II");
    }
    else
    {
        Console.WriteLine("Obesidad grado III");
    }
}