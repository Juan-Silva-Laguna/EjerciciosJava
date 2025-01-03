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
public class ejer2_23 {
    
    public static void main(String[] args) {
        int t;
        double precio,tot;
        Scanner teclado= new Scanner(System.in);
        System.out.println("dias en el hotel");
        t=teclado.nextInt();
        System.out.println("precio por dia");
        precio=teclado.nextDouble();
        tot=t*precio;
        
        System.out.println("El precio de el estadia durante los "+t+" dias es de "+tot);
       
    }
    
}