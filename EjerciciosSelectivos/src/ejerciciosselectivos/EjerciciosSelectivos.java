/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;
import java.util.*;
import java.math.*;
public class EjerciciosSelectivos {

    public static void main(String[] args) {
    
        double a,b,m;
         Scanner teclado=new Scanner(System.in);
        System.out.println("ingesar el valor de a");
        a=teclado.nextDouble();
        System.out.println("digite el valor de b");
        b=teclado.nextDouble();
        if(a>b)
            {
            m=a;
            }
        else
            {
            m=b;
            }
     
        System.out.println("el valor mayor es: "+m);
    }
}
    

