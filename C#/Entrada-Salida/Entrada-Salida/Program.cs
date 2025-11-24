Console.WriteLine("Hola, Ingresa tu nombre");
String nombre = Console.ReadLine(); // Lee una linea completa de texto, y la devuelve como String
Console.WriteLine("Hola " + nombre);

Console.WriteLine("Ingresa tu nombre");
int unicode = Console.Read(); // Devuelve el valor unicode unicamente de la primera leta ingresada en el texto
Console.WriteLine(unicode);

Console.WriteLine("Ingresa un Nombre");
ConsoleKeyInfo letra = Console.ReadKey(); // Lee una sola tecla y no es necesario presionar enter
Console.WriteLine(letra);// De esta no muestra texto apartente
Console.WriteLine("La letra ingresada es: " + letra.KeyChar); // Muestra la letra ingresada
Console.WriteLine("El valor unicode de la letra es: " + (int)letra.KeyChar); // Muestra el valor unicode de la letra ingresada