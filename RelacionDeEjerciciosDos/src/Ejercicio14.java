import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número, porfavor:");
        num = entrada.nextInt();
        int decenas = num / 10;
        int unidades = num % 10;

        switch (decenas) {
            case 1: {
                switch (unidades) {
                    case 0: {
                        System.out.print("Diez");
                        break;
                    }
                    case 1: {
                        System.out.print("Once");
                        break;
                    }
                    case 2: {
                        System.out.print("Doce");
                        break;
                    }
                    case 3: {
                        System.out.print("Trece");
                        break;
                    }
                    case 4: {
                        System.out.print("Catorce");
                        break;
                    }
                    case 5: {
                        System.out.print("Quince");
                        break;
                    }
                    case 6: {
                        System.out.print("Dieciseis");
                        break;
                    }
                    case 7: {
                        System.out.print("Diecisiete");
                        break;
                    }
                    case 8: {
                        System.out.print("Dieciocho");
                        break;
                    }
                    case 9: {
                        System.out.print("Diecinueve");
                        break;
                    }
                }
                break;
            }
            case 2: {
                if (unidades == 0) {
                    System.out.print("veinte");
                    break;
                } else {
                    System.out.print("veinti");
                    break;
                }

            }
            case 3: {
                System.out.print("treinta");
                break;
            }
            case 4: {
                System.out.print("cuarenta");
                break;
            }
            case 5: {
                System.out.print("cincuenta");
                break;
            }
            case 6: {
                System.out.print("sesenta");
                break;
            }
            case 7: {
                System.out.print("setenta");
                break;
            }
            case 8: {
                System.out.print("ochenta");
                break;
            }
            case 9: {
                System.out.print("noventa");
                break;
            }
        }
        if (unidades != 0 && decenas > 2) {
            System.out.print(" y ");
        }
        if (unidades != 2 && unidades != 1 && unidades != 0 && decenas > 2) {
            switch (unidades) {
                case 0: {
                        System.out.println("cero");
                        break;
                }
                case 1: {
                    System.out.println("uno");
                    break;
                }
                case 2: {
                    System.out.println("dos");
                    break;
                }
                case 3: {
                    System.out.println("tres");
                    break;
                }
                case 4: {
                    System.out.println("cuatro");
                    break;
                }
                case 5: {
                    System.out.println("cinco");
                    break;
                }
                case 6: {
                    System.out.println("seis");
                    break;
                }
                case 7: {
                    System.out.println("siete");
                    break;
                }
                case 8: {
                    System.out.println("ocho");
                    break;
                }
                case 9: {
                    System.out.println("nueve");
                    break;
                }
            }
        }
    }
}

