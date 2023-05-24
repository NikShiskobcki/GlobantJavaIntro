//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int correct = 0;
        int incorrect = 0;
        String sequence = "";

        do {
            sequence = read.nextLine();
            if (sequence.length()==5){
                if ((sequence.substring(0,1).equals("X")) && (sequence.substring(4,5).equals("O"))){
                    correct += 1;
                }else{
                    incorrect+=1;
                }
            }else{
                incorrect +=1;
            }

        } while (!sequence.equals("&&&&&"));

        System.out.println("Lecturas correctas: " +correct);
        System.out.println("Lecturas incorrectas: " +(incorrect-1));
    }
}