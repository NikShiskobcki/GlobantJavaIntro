//Simular la división usando solamente restas. Dados dos números enteros mayores que
//uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
//Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
//resultado es el residuo, y el número de restas realizadas es el cociente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int dividendo, divisor, resto, cociente;
        cociente = 0;

        System.out.println("Ingrese dividendo");
        dividendo= read.nextInt();
        System.out.println("Ingrese divisor");
        divisor= read.nextInt();
        resto = dividendo;

        while(resto>=divisor){
            resto-=divisor;
            cociente++;
        }

        System.out.println(dividendo+" / "+divisor+" = "+cociente);
        System.out.println("Resto: "+resto);
    }
}