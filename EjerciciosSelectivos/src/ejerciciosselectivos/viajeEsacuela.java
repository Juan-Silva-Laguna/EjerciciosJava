/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;
import java.util.*;
import java.math.*;
public class viajeEsacuela {
    public static void main(String[] args) {
        int na;
        double pa, tot;
         Scanner teclado=new Scanner(System.in);
        System.out.println("ingresar cantidad de alumnos");
        na=teclado.nextInt();
        
        
        if(na>=100)
            {
                pa=65.0;
            }
        else
            {
                if(na>=50)
                {
                    pa=70.0;
                }
                else if(na>30)
                {
                    pa=95.0;
                }
                else
                {
                    pa=4000/na;
                }
            }
        tot=na*pa;
        
       System.out.println("el pago individual es: "+pa);
        System.out.println("el pago en total es: "+tot);
    }
}

