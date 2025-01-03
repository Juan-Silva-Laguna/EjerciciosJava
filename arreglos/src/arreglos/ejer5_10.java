

package Arreglos;
import java.util.*;
public class ejer5_10 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,j;
        double sum1=0, sum2=0,tot=0;
       double vec1[]= new double [100];
       double vec2[]= new double [100];
       System.out.print("Vector 1: ");
        for (i = 0; i < 100; i++) {
            vec1[i]=Math.random()*150-100;
            System.out.print("["+(int)vec1[i]+"] ");
        }
        System.out.println("\n");
        
        System.out.print("Vector 2: ");
        for (i = 0; i < 100; i++) {
            vec2[i]=Math.random()*150-100;
            System.out.print("["+(int)vec2[i]+"] ");
        }
        
        for (i = 0; i < 100; i++) {
            sum1=sum1+vec1[i];
            sum2=sum2+vec2[i];
            tot=sum1+sum2;
        }
        System.out.println("\n");
        System.out.println("la suma de el vector 1 es: "+(int)sum1);
        System.out.println("la suma de el vector 2 es: "+(int)sum2);
        System.out.println("la suma de el vector total es: "+(int)tot);
     }
}