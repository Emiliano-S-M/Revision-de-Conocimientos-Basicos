
do
{
    try
    {
        Console.WriteLine("Ingrese la longitud deseada para la contraseña (mínimo 8 caracteres):");
        int longitud = int.Parse(Console.ReadLine() ?? string.Empty);
        if (longitud < 8)
        {
            throw new ArgumentException("La longitud mínima para una contraseña segura es de 8 caracteres.");
        }
        const string caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        var random = new Random();
        var contrasena = new char[longitud];
        for (int i = 0; i < longitud; i++)
        {
            contrasena[i] = caracteres[random.Next(caracteres.Length)];
        }
        Console.WriteLine($"Contraseña generada: {new string(contrasena)}");
        break;
    }
    catch (FormatException)
    {
        Console.WriteLine("Error: Por favor, ingrese un número válido para la longitud.");
    }
    catch (ArgumentException ex)
    {
        Console.WriteLine($"Error: {ex.Message}");
    }
}
while (true);