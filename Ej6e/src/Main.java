//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
//debajo de 1.60 mts. y el promedio de estaturas en general.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese numero de personas");
        int n = read.nextInt();

        double avgUnder, gralAvg, amountUnder, x;


        avgUnder=0;
        gralAvg=0;
        amountUnder=0;

        for (int i=0; i<n;i++){
            System.out.println("Ingrese estatura");
            x = read.nextDouble();

            if (x<1.6){
                avgUnder+=x;
                amountUnder++;
            }
            gralAvg+=x;
        }

        gralAvg=gralAvg/n;
        avgUnder=avgUnder/amountUnder;

        System.out.println("El promedio de estaturas debajo de 1.60 es de "+avgUnder);
        System.out.println("El promedio de estaturas general es de "+gralAvg);
    }
}