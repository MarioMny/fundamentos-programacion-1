import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        System.out.println("Renta de Camaras de Video.");
        System.out.println("------------");
        System.out.println("");

        System.out.println("Ingresa la tarifa por hora rentada: ");
        double tarifa = tc.nextDouble();
        System.out.println("");

        System.out.println("Ingresa las horas que deseas rentar las camaras: ");
        int horas = tc.nextInt();
        System.out.println("");

        if (tarifa  <= 0 || horas <= 0){

            System.out.println("Datos invalidos");
        }else{
            
            double total = calcularRenta(tarifa, horas);
            mostrarComprobante(total, tarifa, horas);
        }
    }
    static double calcularRenta(double tarifa, int horas){
        double total = tarifa*horas;
        return total;
    }
    static void mostrarComprobante(double total, double tarifa, int horas){
        System.out.println("TICKET");
        System.out.println("--------------------");
        System.out.println("Tarifa a cobrar: "+tarifa);
        System.out.println("Horas que desea rentar: "+horas);
        System.out.println("El total a pagar es de: "+ total);

    }
}
