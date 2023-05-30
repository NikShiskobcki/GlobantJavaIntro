//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje.


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean flag=false;
        
        System.out.println("Ingrese un caracter");
        char crt = read.next().charAt(0);

        for (int i=0;i<4;i++){
            if (crt==vowels[i]){
                flag=true;
            }
        }

        if (flag){
            System.out.println("El caracter "+crt+" es vocal");
        } else {
            System.out.println("El caracter "+crt+" no es vocal");
        }
    }
}