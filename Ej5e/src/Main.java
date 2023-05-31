//Una obra social tiene tres clases de socios:

//Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos.
//Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
//los mismos tratamientos que los socios del tipo A.
//Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.

//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//real que represente el costo del tratamiento (previo al descuento) y determine el
//importe en efectivo a pagar por dicho socio.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese tipo de socio (A, B o C)");
        char type = read.next().charAt(0);

        System.out.println("Ingrese costo del tratamiento");
        double cost = read.nextDouble();

        switch (type){
            case 'A':
                System.out.println("El costo del tratamiento con el descuento es de "+ cost*0.5);
                break;
            case 'B':
                double aux = cost * 0.35;
                aux = cost - aux;
                System.out.println("El costo del tratamiento con el descuento es de "+aux);
                break;
            case 'C':
                System.out.println("El costo del tratamiento no tiene descuento, por lo tanto el costo es de "+cost );

        }
    }
}