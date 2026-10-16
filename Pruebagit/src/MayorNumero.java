import java.util.Scanner;
public class MayorNumero{
    public static void main(String [] args){
        Scanner tc = new Scanner(System.in);
       System.out.println("Ingresa el piso en el que te encuentras: ");
       int num1 = tc.nextInt();
       System.out.println("Ingresa el piso al que deseas ir: ");
        int num2 = tc.nextInt();
        System.out.println("--------------");
        if (num2==0) {
        System.out.println("No puedes ingresar un 0 ");
        }else if (num2 == num1) {
        System.out.println("No puedes ir al mismo piso ");
        }else if (num2 > 10){
            System.out.println("El limite es 10");
        }else {
             while (num1 < num2) {
            num1++;
            System.out.println("Estas en el piso: "+num1);
            
        }
        while (num1 > num2) {
            num1--;
            System.out.println("Estas en el piso: "+ num1);
        }
        } 
    }          
    }

    
    
