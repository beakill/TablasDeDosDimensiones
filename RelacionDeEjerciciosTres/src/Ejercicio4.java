import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int numParaAdivinar= (int) (Math.random()*100), numUsuario;

        System.out.println("Adivina el número: ");
        numUsuario= entrada.nextInt();

        while(numUsuario!=numParaAdivinar){
            if (numUsuario>numParaAdivinar){
                System.out.println("No has adivinado el número, el numero introducido es mayor, vuelve a intentarlo: ");
                numUsuario= entrada.nextInt();
            }else{
                System.out.println("No has adivinado el número, el numero introducido es menor, vuelve a intentarlo: ");
                numUsuario= entrada.nextInt();
            }
        }
        System.out.println("Has adivinado el número!");
    }
}
