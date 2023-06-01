//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int digits = 1;

        System.out.println("Ingrese un numero");
        int num = read.nextInt();
        int aux = num;
        while (aux>9){
            aux = aux/10;
            digits++;
        }

        System.out.println("El numero "+num+" tiene "+digits+" digitos");
    }
}