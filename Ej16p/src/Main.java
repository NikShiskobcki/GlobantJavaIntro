//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese tamaño del array");
        int n = read.nextInt();

        int[] array = new int[n];

        //fill array
        int i;
        for (i=0; i<n;i++){
            array[i]= random.nextInt(100);
        }

        System.out.println("Ingrese numero a buscar");
        int x = read.nextInt();

        int occ = 0;
        for (i=0; i<n;i++){
            if (array[i] == x) {
                occ++;
                System.out.println("Numero encontrado en posicion "+ i);
            }
        }
        System.out.println("Ocurrencias del numero "+x+": "+occ);

    }
}