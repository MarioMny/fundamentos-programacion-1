public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Envio de Paquetes");
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("Paquete 1");
        mostrarEtiqueta(402, "Corona Acapulco", 2.0);
        System.out.println("");
        System.out.println("Paquete 2");
        mostrarEtiqueta(403, "Corona Cuernavaca", 2.5);
    }

    static void mostrarEtiqueta(int  numGuia, String destino, double peso ){
        System.out.println("Etiqueta del paquete: ");
        System.out.println("Numero de Guia: "+ numGuia);
        System.out.println("Lugar de destino: "+ destino);
        System.out.println("Peso total del paquete: "+ peso+"kg");
    }
}
