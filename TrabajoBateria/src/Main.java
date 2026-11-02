import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int opc = 1;
        while (opc == 1) {
            System.out.println("Ingrese porcentaje de bateria: ");
            int porcentaje = tc.nextInt();

            while (porcentaje < 0 || porcentaje > 100) {
                System.out.println("Porcentaje invalido.");
                porcentaje = tc.nextInt();
            }

            int minutos = calcularMinutos(porcentaje);
            System.out.println("Minutos necesarios para cargar: " + minutos);

            System.out.println("¿Desea iniciar otra carga?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opc = tc.nextInt();
        }
    }

    static int calcularMinutos(int porcentajeInicial) {
        int minutos = 0;
        while (porcentajeInicial < 100) {
            porcentajeInicial += 8;
            minutos += 1;
        }
        return minutos;
    }
}