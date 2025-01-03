/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import java.util.*;
import java.math.*;
public class Calificaciones {

    
    public static void main(String[] args) {
       double C1, C2, C3, C4, s, p;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese primera nota");
        C1=teclado.nextDouble();
        System.out.println("Ingrese segunda nota");
        C2=teclado.nextDouble();
        System.out.println("Ingrese tercera nota");
        C3=teclado.nextDouble();
        System.out.println("Ingrese cuarta nota");
        C4=teclado.nextDouble();
        s=C1+C2+C3+C4;
        p=s/4;
        System.out.println("La calificacion es: "+p);
    }
    
}
