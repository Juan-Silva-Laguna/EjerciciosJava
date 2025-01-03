/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagom3;

import java.util.*;
import java.math.*;
public class Pagom3 {

    public static void main(String[] args) {
     double a, l, n, cm, v, pag;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar la altura de la alberca");
        a=teclado.nextDouble();
        System.out.println("Ingresar el largo de la alberca");
        l=teclado.nextDouble();
        System.out.println("Ingresar el ancho de la alberca");
        n=teclado.nextDouble();
             
        v=(a*l*n);
        System.out.println("la alberca tiene un volumen de: "+v);
        System.out.println("Ahora Ingresar el precio del metro cubico");
        cm=teclado.nextDouble();
        pag=v*cm;
        System.out.println("el precio por el consumo es de: "+pag);
         
    }
    
}