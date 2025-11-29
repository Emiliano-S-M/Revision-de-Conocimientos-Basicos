package contrasenasseguras;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class ContrasenasSeguras {
    public static void main(String[] args) {
        
        int longitud = 0;
        boolean repetir;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}";
        
        Scanner sc = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        
        do {     
            repetir = false;
            try {
                System.out.println("Ingrese la longitud deseada(minimo 8)");
                longitud = sc.nextInt();
                if (longitud <=7 ) {
                    System.out.println("Longitud invalida, ingresa un numero igual o mayor a 8");
                    repetir = true;
                } else {
                    repetir = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un numero, no texto y deber ser sin decimales");
                sc.nextLine();
                repetir = true;
            }
        } while (repetir);
        
        for(int i = 0 ; i < longitud ; i++) {
            int index = sr.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        System.out.println("Tu contraseña segura es: " + sb);
    }

}
