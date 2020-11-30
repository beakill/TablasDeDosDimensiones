import java.util.Scanner;

public class Ejercicio16 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int edad, mediaEdad=0,contadorAlturaMayores180=0,contadorAlumnosMayoresEdad=0,contadorAlumnos=0;
        float altura,mediaAltura=0;

        do {
            System.out.println("Introduce la edad");
            edad = entrada.nextInt();
            mediaEdad=edad+mediaEdad;
            System.out.println("Introduce la altura");
            altura = entrada.nextFloat();
            mediaAltura=altura+mediaAltura;
            if (altura>1.80f){
                contadorAlturaMayores180++;
            }
            if (edad>=18){
                contadorAlumnosMayoresEdad++;
            }
            contadorAlumnos++;

        }while (contadorAlumnos<30);
        mediaEdad=mediaEdad/30;
        mediaAltura=mediaAltura/30;

        System.out.println("La media de edad es: "+mediaEdad);
        System.out.println("Hay "+contadorAlumnosMayoresEdad+" alumno/s mayor/es de edad");
        System.out.println("La media de altura es: "+mediaAltura);
        System.out.println("Hay "+contadorAlturaMayores180+" alumno/s mayor/es de 1.80cm");
    }
}
