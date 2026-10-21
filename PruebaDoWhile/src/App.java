import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tc = new Scanner (System.in);
        int puntos = 100;
        int opc;

        do {
        System.out.println("Elije una de las siguientes opciones");
        System.out.println("1) Ganar 20 puntos");
        System.out.println("2) Gastar 15 puntos");
        System.out.println("3) Consultar puntos");
        System.out.println("4) Salir");
         opc = tc.nextInt();

        switch (opc) {
            case 1:
                puntos = puntos +20;
                System.out.println("Ganaste 20 puntos");
                break;
            case 2:
                puntos = puntos - 15;
                System.out.println("Gastaste 15 puntos");
                break;
            case 3:
                
                System.out.println("Tus puntos actuales son: "+ puntos);
                break;
           
            default:
                System.out.println("Saliste del juego");
                break;
        }

        } while ( opc != 4);
        
        
    }
}
