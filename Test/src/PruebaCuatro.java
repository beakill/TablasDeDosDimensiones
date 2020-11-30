import java.util.Scanner;

public class PruebaCuatro {
    public static final int TAMAÑO =10;
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[TAMAÑO];
        int numMayor=0;
        for (int i =0; i<TAMAÑO;i++){
            System.out.println("Introduce el numero: ");
            tabla[i]= entrada.nextInt();
            if (tabla[i]>numMayor){
                numMayor=tabla[i];
            }
        }
        System.out.println("El numero mayor introducido es: "+numMayor);

    }
}
