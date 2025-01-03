/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areapoligono;

import java.util.*;
import java.math.*;
public class AreaPoligono {


     public static void main(String[] args) {
     double r, h, c, at, ac, pi=3.1416, A;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar la base del triangulo rectangulo y radio");
        r=teclado.nextDouble();
        System.out.println("Ingresar la hipotenusa del triangulo rectamgulo");
        h=teclado.nextDouble();
        System.out.println("Ingresar la altura del rectangulo");
        c=teclado.nextDouble();
        
        c=Math.sqrt((h*h)-(r*r));
        at=2*(r*c)/2;
        ac=pi*Math.pow(r, 2)/2;
        A=at+ac;
        
         System.out.println("el area del poligono es: "+A);
    }
    
}
