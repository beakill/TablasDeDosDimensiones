import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        char tipoArbol;
        int edad=0,diametro=0,altura=0,numArboles=0,mediaAltura=0,mediaEdad=0;
        int alturaMaxima=0,alturaMinima=10000;
        int diametroMaximo=0, diametroMinimo=10000;
        int contadorTipoB=0;
        boolean arbolMayor30=false;

        System.out.println("¿Cuantos arboles vas a introducir? ");
        numArboles=entrada.nextInt();

        for (int i=0;i<numArboles;i++){
            System.out.print("Que tipo de arbol vas a utilizar: ");
            tipoArbol=entrada.next().toUpperCase().charAt(0);

            if (tipoArbol=='A'){
                System.out.println("Introduce el diametro: ");
                diametro= entrada.nextInt();
                System.out.println("Introduce la altura:");
                altura= entrada.nextInt();

            }else {
                System.out.println("Introduce el diametro: ");
                diametro= entrada.nextInt();
                System.out.println("Introduce la altura:");
                altura= entrada.nextInt();
                System.out.println("Introduce la edad: ");
                edad= entrada.nextInt();
                contadorTipoB++;
                mediaEdad=mediaEdad+edad;
            }
            mediaAltura=mediaAltura+altura;
            if(altura>alturaMaxima){
                alturaMaxima=altura;
            }
            if (altura<alturaMinima){
                alturaMinima=altura;
            }
            if (diametro>diametroMaximo){
                diametroMaximo=diametro;
            }
            if (diametro<diametroMinimo){
                diametroMinimo=diametro;
            }
            if (altura>30){
                arbolMayor30=true;
            }

        }
        mediaAltura=mediaAltura/numArboles;
        System.out.println("La media de altura de los arboles es: "+mediaAltura);
        System.out.println("La altura maxima es: "+alturaMaxima);
        System.out.println("La altura minima es: "+alturaMinima);
        System.out.println("El diametro máximo es: "+diametroMaximo);
        System.out.println("El diametro minimo es: "+diametroMinimo);
        mediaEdad=mediaEdad/contadorTipoB;
        System.out.println("La media de la edad es: "+mediaEdad);
        if (arbolMayor30==true){
            System.out.println("Existen arboles de mas de 30m");
        }

    }
}
