/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisios;

import java.util.*;
import java.math.*;
public class pinturas {
    public static void main(String[] args) {
        double trabajo, cobrom2, m2;
         Scanner teclado=new Scanner(System.in);
        System.out.println("Cuantos metros cuadrados desea pintar");
        m2=teclado.nextDouble();
        System.out.println("Precio del metro cuadrado");
        cobrom2=teclado.nextDouble();
        trabajo=(cobrom2*m2);
        
        System.out.println("el valor por los"+m2+" metros cuadrados es de "+trabajo);
    }
    
}
