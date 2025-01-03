/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;

import java.util.*;
import java.math.*;
public class pagoAlmacen {
    public static void main(String[] args) {
    
        double precio, total, otros;
         Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese el precio de lo que va a llevar");
        precio=teclado.nextDouble();
        
        if(precio>2500)
            {
                otros=precio*0.15;
                System.out.println("se le realizo un descuento de 15% eso seria igual a:"+otros);
                total=precio-otros;
                System.out.println("total a pagar: "+total);
            }
        else
            {
                otros=precio*0.08;
                System.out.println("se le realizo un descuento de 8% eso seria igual a:"+otros);
                total=precio-otros;
                System.out.println("total a pagar: "+total);
            }
    
    }
}
