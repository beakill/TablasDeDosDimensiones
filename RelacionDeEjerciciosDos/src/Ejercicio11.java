import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String [] args){
        int dia,mes,año;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el día");
        dia = entrada.nextInt();

        System.out.println("Introduce el mes");
        mes = entrada.nextInt();

        System.out.println("Introduce el año");
        año = entrada.nextInt();

        if(dia > 0 && dia <= 31){
            if (mes > 0 && mes <= 12){
                System.out.println("La fecha introducida es: "+dia+"/"+mes+"/"+año);
            }else{
                System.out.println("El mes introducido no es correcto");
            }
        }else {
            System.out.println("El día introducido no es correcto");
        }
    }
}
