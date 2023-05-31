//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
//de n números (n>0). El valor de n se solicitará al principio del programa y los números
//serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//bucle “while” y otra con el bucle “do - while”.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese cantidad de numeros");
        int n = read.nextInt();

        System.out.println("Ingrese version: 1(while) o 2(do-while)");
        int op = read.nextInt();

        if(op==1){
            version1(n);
        }else{
            version2(n);
        }
    }

    public static void version1(int n){
        Scanner read = new Scanner(System.in);
        int max,min,i,x;
        double avg;
        System.out.println("Ingrese un numero");
        x = read.nextInt();
        max = x;
        min = x;
        i=1;
        avg=x;
        while (i<n){
            System.out.println("Ingrese un numero");
            x = read.nextInt();
            if(x<min){
                min = x;
            }
            if (x>max){
                max = x;
            }
            avg += x;
            i++;
        }
        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);
        System.out.println("Promedio: "+(avg/n));
    }

    public static void version2(int n){
        Scanner read = new Scanner(System.in);
        int max,min,i,x;
        double avg=0;
        i=0;
        max=0;min=0;
        do {
            System.out.println("Ingrese un numero");
            x = read.nextInt();
            if((i==0)||(x<min)){
                min = x;
            }
            if ((i==0)||(x>max)){
                max = x;
            }
            avg += x;
            i++;
        }while (i<n);
        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);
        System.out.println("Promedio: "+(avg/n));
    }
}