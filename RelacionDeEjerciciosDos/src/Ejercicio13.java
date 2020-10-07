import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String[] args){
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la nota: ");
        num= entrada.nextInt();

        if (num==0){
            System.out.println("Cero");
        }else {
            if (num==1){
                System.out.println("Uno");
            }else{
                if (num==2){
                    System.out.println("Dos");
                }else{
                    if (num==3){
                        System.out.println("Tres");
                    }else{
                        if (num==4){
                            System.out.println("Cuatro");
                        }else {
                            if (num==5){
                                System.out.println("Cinco");
                            }else{
                                if (num==6){
                                    System.out.println("Seis");
                                }else{
                                    if (num==7){
                                        System.out.println("Siete");
                                    }else{
                                        if (num==8){
                                            System.out.println("Ocho");
                                        }else{
                                            if (num==9){
                                                System.out.println("Nueve");
                                            }else{
                                                if (num==10){
                                                    System.out.println("Diez");
                                                }else{
                                                    System.out.println("No ha introducido una nota válida");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}
