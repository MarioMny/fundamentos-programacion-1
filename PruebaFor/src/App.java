import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Gears of War");
        int contador =0;
        double promedioPuntos = 0;
        int partidasmayor1000=0;
        int partidasmenor1000=0;
       
        for (int i=1; i<8;i++){
            System.out.println("Ingresa los puntos obtenidos en partida "+i+": ");
             int puntos = tc.nextInt();

            contador+=puntos;
            promedioPuntos= (double)puntos / i;
           if (puntos >= 10){
            partidasmayor1000++;

           }else{
            partidasmenor1000++;
           }
        }
            System.out.println("----------------------");
            System.out.println("  ");
            System.out.println("Puntos Acumulados: "+contador);
            System.out.println("Promedio de puntos: "+df.format(promedioPuntos));
            System.out.println("Partidas con mas del 1000 puntos: "+ partidasmayor1000);
            System.out.println("Partidas con menos del 1000 puntos: "+ partidasmenor1000);

    }
}
