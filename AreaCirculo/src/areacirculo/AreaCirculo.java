/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirculo;

import java.util.*;
import java.math.*;
public class AreaCirculo {

    public static void main(String[] args) {
     double a, r, pi=3.1416;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el radio");
        r=teclado.nextDouble();
        System.out.println("Ingrese segunda nota");
       a=pi*(r*r);
        System.out.println("el area de la circunferencia es: "+a);
    }
    
}
