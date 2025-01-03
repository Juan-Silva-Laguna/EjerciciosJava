

package Arreglos;
import java.util.*;
public class ejer5_13 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,j;
        double sum1=0,prom,acum=0;
       double cal[]= new double [100];
       System.out.print("Calificaciones: ");
        for (i = 0; i < 100; i++) {
            cal[i]=Math.floor(Math.random()*10);
            System.out.print("["+cal[i]+"] ");
        }
        System.out.println("\n");
        for (i = 0; i < 100; i++) {
            sum1=sum1+cal[i];
        }
        prom=sum1/100;
        System.out.println("el promedio del grupo es de : "+prom);
        for (i = 0; i < 100; i++) {
            if (cal[i]>prom) {
                acum=acum+1;
            }
        }
        System.out.println("hay "+acum+" calificaciones superiores a el promedio de el grupo");
     }
}