package contrasenasseguras;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class contrasenasSegurasValidadas {

    public static void main(String[] args) {
        int longitud = 0;
        boolean repetir;

        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()-_=+[]{}";

        String todos = mayus + minus + numeros + simbolos;

        Scanner sc = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        do {
            repetir = false;
            try {
                System.out.println("Ingrese la longitud deseada para tu contraseña (mínimo 8): ");
                longitud = sc.nextInt();
                if (longitud < 8) {
                    System.out.println("Longitud invalida, debe ser 8 o más.");
                    repetir = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                sc.nextLine(); // limpiar buffer
                repetir = true;
            }
        } while (repetir);

        sb.append(mayus.charAt(sr.nextInt(mayus.length())));
        sb.append(minus.charAt(sr.nextInt(minus.length())));
        sb.append(numeros.charAt(sr.nextInt(numeros.length())));
        sb.append(simbolos.charAt(sr.nextInt(simbolos.length())));

        for (int i = 4; i < longitud; i++) {
            sb.append(todos.charAt(sr.nextInt(todos.length())));
        }

        String contraseña = mezclar(sb.toString(), sr);

        System.out.println("Tu contraseña segura es: " + contraseña);
    }

    private static String mezclar(String input, SecureRandom sr) {
        char[] arr = input.toCharArray();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = sr.nextInt(i + 1);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

}
