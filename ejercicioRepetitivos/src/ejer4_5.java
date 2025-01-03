
import java.util.*;
import java.math.*;
public class ejer4_5 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
    
        double pr;
        int es,su=0,c=0;
        System.out.println("estatura de la persona");
        es=teclado.nextInt();
        while(es>0){
            
            su=su+es;
            System.out.println("estatura de cada persona");
            es=teclado.nextInt();
            c=c+1;
         }
         if(c==0) {
            System.out.println("no hay estatura");
        }
        else{
        pr=su/c;
        System.out.println("la estatura promedio es: "+pr);
        }
            
    }
}