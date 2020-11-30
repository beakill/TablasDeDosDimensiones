import java.util.Scanner;

public class TestUno {
    public static void main (String[]args){
        int tabla[];
        int n=0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos numeros vas a introducir: ");
        n= entrada.nextInt();
        tabla=new int[n];
        for (int i=0; i<n;i++){
            System.out.println("Introduce el valor: ");
            tabla[i]=entrada.nextInt();
        }
        for (int i=0; i<n;i++){
            System.out.println("La posicion "+i+ " vale "+tabla[i]);
        }

    }
}
