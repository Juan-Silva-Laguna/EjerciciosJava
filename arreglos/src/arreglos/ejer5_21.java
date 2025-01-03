package Arreglos;
import java.util.*;
public class ejer5_21 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,j,par=0,imp=0;
        
        int matriz[][] = new int[5][5];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                matriz[i][j]=(int) (Math.random()*10);
                System.out.print("[" + matriz[i][j] + "]");
            }
                System.out.print("\n");
        } 
        System.out.print("\n");
        
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (matriz[i][j]%2==0) {
                    par=par+1;
                }
                else{
                    imp=imp+1;
                }
            }
        }
        System.out.println("numeros pares "+par);
        System.out.println("numeros impares "+imp);    
        
        }
}