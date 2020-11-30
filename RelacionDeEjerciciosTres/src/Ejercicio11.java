import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int num,media=0, contador=0;

        do {
            System.out.println("Introduce un número: ");
            num = entrada.nextInt();
            if (num>=0) {
                media = num + media;
                contador++;
            }
        }while (num>=0);
        media=media/contador;
        System.out.println("La media de los numeros introducidos es: "+media);
    }
}
