import javax.swing.*;

public class EjercicioUno {
    public static void main (String [] args){
        //declaraciones
        String codigo="";
        int numVehiculos=0;
        String matricula="";
        char combustible=' ';
        int cilindradaVehiculo=0;
        int kilometros=0;
        float mediaCilindrada=0F;
        float mayorMediaCilindrada=0F;
        String codigoMayorCilindradaMedia="";
        int menorCilindrda=100000000;
        String matriMenorCilindrada="";
        float mediaKilometros=0F;
        int contadorSucursales=0;
        int contadorGasolina=0;
        int contadorDiesel=0;
        int contadorMasGasolina=0;

        //pedimos el codidgo de la sucursal
        codigo= JOptionPane.showInputDialog("Introduce el codigo: ");
        //se ejecuta el bucle mientras el codigo sea distinto de "fin"
        while (!codigo.equalsIgnoreCase("fin")){
            numVehiculos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de vehiculos: "));
            for (int i=0; i<numVehiculos;i++){
                //pedir datos
                matricula=JOptionPane.showInputDialog("Introduce la matricula: ");
                combustible=JOptionPane.showInputDialog("Introduce el tipo de combustible: ").toUpperCase().charAt(0);
                cilindradaVehiculo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cilindrada del vehiculo: "));
                kilometros=Integer.parseInt(JOptionPane.showInputDialog("Introduce los kilometros"));
                //sumamos las cilindradas para despues (fuera del for) sacar la media
                mediaCilindrada=mediaCilindrada+cilindradaVehiculo;
                //sumamos todos los kilometros para despues (fuera del for) sacar la media
                mediaKilometros=kilometros+mediaKilometros;
                //comprobamos si en la variable combustible se ha introducido una "G"
                if (combustible=='G'){
                    //sumamos uno a la variable contadorGasolina
                    contadorGasolina++;
                    if (cilindradaVehiculo<menorCilindrda){
                        menorCilindrda=cilindradaVehiculo;
                        matriMenorCilindrada=matricula;
                    }
                }else{
                    contadorDiesel++;
                }

            }
            //medias
            mediaCilindrada=(float)mediaCilindrada/numVehiculos;
            mediaKilometros=(float)mediaKilometros/numVehiculos;
            //comprobaciones
            if (mediaCilindrada>mayorMediaCilindrada){
                mayorMediaCilindrada=mediaCilindrada;
                codigoMayorCilindradaMedia=codigo;
            }
            if (numVehiculos>3 && mediaKilometros > 70000){                contadorSucursales++;
            }
            if (contadorGasolina>contadorDiesel){
                contadorMasGasolina++;
            }
            //reinicio de variables
            mediaCilindrada=0;
            mediaKilometros=0;
            contadorDiesel=0;
            contadorGasolina=0;
            //volver a pedir el codigo de la sucursal
            codigo= JOptionPane.showInputDialog("Introduce el codigo: ");
        }
        //Mostrar datos
        JOptionPane.showMessageDialog(null,"La sucursal con mayor media de cilindrada es: "+codigoMayorCilindradaMedia+" con una media de "+mayorMediaCilindrada);
        JOptionPane.showMessageDialog(null, "La matricula del coche con menor cilindrada es: "+matriMenorCilindrada);
        JOptionPane.showMessageDialog(null,"En " +contadorSucursales+ " sucursales con mas de 3 vehiculos y una media de kilometraje superior a  70.000Km");
        JOptionPane.showMessageDialog(null, "En " +contadorMasGasolina+ " sucursales hay mas vehiculos de gasolina que de diesel ");
    }
}
