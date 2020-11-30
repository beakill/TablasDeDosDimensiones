import sun.management.snmp.jvmmib.EnumJvmClassesVerboseLevel;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String cuentaEmail="",codigoArticulo="",premium="",codigoArticuloMayorPrecio="";
        int unidadesCompradas=0,contadorClientes=0,contadorPremium=0,contadorArticulo=0;
        float unidadPrecio=0,porcentajePremium=0,totalDinero=0,mayorGastado=0,mayorprecio=0;
        boolean esPremium=false, mayorGastadoPremium=false;

        do {
            System.out.println("Introduce el email del cliente: ");
            cuentaEmail=entrada.next();
            if (!cuentaEmail.equals("fin")){
                contadorClientes++;
                System.out.println("¿Es premium el cliente?");
                premium=entrada.next();
                if (premium.equals("S")){
                    contadorPremium++;
                    esPremium=true;
                }else{
                    esPremium=false;
                }
                do {
                    System.out.println("Introduce el codigo del articulo: ");
                    codigoArticulo = entrada.next();
                    if (!codigoArticulo.equals("fin")) {
                        contadorArticulo++;
                        System.out.println("Introduce las unidades compradas: ");
                        unidadesCompradas = entrada.nextInt();
                        System.out.println("Introduce el precio de la unidad: ");
                        unidadPrecio = entrada.nextFloat();
                        totalDinero=(unidadesCompradas*unidadPrecio)+totalDinero;

                    }
                }while (!codigoArticulo.equals("fin"));
                if (totalDinero>mayorGastado){
                    mayorGastado=totalDinero;
                    if (esPremium==true){
                        mayorGastadoPremium=true;
                    }else{
                        mayorGastadoPremium=false;
                    }
                }
                if (contadorArticulo==1){
                    if (unidadPrecio>mayorprecio){
                        mayorprecio=unidadPrecio;
                        codigoArticuloMayorPrecio=codigoArticulo;

                    }
                }

            }
        }while(!cuentaEmail.equals("fin"));
        porcentajePremium=((float) contadorPremium/contadorClientes)*100;
        System.out.println("El porcentaje de clientes premium es: "+porcentajePremium+"%");
        if (mayorGastadoPremium==true){
            System.out.println("El cliente que ms dinero ha gastado ha sido: Premium");
        }else {
            System.out.println("El cliente que ms dinero ha gastado ha sido: Normal");
        }
        System.out.println("El  codigo articulo unico comprado de mayor precio es: "+codigoArticuloMayorPrecio);

    }
}
