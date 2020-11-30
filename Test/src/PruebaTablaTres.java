import java.util.Scanner;

public class PruebaTablaTres {
    public static void main(String[]args){
        String tabla[]= new String[3];
        Scanner entrada = new Scanner(System.in);

        for (int i=0;i<3;i++){
            System.out.println("Introduce el nombre: ");
            tabla[i]=entrada.nextLine();
        }
        for (int i=2;i>=0;i--){
            System.out.println("Los nombre inversos son: "+tabla[i]);
        }
    }
}
