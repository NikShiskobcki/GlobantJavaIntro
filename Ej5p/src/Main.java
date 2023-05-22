//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = read.nextInt();
        System.out.println("Doble: " + 2*num);
        System.out.println("Triple: " + 3*num);
        System.out.println("Raiz cuadrada: " + Math.sqrt(num));
    }
}