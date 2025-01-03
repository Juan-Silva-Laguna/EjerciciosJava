/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;

public class ejer2_3 {

   
    public static void main(String[] args) {
      double edad, añon, añoa;
       Scanner teclado=new Scanner(System.in);
        System.out.println("digite el año en que nacio");
        añon=teclado.nextDouble();
        System.out.println("Digite el año actual");
        añoa=teclado.nextDouble();
        edad=(añoa/añon);
        System.out.println("los dolares a entregar: "+edad);
    }
    
}