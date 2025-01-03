/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldosemanal;

import java.math.*;
import java.util.*;

public class SueldoSemanal {

    public static void main(String[] args) {
        double  ht, ph, ss, sf;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar horas trabajadas");
        ht=teclado.nextDouble();
        System.out.println("Ingresar pago por hora");
        ph=teclado.nextDouble();
        
        ss=ht*ph;
        sf=ss*6;
        
         System.out.println("el sueldo semanal es de: "+sf);
    }
    
}
