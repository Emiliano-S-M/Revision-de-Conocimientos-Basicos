package ordenamientodenumeros.burbuja.seleccion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class OrdenamientoDeNumerosBurbujaSeleccion {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean repetirPrograma;

        do {
            int n = 0;
            boolean entradaValida = false;
            do {
                try {
                    System.out.print("¿Cuántos números deseas ingresar? ");
                    n = sc.nextInt();

                    if (n <= 0) {
                        System.out.println("⚠ Debes ingresar un número mayor a 0.");
                    } else {
                        entradaValida = true;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Debes ingresar solo números enteros.");
                    sc.nextLine();
                }
            } while (!entradaValida);

            int[] numeros = new int[n];

            for (int i = 0; i < n; i++) {
                boolean numeroValido = false;

                do {
                    try {
                        System.out.print("Número " + (i + 1) + ": ");
                        numeros[i] = sc.nextInt();
                        numeroValido = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Ingresa solo números.");
                        sc.nextLine();
                    }
                } while (!numeroValido);
            }

            System.out.print("\nArreglo original: ");
            mostrarArreglo(numeros);

            int[] burbuja = numeros.clone();
            ordenarBurbuja(burbuja);
            System.out.print("Ordenado por Burbuja: ");
            mostrarArreglo(burbuja);

            int[] seleccion = numeros.clone();
            ordenarSeleccion(seleccion);
            System.out.print("Ordenado por Selección: ");
            mostrarArreglo(seleccion);
            sc.nextLine(); 
            System.out.print("\n¿Deseas repetir el programa? (s/n): ");
            String opcion = sc.nextLine().trim().toLowerCase();

            repetirPrograma = opcion.equals("s");

            System.out.println();

        } while (repetirPrograma);

        System.out.println("¡Programa finalizado!");
    }
    public static void mostrarArreglo(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void ordenarBurbuja(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenarSeleccion(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int aux = arr[min];
            arr[min] = arr[i];
            arr[i] = aux;
        }
    }
}
