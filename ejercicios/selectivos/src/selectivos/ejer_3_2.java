/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_2 {
    public static void main(String[] args) {
    double h, ph, saldo,tot,hrs,total;
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("Cuantas horas a trabajado");
        h=teclado.nextDouble();
        System.out.println("Precio por hora");
        ph=teclado.nextDouble();
        
        if(h>40)
            {
                hrs=(h-40)*2;
                saldo=ph*hrs;
                tot=hrs+40;
                total=tot*ph;
                System.out.println("trabajar mas de 40 horas, se hace un doble pago de: "+saldo);
                System.out.println("su sueldo segun las horas trabajadas con paaga doble es de: "+total);
            }
        else
            {
                total=ph*h;
                System.out.println("su sueldo segun las horas trabajadas es de: "+total);
                
            }
        
        
    }
}
