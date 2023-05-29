//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese tamaño del array");
        int n = read.nextInt();

        int[] array = new int[n];

        int i;
        for (i=0; i<n;i++){
            array[i]= random.nextInt(100000);
        }
        digits(array, n);
    }

    public static void digits(int[] array, int n){
        int oneD, twoD, threeD, fourD, fiveD;
        oneD=0;twoD=0;threeD=0;fourD=0;fiveD=0;

        int i;
        String x;
        int len;

        for (i=0;i<n;i++){
            x=Integer.toString(array[i]);
            len = x.length();
            switch (len) {
                case 1:
                    oneD++;
                    break;
                case 2:
                    twoD++;
                    break;
                case 3:
                    threeD++;
                    break;
                case 4:
                    fourD++;
                    break;
                case 5:
                    fiveD++;
                    break;
            }
        }
        System.out.println("Numeros con 1 digito:" +oneD);
        System.out.println("Numeros con 2 digito:" +twoD);
        System.out.println("Numeros con 3 digito:" +threeD);
        System.out.println("Numeros con 4 digito:" +fourD);
        System.out.println("Numeros con 5 digito:" +fiveD);
    }
}
