/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arearectangulo;

import java.util.*;
import java.math.*;
public class AreaRectangulo {

    public static void main(String[] args) {
       double a, b, A;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        b=teclado.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        a=teclado.nextDouble();
        System.out.println("El area del rectangulo es: "+(b*a));
    }
    
}
