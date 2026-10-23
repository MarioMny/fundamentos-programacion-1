import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception {
    Scanner tc = new Scanner(System.in);
    int cantAutos = 0;
    int cantDescuentos =0;
    int fondosR = 0;
    System.out.println("Estacionamiento!");
    System.out.println(" --------------------------   ");

    System.out.println("Horas que estuvo el automovil estacionado: ");
    int horas = tc.nextInt();
    int costot = horas*15;
        if (horas<=0){
            System.out.println("Tipo de horas invalidas");
        }else{
                while (horas != 0) {
                    cantAutos++;
                    
                    if (horas <= 5){
 
                        System.out.println("Costo total por hora: $15");
                        System.out.println(" 'Sin descuento' ");
                        System.out.println("costo total: "+ costot);
 
                    }else {
                        cantDescuentos++;
                        System.out.println("Costo total por hora: $15");
                        System.out.println("Obtuviste un descpuesto de 10 pesos por pasar mas de 5 horas");
                        costot=(horas * 15)-10; 
                        System.out.println("Costo total "+costot);
 
                    }
                    
                    fondosR=fondosR+costot;
                    System.out.println(" --------------------------   ");

                    System.out.println("Horas que estuvo el automovil estacionado: ");
                    horas = tc.nextInt();
                }       
                
            }
                double promedio = fondosR/(double)cantAutos;
                System.out.println("Total de autos atendidos: "+ cantAutos);
                System.out.println("Total de descuentos aplicados: "+ cantDescuentos);
                System.out.println("Total de dinero recaudado: "+fondosR);
                System.out.println("Promedio de ingreso: "+promedio);
                System.out.println(" --------------------------   ");
        //Cierre void
    }
    //cierre class main
}  
