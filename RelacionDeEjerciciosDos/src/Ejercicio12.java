import java.util.Scanner;

public class Ejercicio12 {
        public static void main (String[]args){
            int dia, mes, año;
            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce el día");
            dia = entrada.nextInt();

            System.out.println("Introduce el mes");
            mes = entrada.nextInt();

            System.out.println("Introduce el año");
            año = entrada.nextInt();

            if (dia==30){
                mes++;
                dia=1;
            }else {
                dia++;
            }
            if(mes >= 12){
                año++;
                mes=1;
            }
                System.out.println("El dia siguiente es: " +dia+"/"+mes+"/"+año);


        }
    }