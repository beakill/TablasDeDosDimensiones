import java.util.Scanner;

public class TablaDelTres {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int tabla[]= new int[101];
        for(int i =0; i<=100;i++){
            tabla[i]=3*i;
        }
        System.out.println("-------Tabla del tres-------");
        for (int i=0;i<=100;i++){
            System.out.println("3 x "+i+" = "+tabla[i]);
        }
    }
}
