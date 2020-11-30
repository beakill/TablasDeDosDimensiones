import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int num, contador=0,numNegativos=0;

        while(contador<30){
            System.out.println("Introduce un numero");
            num= entrada.nextInt();
            if (num<0){
                numNegativos++;
            }
            contador++;
        }
        if (numNegativos>0){
            System.out.println("Si se han intrducido numeros negativos");
        }else {
            System.out.println("No se han introducido números negativos");
        }
    }

}
