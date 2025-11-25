package calculadorabasicasinfunciones;

import java.util.Scanner;

/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class CalculadoraBasicaSinFunciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        String operacion, res;
        System.out.println("Calculadora Basica");
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Seleccine una operacion( +, -, *, /)");
        operacion = sc.next();

        switch (operacion) {
            case "+":
                res = "" + (num1 + num2);
                break;
            case "-":
                res = "" + (num1 - num2);
                break;
            case "*":
                res = "" + (num1 * num2);
                break;
            case "/":
                if(num2 == 0){
                    res = "No se puede dividir entre cero";
                } else {
                    res = "" + (num1 / num2);
                }
                break;
            default:
                res = "El operador no es valido...";
                break;
        }
        
        System.out.println("Salida: " + res);
    }

}
