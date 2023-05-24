//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] array = new int[100];

        int x = 101;
        int i;

        for (i=0; i<100; i++){
            array[i]=x-1;
            x--;
        }
        for (i=0; i<100; i++){
            System.out.println(array[i]);
        }
    }
}