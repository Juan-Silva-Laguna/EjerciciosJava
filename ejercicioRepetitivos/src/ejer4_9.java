
import java.util.*;
import java.math.*;
public class ejer4_9 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
          int a,b,c=0,m=1,n;
          System.out.println("hasta cuanto quiere que valla la sucesión de Fibonacci");
          n=teclado.nextInt();
          
          System.out.println("primer elemento para la sucesión de Fibonacci");
          a=teclado.nextInt();
          System.out.println("primer elemento para comenzar la sucesión de Fibonacci");
          b=teclado.nextInt();
          
          System.out.println("la sucesion Fibonacci es la sigiente:");
          System.out.println(a);
          System.out.println(b);
          
          while(m<=(n-2)){
              c=a+b;
              System.out.println(c);
              a=b;
              b=c;
              m=m+1;
          }
          
    }
}