/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
  dos. El programa deberá después mostrar el resultado de la suma.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num1 = read.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = read.nextInt();

        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
    }
}