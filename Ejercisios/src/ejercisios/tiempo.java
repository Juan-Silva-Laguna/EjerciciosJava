/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisios;

import java.util.*;
import java.math.*;
public class tiempo {
     public static void main(String[] args) {
        double t, v, d;
         Scanner teclado=new Scanner(System.in);
        System.out.println("velocidad constante");
        v=teclado.nextDouble();
        System.out.println("distancia");
        d=teclado.nextDouble();
        t=(d/v);
        System.out.println("el tiempo de una ciudad a otra es de: "+t+" horas");
    }
    
}
