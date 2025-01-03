

package Arreglos;
import java.util.*;
public class ejer5_19 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,j,c,r,sumc=0,sumr=0;
        System.out.println("el nuemro de filas y columans debe ser el mismo para que sume las columnas");
        System.out.print("\n");
        System.out.println("de cuantas columnas desea la matriz");
        c=teclado.nextInt();
        System.out.println("de cuantos renglones desea la matriz");
        r=teclado.nextInt();
        int matriz[][] = new int[r][c];
        int vec1[]= new int[r];
        int vec2[] = new int[c];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                matriz[i][j]=(int) (Math.random()*5);
                System.out.print("[" + matriz[i][j] + "]");
            }
                System.out.print("\n");
        } 
        System.out.print("\n");
        
        for (i = 0; i < r; i++) {
            sumr=0;
            for (j = 0; j < c; j++) {
                if (j<c) {
                    sumr=sumr+matriz[i][j];
                }  
            }
            vec1[i]=sumr;
        }
        System.out.println("\n");
        
        System.out.println("vector 1 suma de renglones");
            for (i = 0; i < r; i++) {
                System.out.print("["+vec1[i]+"]");
            }
           System.out.println("\n");
        for (i = 0; i < r; i++) {
            sumc=0;
            for (j = 0; j < c; j++) {
                if(j<c){
                    sumc=sumc+matriz[j][i]; 
                }            
            }
         vec2[i]=sumc;
        }
           System.out.println("vector 2 suma de columnas");
            for (i = 0; i < r; i++) {
                System.out.print("["+vec2[i]+"]");
            }
            System.out.println("\n");
        }
}