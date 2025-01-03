
import java.util.*;
import java.math.*;
public class ejer4_13 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double p=5.00,t=0;
        
        for (int i = 1; i <= 20; i++) {
            p=p*2;
            System.out.println("pago mensual es: "+p);
            t=t+p;
                     
        }  
        
        System.out.println("el pago totl es: "+t);
    }
}
