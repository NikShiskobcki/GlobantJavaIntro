//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.

import sun.security.util.Length;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String phrase = read.nextLine();

        if (phrase.length()== 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}