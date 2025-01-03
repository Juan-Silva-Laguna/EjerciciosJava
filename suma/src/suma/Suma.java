/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.*;

public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese primer numero a sumar");
        b=teclado.nextDouble();
        System.out.println("Ingrese segundo numero a sumar");
        a=teclado.nextDouble();
        System.out.println("La suma es: "+(b+a));
    }
    
}
