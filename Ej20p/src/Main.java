//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];

        fillMatrix(matrix);
        printMatrix(matrix);

        if (checkMagic(matrix)){
            System.out.println("El cuadrado es magico");
        }else{
            System.out.println("El cuadrado no es magico");
        }
    }

    public static void fillMatrix(int [][] matrix){
        Scanner read = new Scanner(System.in);
        int i,j,x;

        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                do {
                    System.out.println("Ingrese un valor del 1 al 9");
                    x = read.nextInt();
                    if ((x<=9)&&(x>=1)){
                        matrix[i][j]=x;
                    }
                }while (x>9||x<=0);
            }
        }
    }

    public static void printMatrix(int [][] matrix){
        int i, j;

        for (i=0; i<3;i++){
            for (j=0;j<3;j++){
                System.out.print("[ "+matrix[i][j]+" ] ");
            }
            System.out.println("");
        }
    }

    public static boolean checkMagic(int [][] matrix){
        int sum,i,j;
        boolean flag=true;
        sum=0;
        for(j=0;j<3;j++){
            sum +=matrix[0][j];
        }
        flag = checkLines(matrix, sum);
        if (flag == true){
            flag = checkColumns(matrix, sum);
        }
        if (flag == true){
            flag = checkMainDiagonal(matrix, sum);
        }
        if (flag == true){
            flag = checkReverseDiagonal(matrix, sum);
        }

        return flag;
    }

    public static boolean checkLines(int [][] matrix, int sum){
        int sumAux = 0;
        int i,j;
        boolean flag = true;

        for (i=0;i<3;i++) {
            sumAux = 0;
            for (j = 0; j < 3; j++) {
                sumAux += matrix[i][j];
            }
            if (sumAux != sum) {
                flag = false;
            }

        }
        return flag;
    }

    public static boolean checkColumns(int [][] matrix, int sum){
        int sumAux = 0;
        int i,j;
        boolean flag = true;

        for (i=0;i<3;i++) {
            sumAux = 0;
            for (j = 0; j < 3; j++) {
                sumAux += matrix[j][i];
            }
            if (sumAux != sum) {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean checkMainDiagonal(int [][] matrix, int sum){
        int sumAux = 0;
        int i;
        boolean flag = true;

        for (i=0;i<3;i++){
            sumAux+=matrix[i][i];
        }
        if (sumAux != sum) {
            flag = false;
        }
        return flag;
    }

    public static boolean checkReverseDiagonal(int [][] matrix, int sum){
        int sumAux = 0;
        int i,j;
        boolean flag = true;

        for(i=0;i<3;i++){
            for (j=0;j<3;j++){
                if(i+j == 2){
                    sumAux+=matrix[i][j];
                }
            }
        }
        if (sumAux != sum) {
            flag = false;
        }
        return flag;
    }

}
