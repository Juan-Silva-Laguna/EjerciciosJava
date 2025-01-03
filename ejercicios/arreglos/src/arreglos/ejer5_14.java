

package Arreglos;
import java.util.*;
public class ejer5_14 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,j;
        double sum1=0,prom,acum=0;
       double ele[]= new double [100];
       System.out.print("100 elementos -> ");
        for (i = 0; i < 100; i++) {
            ele[i]=Math.floor(Math.random()*100);
            System.out.print("["+ele[i]+"] ");
        }
        System.out.println("\n");
        for (i = 0; i < 100; i++) {
            sum1=sum1+ele[i];
        }
       
        System.out.println("la magnitud de el vector es de "+sum1);
     }
}