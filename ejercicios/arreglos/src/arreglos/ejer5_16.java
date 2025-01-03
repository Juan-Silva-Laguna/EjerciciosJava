

package Arreglos;
import java.util.*;
public class ejer5_16 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,j;
       
       int vec1[]= new int [10];
       int vec2[]= new int [10];
       int vec3[]= new int [10];
       System.out.print("Vector 1: ");
        for (i = 0; i < 10; i++) {
            vec1[i]=(int) (Math.random()*10);
            System.out.print("["+vec1[i]+"] ");
        }
       System.out.println("\n");
        
        System.out.println("Vector 2: ");
        for (i = 0; i < 10; i++) {
            vec2[i]=(int) (Math.random()*10);
            System.out.println("       ["+vec2[i]+"] ");
        }
        System.out.println("\n");
        System.out.println("Los productos de los elementos de el vector 1 y 2 son: ");
        for (i = 0; i < 10; i++) {
            vec3[i]=vec1[i]*vec2[i];
            System.out.print("["+vec3[i]+"] ");
        }
       
     }
}