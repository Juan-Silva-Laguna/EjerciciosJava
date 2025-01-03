

package Arreglos;
import java.util.*;
public class ejer5_2 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int fila, columna, i, j;
        System.out.println("Digite el numero de filas");
        fila = teclado.nextInt();

        System.out.println("Digite el numero de columnas");

        columna = teclado.nextInt();

       int matriz1[][] = new int[fila][columna];
        int producto;
        int matriz2[][] = new int[columna][fila];

       

        for (i = 0; i < fila; i++) {

            for (j = 0; j < columna; j++) {

                System.out.println("Digite el numero para la posición: " +(i+1)+ ", " +(j+1));
                matriz1[i][j] = teclado.nextInt();
            }
            
        }
        for (i = 0; i < fila; i++) {

            for (j = 0; j < columna; j++) {

                System.out.println("Digite el numero para la posición: " +(i+1)+ ", " +(j+1));
                matriz2[i][j] = teclado.nextInt();
            }
            
        }
       for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++) {
                producto=matriz1[i][j]*matriz2[i][j];
                System.out.println(producto);
            }
            
        }

    }

   

}