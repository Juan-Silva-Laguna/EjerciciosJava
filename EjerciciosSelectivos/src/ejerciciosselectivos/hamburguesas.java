/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;
import java.util.*;
import java.math.*;
import java.io.*;
public class hamburguesas {
    public static void main(String[] args) {
        int n;
        double pa,ca,to,tot;
        String ti, tp;
        
         Scanner teclado=new Scanner(System.in);
        
        try
        {
            System.out.println("tipo de hamburguesa");
            ti=teclado.next().toLowerCase();
            
            if(ti.contentEquals("sencilla"))
                {
                    pa=20;
                }
            else if(ti.contentEquals("doble"))
                {
                    pa=25;
                }
            else
                {
                    pa=28;
                }
            System.out.println("numero de hamburguesas");
            n=teclado.nextInt();
            to=pa*n;
            System.out.println("que tipo de pago va a utilizar?");
            tp=teclado.next().toLowerCase();
            if(tp.contentEquals("tarjeta"))
                {
                    ca=to*0.05;
                }
            else
                {
                    ca=0;
                }
            tot=to+ca;
            
            System.out.println("precio de la hamburguesa es "+pa);
            System.out.println("cargo por el uso de tarjeta es: "+ca);
            System.out.println("total sin cargo "+to);
            System.out.println("total con cargo "+tot);
            
        }catch (Exception e)
            {
                System.out.println("error de datos de entrada "+e);
            }
    }
}
