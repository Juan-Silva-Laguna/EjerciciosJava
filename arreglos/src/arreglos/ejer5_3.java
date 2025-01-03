

package Arreglos;
import java.util.*;
import java.math.*;
import java.io.*;
public class ejer5_3 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int fila, i, j,suma=0;
        System.out.println("Digite el numero de filas");
        fila = teclado.nextInt();


       int matriz1[][] = new int[fila][fila];

       

        for (i = 0; i < fila; i++) {

            for (j = 0; j < fila; j++) {

                System.out.println("Digite el numero para la posición: " +(i+1)+ ", " +(j+1));
                matriz1[i][j] = teclado.nextInt();
            }
            
        }
        System.out.println("La matriz original es:");

        for (i = 0; i < fila; i++) {
            for (j = 0; j < fila; j++) {

                System.out.print("[" + matriz1[i][j] + "]");
            }
                System.out.print("\n");
            
        }
        
       for (i = 0; i < fila; i++) {
        
                suma=suma+matriz1[i][i];
        }
       System.out.println("la suma de la diagonal principal es de"+suma);
    }

}