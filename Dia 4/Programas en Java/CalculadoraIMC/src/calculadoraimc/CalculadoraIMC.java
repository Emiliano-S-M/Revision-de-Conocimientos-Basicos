package calculadoraimc;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Emiliano Sanchez Madrid
 */
public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float kilos = 0, estatura = 0;
        boolean repetirPeso, repetirEstatura;

        do {
            repetirPeso = false;
            try {
                System.out.println("Ingrese su peso en Kilos");
                kilos = sc.nextFloat();
                if (kilos <= 0) {
                    System.out.println("El peso no puede ser menor o igual a cero");
                    repetirPeso = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un numero, no texto");
                repetirPeso = true;
                sc.nextLine();
            }
        } while (repetirPeso);

        do {
            repetirEstatura = false;
            try {
                System.out.println("Ingrese su estatura en metros");
                estatura = sc.nextFloat();
                if (estatura <= 0) {
                    System.out.println("La estatura no puede ser menor o igual a cero");
                    repetirEstatura = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un numero, no texto");
                repetirEstatura = true;
                sc.nextLine();
            }
        } while (repetirEstatura);

        if (!repetirEstatura && !repetirPeso) {
            float imc = kilos / (estatura * estatura);

            System.out.println("Su IMC es: " + imc);

            if (imc < 18.5) {
                System.out.println("Peso muy bajo");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso normal");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("Sobrepeso");
            } else if (imc >= 30 && imc <= 34.9) {
                System.out.println("Obesidad grado I");
            } else if (imc >= 35 && imc <= 39.9) {
                System.out.println("Obesidad grado II");
            } else {
                System.out.println("Obesidad grado III");
            }
        }

    }

}
