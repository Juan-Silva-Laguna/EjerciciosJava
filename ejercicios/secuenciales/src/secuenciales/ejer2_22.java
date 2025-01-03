/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;

public class ejer2_22 {
    
    public static void main(String[] args) {
        int t;
        double precio,tot;
        Scanner teclado= new Scanner(System.in);
        System.out.println("cuantos minutos tardo la llamada");
        t=teclado.nextInt();
        System.out.println("precio por minuto");
        precio=teclado.nextDouble();
        tot=t*precio;
        
        System.out.println("La llamada tiene un precio de "+tot);
       
    }
    
}