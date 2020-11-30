import javax.swing.*;

public class Actividad {
    public static void main(String[] args){
        int n=0;
        String palabra="",maxPalabra1="",maxPalabra2="",maxPalabra3="";

        do {
            palabra=JOptionPane.showInputDialog(null,"Introduce una palabra: ");
            n=palabra.length();
            if (!palabra.equals("fin")) {
                if (n > maxPalabra1.length()) {
                    maxPalabra3=maxPalabra2;
                    maxPalabra2=maxPalabra1;
                    maxPalabra1 = palabra;
                } else if (n > maxPalabra2.length()) {
                    maxPalabra3=maxPalabra2;
                    maxPalabra2 = palabra;
                } else if (n > maxPalabra3.length()) {
                    maxPalabra3 = palabra;
                }
            }
        }while(!palabra.equals("fin"));
        JOptionPane.showMessageDialog(null,"Las palabras mas largas son: "+maxPalabra1+", "+maxPalabra2+" y "+maxPalabra3);


    }
}
