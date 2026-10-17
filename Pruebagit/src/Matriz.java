import java.util.Scanner;
public class Matriz{
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        System.out.println("Este es un programa hecho especialmente para resolover matrices");
        System.out.println("| a  c |");
        System.out.println("| b  d |");
        System.out.println("Ingresa los datos para A, B , C y D");
        System.out.printf("Valor de A: ");
            double a = tc.nextDouble();
        System.out.printf("Valor de B: ");
            double b = tc.nextDouble();
        System.out.printf("Valor de C: ");
            double c = tc.nextDouble();
        System.out.printf("Valor de D: ");
            double d = tc.nextDouble();
        System.out.println("   ");
        System.out.println(" La matriz que ingresaste fue : ");
                System.out.println("| "+a +"   "+ c+ " |");
                System.out.println("| "+b +"   "+ d+ " |");
                    System.out.println("   ");
            double v1 = (a * d);
            double v2 = (b * c); 
            double detA = v1 - v2 ;
        System.out.println("Paso 1: Multiplicamos "+ a + " x "+  d );
        System.out.println("El resultado es: "+ v1);
                    System.out.println("   ");
        System.out.println("Paso 2: Multiplicamos "+ b + " x "+  c );
        System.out.println("El resultado es: "+ v2);
                    System.out.println("   ");
        System.out.println("Paso 3: Restamos el resultado de (ad) - (bc) ");
        System.out.println("El resultado es: "+ detA);
                    System.out.println("   ");
    }
}