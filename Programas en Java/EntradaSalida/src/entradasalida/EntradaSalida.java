package entradasalida;

import java.util.Scanner;
/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class EntradaSalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, ingresa tu nombre por favor");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + " bienvenido");
    }

}
