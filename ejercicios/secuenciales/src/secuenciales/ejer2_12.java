/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;

public class ejer2_12 {
 public static void main(String[] args) {
        double pago, precio, precioDesc, iva, total;
         Scanner teclado=new Scanner(System.in);
        System.out.println("Precio del producto");
        precio=teclado.nextDouble();
        precioDesc=(precio*20)/100;
        precioDesc=precio-precioDesc;
        iva=(precio*15)/100;
        total=(precioDesc+iva);
        System.out.println("el precio con el descuento aplicado es de: "+precioDesc);
        System.out.println("el precio con el descuento e iva aplicado es de: "+total);
    }
}
