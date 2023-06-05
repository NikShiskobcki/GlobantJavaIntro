//Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
//usuario al comenzar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = read.nextInt();

        int i, cont,x;
        cont = 0;
        i=1;
        while (cont<num){
            cont++;
            for (x=1;x<=cont;x++){
                System.out.print(x);
            }
            System.out.println("");
        }
    }
}