import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        String contraseñaUsuario="";
        String contraseñaAdivinar="osama";


        System.out.println("Introduce la contraseña:");
        contraseñaUsuario= entrada.nextLine();


        while(contraseñaUsuario.equals(contraseñaAdivinar)==false){
            System.out.println("Contraseña Incorrecta!");
            System.out.println("Introduce la contraseña:");
            contraseñaUsuario= entrada.nextLine();
        }
        System.out.println("Has adivinado la contraseña!");
    }
}
