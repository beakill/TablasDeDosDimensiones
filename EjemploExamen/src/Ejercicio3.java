import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int mes=0,numDias=0;
        int numPiezas=0;
        int diaMasPieza=0, maxPiezas=0;
        int minPiezas=1001;
        int totalPiezas=0;
        boolean menos300Piezas=false;

        System.out.print("Introduce el mes: ");
        mes=entrada.nextInt();

        switch (mes){
            case 2:{
                numDias=28;
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                numDias=31;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:{
                numDias=30;
                break;
            }
        }
        for (int i=1; i<=numDias;i++){
            System.out.println("Introduce el número de piezas");
            numPiezas=entrada.nextInt();
            if (numPiezas>1000){
                System.out.println("Error! No se puede fabricar mas de 1000 piezas en un dia");
                System.out.println("Introduce el número de piezas");
                numPiezas=entrada.nextInt();
            }
            if (numPiezas>maxPiezas){
                maxPiezas=numPiezas;
                diaMasPieza=i;
            }
            if (numPiezas<minPiezas){
                minPiezas=numPiezas;
            }
            totalPiezas=totalPiezas+numPiezas;
            if (numPiezas<=300){
                menos300Piezas=true;
            }

        }
        System.out.println("El dia que mas pieza se fabricaron fue: "+diaMasPieza);
        System.out.println("El minimo de piezas fabricadas es: "+minPiezas);
        System.out.println("El numero total de piezas fabricados es: "+totalPiezas);
        if (menos300Piezas==true){
            System.out.println("Existen dias por debajo del minimo");
        }

    }
}
