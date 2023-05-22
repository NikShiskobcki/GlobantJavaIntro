//Crear un programa que dado un numero determine si es par o impar.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = read.nextInt();

        if (num % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}