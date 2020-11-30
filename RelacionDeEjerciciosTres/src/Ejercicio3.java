import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int num, contador=0;

        do {
            System.out.println("Introduce un número: ");
            num= entrada.nextInt();
            contador++;
        }while (num>0);
        System.out.println("Se han introducido un total de "+contador+" numeros");
    }
}
