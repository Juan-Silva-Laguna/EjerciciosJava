/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.*;
import java.math.*;
public class ejer2_8 {
    public static void main(String[] args) {
        double h, a, b;
         Scanner teclado=new Scanner(System.in);
        System.out.println("costo por km");
        a=teclado.nextDouble();
        System.out.println("km rrecorrido");
        b=teclado.nextDouble();
        h=(a*b);
        System.out.println("el costo del boelto es: "+h);
    }
    
}
