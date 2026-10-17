import java.util.Scanner;

public class App {
public static void main(String[] args) throws Exception {
    Scanner tc = new Scanner(System.in);

    System.out.println("Ingrese la bateria de el dron: ");
        int bateria = tc.nextInt();
        int minutos=0;
    System.out.println("-----------------------");
        if (bateria==0) {
            System.out.println("El Dron no puede volar");
        }else
        while (bateria >= 7) {
            minutos++;
            bateria -=7;
            System.out.println(" Minuto:"+ minutos+" "+bateria+"%");
        }
            System.out.println("El don ya no puede dar una vuelta mas");

}
}