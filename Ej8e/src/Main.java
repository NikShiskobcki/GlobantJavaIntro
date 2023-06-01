//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
//la cantidad de números impares. Al igual que en el ejercicio anterior los números
//negativos no deben sumarse.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int even, uneven, cant, num;
        even = 0;
        uneven = 0;
        cant = 0;
        do {
            do {
                System.out.println("Ingrese un numero mayor que 0");
                num = read.nextInt();
            }while (num<0);
            if (num%2==0){
                even++;
            }else{
                uneven++;
            }
            cant++;

        }while (num%5!=0);

        System.out.println("Cantidad de numeros leidos: "+cant);
        System.out.println("Cantidad de numeros pares leidos: "+even);
        System.out.println("Cantidad de numeros impares leidos: "+uneven);
    }
}