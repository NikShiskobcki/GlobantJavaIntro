//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un entero");
        int n = read.nextInt();

        int i;
        int j;
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                if ((i == 0) || (i == 3)){
                    System.out.print("*");
                } else if ((j==0)||j==3){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}