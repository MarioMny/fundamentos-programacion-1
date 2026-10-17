import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);

        System.out.println("Ingrese la bateria de el dron:  ");
        int power = tc.nextInt();
        int min=0;
    
        while (power >= 7) {
            min++;
            power -=7;
            System.out.println("Minuto:"+ min+" Bateria: "+power+"%");
        }
        
    }
}
