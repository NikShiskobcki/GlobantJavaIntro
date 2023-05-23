//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
//
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
//y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
//Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
//desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
//programa, caso contrario se vuelve a mostrar el menú.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un entero");
        int num1 = read.nextInt();
        System.out.println("Ingrese un entero");
        int num2 = read.nextInt();

        int option;
        char confirmation;


        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");

            option = read.nextInt();
            switch(option) {
                case 1:
                    System.out.println("La suma es de " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es de " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es de " + (num1 * num2));
                    break;
                case 4:
                    if (num2==0){
                        System.out.println("La division no es posible entre 0");
                        break;
                    }else {
                        System.out.println("La division es de " + (num1 / num2));
                        break;
                    }
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");

                    confirmation = read.next().charAt(0);

                    if (confirmation=='S'){
                        break;
                    }else if (confirmation=='N'){
                        option=0;
                        break;
                    }else{
                        System.out.println("Opcion no existente");
                        option=0;
                        break;
                    }
            }
        } while (option !=5);

    }
}