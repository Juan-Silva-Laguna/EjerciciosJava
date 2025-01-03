

package Arreglos;
import java.util.*;
public class ejer5_8 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,num,j;
        System.out.println("cuantas posiciones tiene el vector:");
        num=teclado.nextInt();
        
       int vec1[]= new int [num];
       int vec2[]= new int [num];
       
        for (i = 0; i < num; i++) {
           
            System.out.println("ingrese posicion "+(i+1));
                vec1[i]=teclado.nextInt();
                
            }
        System.out.println("el vector que usted ingreso es");
        for (i = 0; i < num; i++) {
                System.out.print(" ["+vec1[i]+"] ");
         }
         
        for (i = 0; i < num-1; i++) {
          
            for ( j = 1; j < 2; j++) {
             if (i<j) {
             vec2[0]=vec1[num-1];
             }
                vec2[j]=vec1[i];
                j=j--;    
            } 
        }
        System.out.println("\n");        
        System.out.println("el segundo vector quedaria asi:");
        System.out.print(" ["+vec2[0]+"] ");
         for (i = 0; i < num-1; i++) {
          for ( j = 1; j < 2; j++) {
              vec2[j]=vec1[i];
                System.out.print(" ["+vec2[j]+"] ");   
            } 
        }
     }
}