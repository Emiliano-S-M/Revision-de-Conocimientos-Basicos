package revisiondeestructurasbasicas;

import java.util.Scanner; // Importamos la clase Scanner para lectura de datos
/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class RevisionDeEstructurasBasicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos un objeto de la clase scanner
        
        // Solicitamos el nombre de usuario
        System.out.println("Hola, por favor ingresa tu nombre");
        String nombre = sc.nextLine(); // Leemos el nombre del usuario desde consola
        System.out.println("Hola " + nombre); // Mostramos el nombre de usuario
        
        System.out.println("Ingrese dos numeros"); //Solicitamos dos numeros
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        System.out.println("La suma de los numeros es: " +  (num1 + num2));
        System.out.println("La resta de los numeros es: " +  (num1 - num2));
        System.out.println("La multiplicacion de los numeros es: " +  (num1 * num2));
        System.out.println("La division de los numeros es: " +  (num1 / num2));
        
        System.out.println(num1 > num2 ? (num1 + " Es el mayor") : (num2 + " Es el mayor"));
        System.out.println(((num1 + num2) % 2) == 0 ? ("La suma es par " + (num1 + num2)) : ("La suma es impar " + (num1 + num2)));
        
        
        int[] array = new int[5];
        System.out.println("Ingresa 5 numeros");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("Los numeros ingresados son ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
        
        
        System.out.println("\nIngrese dos numeros para multiplicar: ");
        int numero1, numero2;
        System.out.print("Numero 1: ");
        numero1 = sc.nextInt();
        System.out.print("Numero 2: ");
        numero2 = sc.nextInt();
        
        System.out.println("El resultado es: " + multiplicacion(numero1, numero2));
    }
    
    
    static int multiplicacion(int num1,int num2) {
        int res = num1*num2;
        return res;
    }

}
