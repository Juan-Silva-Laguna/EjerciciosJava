/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejer2_10 {
  public static void main(String[] args) {
        double pago, m3, costom3;
         Scanner teclado=new Scanner(System.in);
        System.out.println("cuantos metros cubicos consume el cliente");
        m3=teclado.nextDouble();
        System.out.println("precio por metro cubico");
        costom3=teclado.nextDouble();
        pago=(m3*costom3);
        System.out.println("el costo de los metros cubicos que consume el cliente es de: "+pago);
    }
    
}