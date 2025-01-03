/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.*;
import java.math.*;
public class ejer2_6 {
        public static void main(String[] args) {
        double h, a, b;
         Scanner teclado=new Scanner(System.in);
        System.out.println("ingresar el valor de cateto opuesto");
        a=teclado.nextDouble();
        System.out.println("ingresar el valor de cateto adyacente");
        b=teclado.nextDouble();
        h=Math.sqrt((Math.pow(a, 2))+(Math.pow(b, 2)));
        System.out.println("la hipotenusa del triangulo rectangulo es de: "+h);
    }
}