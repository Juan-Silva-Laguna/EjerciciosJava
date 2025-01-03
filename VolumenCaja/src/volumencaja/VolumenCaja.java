/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumencaja;

import java.util.*;
import java.math.*;
public class VolumenCaja {

    public static void main(String[] args) {
        double a, b, c, v;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("Ingresar el valor de A");
        a=teclado.nextDouble();
        System.out.println("Ingresar el valor de B");
        b=teclado.nextDouble();
        System.out.println("Ingresar el valor de C");
        c=teclado.nextDouble();
        System.out.println("El volumen de la caja dimencional es: "+(a*b*c));
    }
    
}
