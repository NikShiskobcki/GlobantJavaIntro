// Escriba un programa en el cual se ingrese un valor límite positivo,
// y a continuación solicite números al usuario hasta que la suma de los
// números introducidos supere el límite inicial.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un valor limite positivo");
        int limit = read.nextInt();

        int sum = 0;

        while (sum <= limit){
            System.out.println("Ingrese un numero");
            sum += read.nextInt();
        }
    }
}