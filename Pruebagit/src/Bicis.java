import java.util.Scanner;

public class Bicis {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese el numero del tipo de bicicleta: ");
        System.out.println("1. Bicicleta urbana");
        System.out.println("2. Bicicleta de montaña ");
        System.out.println("3. Bicicleta electrica");
        int tipobici = tc.nextInt();

        System.out.println("Ingrese las horas rentadas");
        double horasrent = tc.nextDouble();

        System.out.println("Tiene mebresia (Si/No)");
        String respuesta = tc.next();
        boolean membresia = respuesta.equalsIgnoreCase("si");

        double tarifa = 0;
        String nombre = "";

        switch (tipobici) {
            case 1:
                tarifa = 40;
                nombre = "Urbana";
                break;
            case 2:
                tarifa = 60;
                nombre = "Montaña";
                break;
            case 3:
                tarifa = 90;
                nombre = "Electrica";
                break;
            default:
                System.out.println("Opcion no valida");
        }
        if (tarifa > 0) {
            if (horasrent > 0) {
                double subtotal = tarifa * horasrent;
                double descuento = 0;
                if (membresia) {
                    descuento = subtotal * 0.20;
                }
                    double total = subtotal - descuento;
                    System.out.println("Tipo de bicicleta" + nombre);
                    System.out.println("Subtotal: $" + subtotal);
                    System.out.println("Descuento: $" + descuento);
                    System.out.println("Total a pagar: $" + total);

                } else {
                    System.out.println("Horas no validas");
                }
            }
        }
    }