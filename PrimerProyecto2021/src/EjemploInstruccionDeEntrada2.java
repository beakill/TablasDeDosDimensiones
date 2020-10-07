import javax.swing.*;

public class EjemploInstruccionDeEntrada2 {
    public static void main(String[]args){
        String edadCadena;
        edadCadena= JOptionPane.showInputDialog("Introduzca su edad");

        // tengo la edad introducida en edadCadena
        //por ejemplo, de la forma "24"
        //la convierto a numero entero, y la coloco en la variable edad

        int edad = Integer.parseInt(edadCadena);
        JOptionPane.showMessageDialog(null,"El año que viene tendrás: " +(edad+1));
    }
}
