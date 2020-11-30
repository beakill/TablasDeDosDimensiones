import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        int num, contador=1,factorial=1;

        System.out.println("Introduce un número: ");
        num= entrada.nextInt();

        while (contador <= num){
            factorial=contador*factorial;
            contador++;
        }
        System.out.println("El factorial del número es: "+factorial);
    }
}
