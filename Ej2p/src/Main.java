//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = read.nextLine();

        System.out.println("Su nombre es " + name);
    }
}