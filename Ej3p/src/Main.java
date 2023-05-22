//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
// en minúsculas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String phrase = read.nextLine();

        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
    }
}