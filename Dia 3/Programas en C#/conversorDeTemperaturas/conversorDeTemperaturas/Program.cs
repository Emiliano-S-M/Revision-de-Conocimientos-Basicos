using System.Globalization;

string conversion;
double valor;
string res; 
bool repetir = true;
string valorInput;

while (repetir)
{
    Console.WriteLine("Conversor de temperaturas");
    Console.WriteLine("a) Celcius a Fahrenheit");
    Console.WriteLine("b) Celcius a Kelvin");
    Console.WriteLine("c) Kelvin a Fahrenheit");
    Console.WriteLine("d) Kelvin a Celcius");
    Console.WriteLine("e) Fahrenheit a Celcius");
    Console.WriteLine("f) Fahrenheit a Kelvin");
    Console.WriteLine("g) salir");
    Console.Write("Seleccione un tipo de conversion: ");

    string conversionInput = Console.ReadLine();
    if (conversionInput == null)
    {
        Console.WriteLine("Entrada vacía. Intenta nuevamente.\n");
        continue;
    }
    
    conversion = conversionInput.Trim().ToLower();


    if (conversion == "g")
    {
        repetir = false;
        break;
    }

    if (!(conversion == "a" || conversion == "b" || conversion == "c" ||
          conversion == "d" || conversion == "e" || conversion == "f"))
    {
        Console.WriteLine("Opcion invalida, intenta nuevamente.\n");
        continue;
    }

    Console.Write("Ingrese el valor a convertir: ");
    valorInput = Console.ReadLine();

    
    while (!double.TryParse(valorInput, NumberStyles.Float, CultureInfo.CurrentCulture, out valor))
    {
        Console.WriteLine("Valor no válido. Ingresa un número (puedes usar coma o punto según tu configuración).");
        Console.Write("Ingrese el valor a convertir: ");
        valorInput = Console.ReadLine();
    }

   
    double resultado;
    switch (conversion)
    {
        case "a":
            resultado = celciusFahrenheit(valor);
            break;
        case "b":
            resultado = celciusKelvin(valor);
            break;
        case "c":
            resultado = kelvinFahrenheit(valor);
            break;
        case "d":
            resultado = kelvinCelcius(valor);
            break;
        case "e":
            resultado = fahrenheitCelcius(valor);
            break;
        case "f":
            resultado = fahrenheitKelvin(valor);
            break;
        default:
            Console.WriteLine("Error inesperado.\n");
            continue;
    }

    Console.WriteLine($"Resultado: {resultado}\n");
}

Console.WriteLine("Hasta Luego");



static double fahrenheitKelvin(double n1)
{
    return (n1 - 32) * 5 / 9 + 273.15;
}

static double fahrenheitCelcius(double n1)
{
    return (n1 - 32) * 5 / 9;
}

static double kelvinFahrenheit(double n1)
{
    return (n1 - 273.15) * 9 / 5 + 32;
}

static double kelvinCelcius(double n1)
{
    return n1 - 273.15;
}

static double celciusKelvin(double n1)
{
    return n1 + 273.15;
}

static double celciusFahrenheit(double n1) {
    return (n1 * 9 / 5) + 32;
}