import java.util.Scanner;

public class PruebaCinco {
    public static final int TAMAÑO =10;
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        int t[] = new int[TAMAÑO];
        for (int i =0;i<TAMAÑO;i++){
            System.out.println("Introduce el numero: ");
            t[i]=entrada.nextInt();
        }
        for (int i=1; i<TAMAÑO;i+=2){
                System.out.println(t[i]);
        }
    }
}
