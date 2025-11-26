package conversordetemperaturas;

import java.util.Scanner;

/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class ConversorDeTemperaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String conversion;
        double valor;
        String res;
        boolean repetir = true;

        while (repetir) {

            System.out.println("Conversor de Temperaturas");
            System.out.println("a) Celsius a Fahrenheit");
            System.out.println("b) Celsius a Kelvin");
            System.out.println("c) Kelvin a Celsius");
            System.out.println("d) Kelvin a Fahrenheit");
            System.out.println("e) Fahrenheit a Celsius");
            System.out.println("f) Fahrenheit a Kelvin");
            System.out.println("g) Salir");
            System.out.print("Seleccione un tipo de conversión: ");

            conversion = sc.next();

            if (conversion.equals("g")) {
                repetir = false;
                continue;
            }

            // Validar opción antes de pedir valor
            if (!conversion.matches("[a-f]")) {
                System.out.println("Opción inválida, intenta nuevamente\n");
                continue;
            }

            System.out.print("Ingrese el valor a convertir: ");
            valor = sc.nextDouble();

            res = switch (conversion) {
                case "a" ->
                    "" + celciusFahrenheit(valor);
                case "b" ->
                    "" + celciusKelvin(valor);
                case "c" ->
                    "" + kelvinCelcius(valor);
                case "d" ->
                    "" + kelvinFahrenheit(valor);
                case "e" ->
                    "" + fahrenheitCelcius(valor);
                case "f" ->
                    "" + fahrenheitKelvin(valor);
                default ->
                    "Error inesperado";
            };

            System.out.println("Resultado: " + res + "\n");
        }

        System.out.println("¡Hasta luego!");
    }

    public static double celciusFahrenheit(double n1) {
        return (n1 * 9 / 5) + 32;
    }

    public static double celciusKelvin(double n1) {
        return n1 + 273.15;
    }

    public static double fahrenheitCelcius(double n1) {
        return (n1 - 32) * 5 / 9;
    }

    public static double fahrenheitKelvin(double n1) {
        return (n1 - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinCelcius(double n1) {
        return n1 - 273.15;
    }

    public static double kelvinFahrenheit(double n1) {
        return (n1 - 273.15) * 9 / 5 + 32;
    }

}
