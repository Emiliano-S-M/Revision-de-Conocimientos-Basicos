package calculadoraconfunciones;

import java.util.Scanner;

/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class CalculadoraConFunciones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        String operacion, res, accion;
        
        System.out.println("Calculadora");
        do {            
            System.out.println("Ingresa el primero numero");
        num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo numero");
        num2 = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("Seleccione una operacion (+, -, *, /)");
        operacion = sc.next();
        
        switch (operacion) {
            case "+":
                res = String.valueOf(suma(num1, num2));
                break;
             case "-":
                res = String.valueOf(resta(num1, num2));
                break;
            case "*":
                res = String.valueOf(multiplicacion(num1, num2));
                break;
             case "/":
                if(num2 == 0) {
                    res = "No puedes dividir entre cero";
                } else {
                    res = String.valueOf(division(num1, num2));
                }
                break;
            default:
                res = "Operacion no valida";
        }
        
        System.out.println("Salida: " + res);
        
            do {                
                System.out.println("¿Deseas hacer otra operacion? (S/N)");
                accion = sc.next().toLowerCase();
                
                if (!accion.equals("s")  && !accion.equals("n")) {
                    System.out.println("Opcion no valida, intenta nuevamente");
                }
            } while (!accion.equals("s") && !accion.equals("n"));
        } while (accion.equals("s"));
        
    }
    
    public static double suma(double a, double b) {
        return a + b;
    }
    
    public static double resta(double a, double b) {
        return a - b;
    }
    
    public static double multiplicacion(double a, double b) {
        return a * b;
    }
    
    public static double division(double a, double b) {
        return a / b;
    }

}
