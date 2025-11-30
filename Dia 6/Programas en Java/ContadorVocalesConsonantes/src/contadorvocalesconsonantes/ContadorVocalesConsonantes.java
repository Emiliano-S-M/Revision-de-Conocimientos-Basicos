package contadorvocalesconsonantes;

import java.util.Scanner;

/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion = "";

        do {
            System.out.println("Ingresa una frase (solo letras y espacios):");
            String frase = sc.nextLine();

            try {
                contarVocalesConsonantes(frase);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                continue; // Volvemos al inicio del bucle para pedir otra frase
            }

            System.out.println("¿Deseas ingresar otra frase? (s/n):");
            opcion = sc.nextLine().trim().toLowerCase();

        } while (opcion.equals("s"));

        System.out.println("¡Gracias por usar el programa!");
        sc.close();
    }

    public static void contarVocalesConsonantes(String frase) {
        if (frase.isEmpty()) {
            throw new IllegalArgumentException("La frase no puede estar vacía.");
        }

        int vocales = 0;
        int consonantes = 0;

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == ' ') {
                continue; // Ignoramos espacios
            }

            if (c < 'a' || c > 'z') {
                throw new IllegalArgumentException(
                        "La frase contiene caracteres inválidos: '" + c + "'");
            }

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);
    }
}
