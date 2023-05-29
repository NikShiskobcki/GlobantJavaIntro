//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{0, 2, 4}, {-2, 0, 3}, {-4, -3, 0}};
        int[][] aux = new int[3][3];

        aux = transposeMatrix(matrix);

        printMatrix(matrix);
        System.out.println("");
        printMatrix(aux);

        if (checkAntisymmetry(matrix, aux)){
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

    public static int[][] transposeMatrix(int [][] matrix){
        int [][] aux = new int[3][3];

        int i;
        int j;
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                aux[i][j] = matrix[j][i];
            }
        }
        return aux;
    }

    public static void printMatrix(int [][] matrix){
        Random random = new Random();
        int i, j;

        for (i=0; i<3;i++){
            for (j=0;j<3;j++){
                System.out.print("[ "+matrix[i][j]+" ] ");
            }
            System.out.println("");
        }
    }

    public static boolean checkAntisymmetry(int [][] matrix, int [][] aux){
        int i,j;
        boolean flag=true;
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                if (matrix[i][j]==(aux[i][j]*-1)){
                    flag = true;
                } else {
                    flag =false;
                    break;
                }

            }
        }
        return flag;
    }
}