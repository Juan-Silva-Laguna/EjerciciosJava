

package Arreglos;


import java.util.*;

import java.math.*;

import java.io.*;

 

public class ejer5_1 {

    public static void main(String[] args) {

       

        Scanner teclado = new Scanner(System.in);

        int fila, columna, i, j;

        

        System.out.println("Digite el numero de filas");

        fila = teclado.nextInt();

        System.out.println("Digite el numero de columnas");

        columna = teclado.nextInt();

       

        int matrizOriginal[][] = new int[fila][columna];

        int matrizTranspuesta[][] = new int[columna][fila];

       

        for (i = 0; i < fila; i++) {

            for (j = 0; j < columna; j++) {

                System.out.println("Digite el numero para la posición: " + i + ", " + j);

                matrizOriginal[i][j] = teclado.nextInt();

                matrizTranspuesta[j][i] = matrizOriginal[i][j];

            }

        }

       

        System.out.println("La matriz original es:");

        for (i = 0; i < fila; i++) {

            for (j = 0; j < columna; j++) {

                System.out.print("[" + matrizOriginal[i][j] + "]");

                if(j == (columna - 1)){

                    System.out.print("\n");

                }

            }

        }

       

        System.out.println("La matriz transpuesta es:");

        for (i = 0; i < fila; i++) {

            for (j = 0; j < columna; j++) {

                System.out.print("[" + matrizTranspuesta[i][j] + "]");

                if(j == (columna - 1)){

                    System.out.print("\n");

                }

            }

        }

       

    }

   

}