public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Descangando carpeta comprimida");

        double totalTiempo = CalcularTiempo(-600, 15);
        if (totalTiempo < 0) {
            System.out.println("La descarga no se puede completar");
        }else{
            System.out.println("Tiempo estimado de descarga: "+totalTiempo+" sec.");
        }
        
    }

    static double CalcularTiempo(int megas, int megasxsegundo){

        if (megas < 0) {
            System.out.println("Datos invalidos");
        }else{

            System.out.println("Peso del archivo: "+megas+" MB");
            System.out.println("Velocidad de descarga estimada: "+megasxsegundo+" MB/s");
            
        }
        
        double totalTiempo = megas / megasxsegundo;
        return totalTiempo;
    }
}
