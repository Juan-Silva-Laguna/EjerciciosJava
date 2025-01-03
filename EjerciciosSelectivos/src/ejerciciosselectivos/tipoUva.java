/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;
import java.util.*;
import java.math.*;
public class tipoUva {
    public static void main(String[] args) {
        String ti;
        double ta, k, p, ga;
       
         Scanner teclado=new Scanner(System.in);
        System.out.println("ingresar tipo de la uva");
        ti=teclado.next();
        
        
        
        
                
        if(ti.contentEquals("A"))
            {   
            System.out.println("ingresar tamaño de la uva");
            ta=teclado.nextDouble();
            System.out.println("ingresar precio de la uva");
            p=teclado.nextDouble();
                if(ta==1)
                {
                    p=p+0.20;
                }
                else        
                {
                    p=p+0.30;
                } 
            }
        else
            {
            System.out.println("ingresar tamaño de la uva");
            ta=teclado.nextDouble();
            System.out.println("ingresar precio de la uva");
            p=teclado.nextDouble();
                if(ta==1)
                {
                    p=p-0.30;
                }
                else        
                {
                    p=p-0.50;
                } 
            }
        System.out.println("ingresar kilos de produccion");
        k=teclado.nextDouble();
        ga=p*k;
        System.out.println("la ganacias es de:"+ ga);
      
      
    }
}
