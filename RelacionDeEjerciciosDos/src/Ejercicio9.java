import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[] args){
        int numUno,numCaracteres;
        String cadena;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número");
        numUno = entrada.nextInt();

        cadena = Integer.toString(numUno);
        if (numUno > 0) {
            numCaracteres = cadena.length();
            System.out.println("El número introducido "+numUno+ " tiene "+numCaracteres+ " cifra/s");
        } else {
            System.out.println("El número no es positivo");
        }
    }
}
