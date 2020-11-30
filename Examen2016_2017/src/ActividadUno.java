import javax.swing.*;

public class ActividadUno {
    public static void main (String [] args){
        int numProvincias=0;
        String nombreProvincia="";
        String nombreLocalidad="";
        int numHabitantes=0;
        float extension=0F;
        char juzgados=' ';
        float mediaMunicipios=0F;
        float mediaMaxMediaMunicipios=0F;
        String nombreProvinciaMaxMedia="";
        int contadorExtensiones=0;
        String maxHabitantes1="";
        String maxHabitantes2="";
        String maxHabitantes3="";
        int maxNumHabitantes1=0;
        int maxNumHabitantes2=0;
        int maxNumHabitantes3=0;
        int contadorLocalidades=0;
        boolean menosDeTres=false;
        float densidad=0F;
        float menorDensidad=100000000000000000000F;
        String localidadMenorDensidad="";
        int contadorJuzgados=0;
        float porcentajeJuzgados=0F;
        float mayorPorcentajeJuzgados=0F;
        String provinciaMayorJuzgado="";

        numProvincias=Integer.parseInt(JOptionPane.showInputDialog("Introduce el num de provincias"));

        for (int i=0;i<numProvincias;i++){
            nombreProvincia=JOptionPane.showInputDialog("Introduce el nombre de la provincia");
            nombreLocalidad=JOptionPane.showInputDialog("Introduce el nombre de la localidad");
            while (!nombreLocalidad.equalsIgnoreCase("fin")) {
                contadorExtensiones++;
                contadorLocalidades++;
                numHabitantes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de habitantes"));
                extension = Float.parseFloat(JOptionPane.showInputDialog("Introduce la extension"));
                juzgados = JOptionPane.showInputDialog("Tiene juzgado: ").toUpperCase().charAt(0);
                mediaMunicipios = (float)mediaMunicipios + extension;
                if (numHabitantes>maxNumHabitantes1){
                    maxNumHabitantes3=maxNumHabitantes2;
                    maxNumHabitantes2=maxNumHabitantes1;
                    maxNumHabitantes1=numHabitantes;

                    maxHabitantes3=maxHabitantes2;
                    maxHabitantes2=maxHabitantes1;
                    maxHabitantes1=nombreLocalidad;
                }else if (numHabitantes>maxNumHabitantes2){
                    maxNumHabitantes3=maxNumHabitantes2;
                    maxNumHabitantes2=numHabitantes;

                    maxHabitantes3=maxHabitantes2;
                    maxHabitantes2=nombreLocalidad;

                }else if (numHabitantes>maxNumHabitantes3){
                    maxNumHabitantes3=numHabitantes;

                    maxHabitantes3=nombreLocalidad;
                }
                densidad=(float)numHabitantes/extension;
                if (densidad<menorDensidad){
                    menorDensidad=densidad;
                    localidadMenorDensidad=nombreLocalidad;
                }
                if (juzgados=='S'){
                    contadorJuzgados++;
                }
                nombreLocalidad = JOptionPane.showInputDialog("Introduce el nombre de la localidad");

            }
            mediaMunicipios=(float)mediaMunicipios/contadorExtensiones;
            if (mediaMunicipios>mediaMaxMediaMunicipios){
                mediaMaxMediaMunicipios=mediaMunicipios;
                nombreProvinciaMaxMedia=nombreProvincia;
            }
            if (contadorExtensiones<3){
                menosDeTres=true;
            }
            porcentajeJuzgados=(float)(contadorJuzgados/contadorExtensiones)*100;
            if (porcentajeJuzgados>mayorPorcentajeJuzgados){
                mayorPorcentajeJuzgados=porcentajeJuzgados;
                provinciaMayorJuzgado=nombreProvincia;
            }
            contadorExtensiones=0;
            mediaMunicipios=0;
            contadorJuzgados=0;
        }

        JOptionPane.showMessageDialog(null,"La provincia con mayor externsion media es: "+nombreProvinciaMaxMedia);
        JOptionPane.showMessageDialog(null,"Las tres localidades con mas habitantes son: "+maxHabitantes1+", "+maxHabitantes2+" y "+maxHabitantes3);
        JOptionPane.showMessageDialog(null,"La media de localidades es: "+(float)contadorLocalidades/numProvincias);
        if (menosDeTres==true) {
            JOptionPane.showMessageDialog(null, "Hay provincias con menos de tres localidades");
        }
        JOptionPane.showMessageDialog(null, "La localidad con menor densidad es: "+localidadMenorDensidad);
        JOptionPane.showMessageDialog(null,"La provincia con mayor porcentaje de juzgados es:  "+mayorPorcentajeJuzgados);

    }
}
