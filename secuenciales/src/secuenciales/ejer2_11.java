/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;

public class ejer2_11 {
    public static void main(String[] args) {
        double pago, cantidad, precio;
         Scanner teclado=new Scanner(System.in);
        System.out.println("cantidad de kw consumidos");
        cantidad=teclado.nextDouble();
        System.out.println("precio por kw");
        precio=teclado.nextDouble();
        pago=(cantidad*precio);
        System.out.println("el costo de los kw consumidos es de: "+pago);
    }
}
