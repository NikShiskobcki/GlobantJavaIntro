//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int [][] matrix = new int[4][4];

        fillMatrix(matrix);
        printMatrix(matrix);

        System.out.println("");
        matrix = transposeMatrix(matrix);
        printMatrix(matrix);
    }

    public static void fillMatrix(int [][] matrix){
        Random random = new Random();
        int i;
        int j;
        for (i=0; i<4;i++){
            for (j=0;j<4;j++){
                matrix[i][j]= random.nextInt(10);
            }
        }
    }
    public static int[][] transposeMatrix(int [][] matrix){
        int [][] aux = new int[4][4];

        int i;
        int j;
        for (i=0;i<4;i++){
            for (j=0;j<4;j++){
                aux[i][j] = matrix[j][i];
            }
        }
        return aux;
    }

    public static void printMatrix(int [][] matrix){
        Random random = new Random();
        int i, j;

        for (i=0; i<4;i++){
            for (j=0;j<4;j++){
                System.out.print("[ "+matrix[i][j]+" ] ");
            }
            System.out.println("");
        }
    }
}