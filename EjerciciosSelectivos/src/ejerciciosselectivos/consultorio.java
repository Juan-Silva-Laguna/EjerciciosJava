/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;
import java.util.*;
import java.math.*;
import java.io.*;
public class consultorio {
    public static void main(String[] args) {
        int nc;
        double cc,tot;
        
         Scanner teclado=new Scanner(System.in);
        
        try
        {
            
            
            System.out.println("numero de cita");
            nc=teclado.nextInt();
            
            if(nc<=3)
                {
                    cc=200;
                    tot=nc*cc;
                }
            else if(nc<=5)
                {
                    cc=150;
                    tot=(nc-3)*150+600;
                }
            else if(nc<=8)
                {
                    cc=100;
                    tot=(nc-5)*100+900;
                }
            else
                {
                    cc=50;
                    tot=(nc-8)*50+1200;
                }
           
            System.out.println("precio de la cita "+cc);
            System.out.println("total por tratamiento "+tot);
            
        }catch (Exception e)
            {
                System.out.println("error de datos de entrada "+e);
            }
    }
}