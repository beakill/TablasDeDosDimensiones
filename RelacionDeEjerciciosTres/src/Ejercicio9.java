public class Ejercicio9 {
    public static void main (String[]args){
        int num=1,contador=0,multiplicacion=1;
        System.out.print("Los números impares son: ");
        while(contador<10){
            if(num%2!=0){
                System.out.print(" "+num+" ");
                multiplicacion=num*multiplicacion;
                contador++;
            }
                num++;

        }
        System.out.println("La multiplicación es: "+multiplicacion);
    }
}
