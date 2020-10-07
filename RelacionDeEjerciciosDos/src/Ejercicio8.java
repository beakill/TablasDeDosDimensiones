import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args){
        int numUno, numDos, numTres;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        numUno = entrada.nextInt();

        System.out.println("Introduce el segundo número");
        numDos = entrada.nextInt();

        System.out.println("Introduce el tercer número");
        numTres = entrada.nextInt();

        if( numUno < numDos && numUno < numTres ){
            if (numDos < numTres)
                System.out.println("Los números ordenados de menor a mayor son: " + numUno + ", " + numDos + ", " + numTres);
            else{
                System.out.println("Los números ordenados de menor a mayor son: "+numUno+ ", "+numTres+", "+numDos);
            }
        }
        if (numDos < numUno && numDos < numTres){
            if (numUno < numTres){
                System.out.println("Los números ordenados de menor a mayor son: "+numDos+ ", "+numUno+", "+numTres);
            }
            else{
                System.out.println("Los números ordenados de menor a mayor son: "+numDos+ ", "+numTres+", "+numUno);
            }
        }
        if (numTres < numDos && numTres < numDos){
            if (numUno < numDos){
                System.out.println("Los números ordenados de menor a mayor son: "+numTres+ ", "+numUno+", "+numDos);
            }
            else{
                System.out.println("Los números ordenados de menor a mayor son: "+numTres+ ", "+numDos+", "+numUno);
            }
        }
    }
}
