import java.util.Scanner;

public class SistemaAcademico {
    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Ingrese su calificacion final: ");
        System.out.println("Ejemplo: '100'");
        double cali = tc.nextDouble();
        System.out.println("Ingrese el porcentaje de asistencias: ");
        System.out.println("Ejemplo: '100'");
        int asis = tc.nextInt();

        if(cali >= 70 && asis >= 80){
            System.out.println("Aprobado regular");
        } else if (asis <= 79){
            System.out.println("Reprobado por calificacion");
        }else if(cali <= 69) {
            System.out.println("Reprobado por calificacion");
        }
    }
    
}
