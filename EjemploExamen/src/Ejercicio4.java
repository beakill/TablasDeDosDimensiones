import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int region=0, numProvincia=0;
        String nombreRegion="";
        int numVotosA=0, numVotosB=0, numAbstenciones=0;

        System.out.println("Introduce la region: ");
        region= entrada.nextInt();

        switch (region){
            case 1:{
                numProvincia=10;
                break;
            }
            case 2:{
                numProvincia=4;
                break;
            }
            case 3:{
                numProvincia=6;
                break;
            }
            case 4:{
                numProvincia=1;
                break;
            }
        }
        for (int i =0;i<numProvincia;i++){
            System.out.println("Introduce el nombre de la provincia");
            nombreRegion= entrada.next();
            System.out.println("Introduce los votos del partido A");
            numVotosA= entrada.nextInt();
            System.out.println("Introduce los votos del partido B");
            numVotosB= entrada.nextInt();
            System.out.println("Introduce el numero de abstenciones");
            numAbstenciones= entrada.nextInt();

        }
    }

}
