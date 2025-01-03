
import java.util.*;
import java.math.*;
public class ejer4_6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
    
        double aho,sum=0;
        
        
        for (int mes = 1; mes < 13; mes++) {
            System.out.println("ingrese el ahorro que hizo el mes numero "+mes);
            aho=teclado.nextDouble();
            sum=sum+aho;
        }
        System.out.println("el ahorro durante un año es de $"+sum);
            
    }
}