package Arreglos;
import java.util.*;
public class ejer5_5 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int fila, i, j,suma=1,all=0,tot=0;
        System.out.println("Digite el numero de las casillas");
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
           for ( j = 0; j < fila; j++) {
               
           //all=all+matriz1[i][j];
           suma=suma*matriz1[i][i];
           }
           
        } 
       
      /* if (all!=0 ) {
                    System.out.println("no todos los elementos son cero.");
                }
                else{
                  }
                    */
                    if (suma==0) {
                    System.out.println("no es diagonal");
                    }
                    else{
                        System.out.println(" es diagonal");
                    } 
    }
}