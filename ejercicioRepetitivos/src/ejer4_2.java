
import java.util.*;
import java.math.*;
public class ejer4_2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       int c=1;
        double va,su=0;
        
        do{
            System.out.println("valor por sumar?");
            va=teclado.nextInt();
            su=su+va;
            c=c+1;
            System.out.println(su);
        }
        while(c<10);
        
    }
}