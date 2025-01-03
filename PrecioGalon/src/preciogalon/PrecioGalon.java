/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preciogalon;

import java.util.*;
import java.math.*;
public class PrecioGalon {

    public static void main(String[] args) {
     int l;
     double  pg, tg, ga;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar la cantidad de litros que produce");
        l=teclado.nextInt();
        System.out.println("Ingresar el precio del galon");
        pg=teclado.nextDouble();
        tg=l/3.785;
        ga=pg*tg;
        
         System.out.println("el precio de los galones de leche en litros es de: "+ga);
    }
    
}
