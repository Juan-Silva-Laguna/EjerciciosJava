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
public class ejer2_9 {
public static void main(String[] args) {
        double t, c, costo;
         Scanner teclado=new Scanner(System.in);
        System.out.println("minutos de la llamada");
        t=teclado.nextDouble();
        System.out.println("costo por minuto");
        c=teclado.nextDouble();
        costo=(t*c);
        System.out.println("el costo de la llamda es de: "+costo);
    }
    
}