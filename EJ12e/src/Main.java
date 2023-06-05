//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
//0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.

public class Main {
    public static void main(String[] args) {
        int x,y,z;
        String sX, sY, sZ;
        for (x=0;x<=9;x++){
            for (y=0;y<=9;y++){
                for (z=0;z<=9;z++){

                    if (x==3){
                        sX="E";
                    }else{
                        sX=Integer.toString(x);
                    }

                    if (y==3){
                        sY="E";
                    }else{
                        sY=Integer.toString(y);
                    }

                    if (z==3){
                        sZ="E";
                    }else{
                        sZ=Integer.toString(z);
                    }

                    System.out.println(sX+"-"+sY+"-"+sZ);
                }

            }

        }

    }
}