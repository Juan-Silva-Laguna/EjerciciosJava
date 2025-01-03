
import java.util.*;
import java.math.*;
public class ejer4_3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       
        double va,su=0;
        for (int c = 0; c < 10; c++) {
            System.out.println("valor por sumar?");
            va=teclado.nextInt();
            su=su+va;
            
            System.out.println(su);
        }
        
    }
}