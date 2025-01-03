

package Arreglos;
import java.util.*;
public class ejer5_12 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i, j,neg=0;
        
       int matriz1[][] = new int[19][12];
       

       

        for (i = 0; i < matriz1.length; i++) {

            for (j = 0; j < matriz1.length; j++) {

                System.out.println("Digite el numero para la posición: " +(i+1)+ ", " +(j+1));
                matriz1[i][j] = teclado.nextInt();
            }
            
        }
        
        System.out.println("La matriz original es:");

        for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz1.length; j++) {

                System.out.print("[" + matriz1[i][j] + "]");
            }
                System.out.print("\n");
            
        }
               
        
        System.out.println("la matriz quedaria asi:");
       for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz1.length; j++) {

                if (matriz1[i][j]<0) {
                    neg=neg+1;
                    matriz1[i][j]=0;
                }
                System.out.print("[" + matriz1[i][j] + "]");
                
            }   
                System.out.print("\n");
            
        }
       System.out.println("hay "+neg+" numeros negativos");
     
      
    }

}