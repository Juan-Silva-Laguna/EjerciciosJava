

package Arreglos;
import java.util.*;
public class ejer5_18 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i, j;
        int matriz[][] = new int[6][8];
       
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 6; j++) {
                matriz[i][j]=(int) (Math.random()*48-2);
                System.out.print("[" + matriz[i][j] + "]");
            }
                System.out.print("\n");
        } 
        
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 6; j++) {
                if (matriz[i][j]<0) {
                        System.out.println("el negativo esta en la posicion "+(i+1)+","+(j+1));
                    }
                }
                
            }
        }
}