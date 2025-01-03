/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;
import java.util.*;
import java.math.*;

public class mayor {
    public static void main(String[] args) {
    
        double a,b,c,m;
         Scanner teclado=new Scanner(System.in);
        System.out.println("ingesar el valor de a");
        a=teclado.nextDouble();
        System.out.println("digite el valor de b");
        b=teclado.nextDouble();
        System.out.println("digite el valor de b");
        c=teclado.nextDouble();
        if(a>b)
            {
                if(a>c)
                    {
                        m=a;
                    }
                else
                    {
                        m=c;
                    }
            }
        else if(b>c)
            {
               m=b;
            }
        else
            {
                m=c;
            }
        System.out.println("el valor mayor es: "+m);
    }
       
 }

