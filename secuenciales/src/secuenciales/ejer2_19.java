/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;

public class ejer2_19 {
    
    public static void main(String[] args) {
        double b, h;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese por favor la base del cuadrado");
        b=teclado.nextDouble();
        System.out.println("Ingrese por favor la altura del cuadrado");
        h=teclado.nextDouble();
        double a=b*2+h*2;
        System.out.println("El area del triangulo es: "+a);
  
       
    }
    
}