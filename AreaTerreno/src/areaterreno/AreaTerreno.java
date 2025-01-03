/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaterreno;

import java.util.*;
import java.math.*;
public class AreaTerreno {

     public static void main(String[] args) {
     double b, a, c, at, ar, A;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar la base");
        b=teclado.nextDouble();
        System.out.println("Ingresar la altura del triangulo y rectangulos unidos");
        a=teclado.nextDouble();
        System.out.println("Ingresar la altura del rectangulo");
        c=teclado.nextDouble();
        System.out.println("Ingresar la altura del triangulo y rectangulos unidos");
        at=(b*(a-c))/2;
        ar=b*c;
        A=at+ar;
         System.out.println("el area del terreno es: "+A);
    }
    
}
