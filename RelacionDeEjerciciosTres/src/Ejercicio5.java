import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int num, i=1;

        System.out.println("Introduce un número: ");
        num=entrada.nextInt();
        System.out.print("Los números son:");
        while (i < num){
            System.out.print("  " +i+ " ");
            i++;
        }
        System.out.print(" " +num);
    }
}
