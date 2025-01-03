

package Arreglos;
import java.util.*;
public class ejer5_11 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i, j,tot=0,tot2=0;
        
       int matriz1[][] = new int[3][3];
       int matriz2[][] = new int[3][3];
       int vec1[] = new int[3];
       int vec2[] = new int[3];
        System.out.println("MATRIZ 1");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                System.out.println("Digite el numero para la posición: " +(i+1)+ ", " +(j+1));
                matriz1[i][j] = teclado.nextInt();
            }
            
        }
        System.out.println("\n");
        System.out.println("MATRIZ 2");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {

                System.out.println("Digite el numero para la posición: " +(i+1)+ ", " +(j+1));
                matriz2[i][j] = teclado.nextInt();
            }
            
        }
        
        
        System.out.println("       MATRIZ 1:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                System.out.print("[" + matriz1[i][j] + "]");
            }
                System.out.print("\n");
        }
        
        System.out.println("       MATRIZ 2:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                System.out.print("[" + matriz2[i][j] + "]");
            }
                System.out.print("\n");
        }
               
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i==j) {
                    vec1[i]=matriz1[i][j];
                    tot=tot+vec1[i];
                    vec2[i]=matriz2[i][j];
                    tot2=tot2+vec2[i];
                }
                
            }
        }
        
            if (tot==tot2) {
                    System.out.println("Las diagonales son iguales");
                   
                }
                else{
                    System.out.println("las diagonales no son iguales");
                }
        
        
     
      
    }

}