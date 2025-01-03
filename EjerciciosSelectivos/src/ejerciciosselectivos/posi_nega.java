/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;
import java.util.*;
import java.math.*;
public class posi_nega {
    public static void main(String[] args) {
    
        double n,p,t;
         Scanner teclado=new Scanner(System.in);
        System.out.println("ingesar numero entero");
        t=teclado.nextDouble();
        
        if(t<0)
            {
                System.out.println("el numero ingresado esnegativo");
            }
        else
            {
                System.out.println("el numero ingresado positivo");
            }
  
    }
}
