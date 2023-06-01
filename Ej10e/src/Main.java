//Realice un programa para que el usuario adivine el resultado de una multiplicación entre
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
//al usuario ingresar su respuesta nuevamente.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int num1, num2, res;

        num1 = (int)Math.floor(Math.random() * (10 - 0 + 1) + 0);
        num2 = (int)Math.floor(Math.random() * (10 - 0 + 1) + 0);

        System.out.println("Ingrese un numero");
        res = read.nextInt();

        while (res!=num1*num2){
            System.out.println("Incorrecto, ingrese otro numero");
            res = read.nextInt();
        }

        System.out.println("Correcto");

    }
}