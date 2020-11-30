import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int dia, mes, año;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el día");
        dia = entrada.nextInt();

        System.out.println("Introduce el mes");
        mes = entrada.nextInt();

        System.out.println("Introduce el año");
        año = entrada.nextInt();

        if (mes > 0 && mes <= 12) {
            if (dia<1||dia>31){
                System.out.println("La fecha introducida no es correcta");
            }else {
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 ||mes==10|| mes == 12) && dia <= 31) {
                    System.out.println("La fecha es correcta : " + dia + "/" + mes + "/" + año);
                } else {
                    if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                        System.out.println("La fecha es correcta : " + dia + "/" + mes + "/" + año);
                    } else {
                        if (año % 4 == 0 && mes == 2 && dia <= 29 ) {
                            System.out.println("La fecha es correcta : " + dia + "/" + mes + "/" + año);
                        } else {
                            if (mes == 2 && dia <= 28 ) {
                                System.out.println("La fecha es correcta : " + dia + "/" + mes + "/" + año);
                            } else {
                                System.out.println("La fecha introducida no es correcta");
                            }
                        }

                    }
                }
            }

        }else {
            System.out.println("La fecha introducida no es correcta");
        }
    }
}
