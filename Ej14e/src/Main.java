//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str="";
        int families;

        System.out.println("Ingrese cantidad de familias");
        families = read.nextInt();

        for (int i=1;i<=families;i++){
            str= askKids(str,i);
        }
        System.out.println(str);
    }

    public static String askKids(String str, int fam){
        Scanner read = new Scanner(System.in);
        int kids, age, i,sum;
        double avg;
        System.out.println("Ingrese cantidad de hijos de la familia "+fam);
        kids= read.nextInt();
        sum=0;
        for (i=1;i<=kids;i++){
            System.out.println("Ingrese edad del hijo "+i);
            age = read.nextInt();
            sum+=age;
        }
        avg=sum/kids;
        str = str +"\r\n";
        str = str +"\r\n"+ "Familia "+ fam +"\r\n"+"Hijos: "+kids+"\r\n"+"Promedio de edad: "+avg;
        return str;
    }
}