//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double minutes, days, hours;

        System.out.println("Ingrese los minutos");
        minutes = read.nextInt();

        days = round((minutes/60)/24);
        hours = ((minutes/60)-(24*days));

        System.out.println(hours);

        System.out.println(round(days)+" dias, "+round(floor(hours))+" horas");
    }
}