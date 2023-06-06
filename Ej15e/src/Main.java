//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//matemática y deben devolver sus resultados para imprimirlos en el main.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char option;
        int num1, num2;
        int ans;
        System.out.println("Ingrese un numero");
        num1 = read.nextInt();

        System.out.println("Ingrese otro numero");
        num2 = read.nextInt();

        System.out.println("Ingrese la operacion deseada (s -> suma, r -> resta, m -> multiplicacion, d -> division )");
        option = read.next().charAt(0);

        switch (option){
            case 's':
                ans = sum(num1,num2);
                System.out.println(num1+" + "+num2+" = "+ans);
                break;
            case 'r':
                ans = substraction(num1,num2);
                System.out.println(num1+" - "+num2+" = "+ans);
                break;
            case 'm':
                ans = multiplication(num1,num2);
                System.out.println(num1+" * "+num2+" = "+ans);
                break;
            case 'd':
                if (num2==0){
                    System.out.println("No se puede dividir entre 0");
                }else{
                    double ansD =division(num1,num2);
                    System.out.println(num1+" / "+num2+" = "+ansD);
                    break;
                }
        }
    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static int substraction(int num1, int num2){
        return num1-num2;
    }
    public static int multiplication(int num1, int num2){
        return num1*num2;
    }
    public static double division(int num1, int num2){
        return num1/num2;
    }
}