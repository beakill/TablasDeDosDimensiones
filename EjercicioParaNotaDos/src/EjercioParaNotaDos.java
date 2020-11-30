import java.util.Arrays;
import java.util.Scanner;

public class EjercioParaNotaDos {
    public static final int TAMAÑO =20;
    public static void main (String[] args){
        int tabla[]=new int[TAMAÑO];
        int temporal=0;
        Scanner entrada = new Scanner(System.in);

        for (int i=0;i<TAMAÑO;i++){
            System.out.println("Introduce el valor de la posicion: "+i);
            tabla[i]=entrada.nextInt();
        }
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 1; j < (TAMAÑO - i); j++) {
                if (tabla[j - 1] > tabla[j]) {
                    temporal = tabla[j - 1];
                    tabla[j - 1] = tabla[j];
                    tabla[j] = temporal;
                }
            }
        }
        //muestra el contenido del array entero
        System.out.println(Arrays.toString(tabla));
    }

}

