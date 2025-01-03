/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.*;
import java.math.*;
public class ejer2_2 {

   
    public static void main(String[] args) {
      double cantidad, dolar, total;
       Scanner teclado=new Scanner(System.in);
        System.out.println("digite el valor del dolar");
        dolar=teclado.nextDouble();
        System.out.println("Digite la cantidad a cambiar");
        cantidad=teclado.nextDouble();
        total=(cantidad/dolar);
        System.out.println("los dolares a entregar: "+total);
    }
    
}