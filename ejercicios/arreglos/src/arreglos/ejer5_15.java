

package Arreglos;
import java.util.*;
public class ejer5_15 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i, j,acum=0,neg=0;
        
       int matriz[][] = new int[5][6];
       
        
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 6; j++) {
                matriz[i][j]=(int) Math.floor(Math.random()*100-50);
                System.out.print("[" + matriz[i][j] + "]");
            }
                System.out.print("\n");
        }       
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 6; j++) {
                if (i==j) {
                    if (matriz[i][j]==0) {
                        acum=acum+1;
                    }
                }
                if (matriz[i][j]<0) {
                    neg=neg+1;
                }
            }
        }

        System.out.println("Los elementos negativoos en la matris son: "+neg);

        System.out.println("los elementos iguales a cero en la diagonal de la matriz son "+acum);
      }

}