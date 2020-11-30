import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int num,suma=0;

        do {
            System.out.println("Introduce un número: ");
            num= entrada.nextInt();
            suma=num+suma;
        }while(num!=0);
        System.out.println("El resultado de la suma es: "+suma);
    }

}
