import java.util.Scanner;
public class Teclado {
    
    public static void main(String [] args){
        Scanner escribir = new Scanner(System.in);
        System.out.println("ingrese edad");
        int edad = escribir.nextInt();
        System.out.println("la edad es "+ edad);
        System.out.println("muchas gracias");
    }
    
}
