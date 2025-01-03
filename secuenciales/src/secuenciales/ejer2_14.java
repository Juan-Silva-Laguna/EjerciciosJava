/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;

public class ejer2_14 {
    public static void main(String[] args) {
        double monto, dias;
         Scanner teclado=new Scanner(System.in);
        System.out.println("Dias que transcurre en monterrey?");
        dias=teclado.nextDouble();
        monto=(dias*100.000);
     
        System.out.println("el ahorro anual es de: "+monto);
    }
}
