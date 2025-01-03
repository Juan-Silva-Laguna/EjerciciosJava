package Arreglos;
import java.util.*;
public class ejer5_20 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,j,tot=1,total;
        
        int matriz[][] = new int[5][5];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                matriz[i][j]=(int) (Math.random()*5);
                System.out.print("[" + matriz[i][j] + "]");
            }
                System.out.print("\n");
        } 
        System.out.print("\n");
        
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (i==j) {
                    tot=tot*matriz[i][j];
                }  
            }
        }
        System.out.println("la multpilcacion de la diagonal es "+tot);
            
        
        }
}