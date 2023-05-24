//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese cantidad en euros");
        double val = read.nextDouble();

        System.out.println("Ingrese moneda a convertir (dolar, yen o libra)");
        String currency = read.next();

        change(val, currency);
    }

    public static void change(double val, String currency) {
        currency = currency.toLowerCase();
        switch (currency){
            case "dolar":
                System.out.println(val+"€ son "+(val*1.28611)+"US$");
                break;
            case "libra":
                System.out.println(val+"€ son "+(val*0.86)+"libras");
                break;
            case "yen":
                System.out.println(val+"€ son "+(val*129.852)+"yen");
                break;
            default:
                System.out.println("Moneda no valida");
        }
    }
}