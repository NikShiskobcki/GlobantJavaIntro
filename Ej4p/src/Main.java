//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una temperatura");
        double temp = read.nextDouble();

        double tempF = 32 + (9 * temp / 5);

        System.out.println("La temperatura ingresada es de " +tempF+ "F");
    }
}