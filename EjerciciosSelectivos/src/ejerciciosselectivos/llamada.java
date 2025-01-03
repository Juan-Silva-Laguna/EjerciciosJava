/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;
import java.util.*;
import java.math.*;
import java.io.*;
public class llamada {
    public static void main(String[] args) {
        int tiempo;
        double imp,pag,tot;
        String di, tu;
        
         Scanner teclado=new Scanner(System.in);
        
        try
        {
            System.out.println("digite el tiempo de la llamada");
            tiempo=teclado.nextInt();
            System.out.println("digite el tipo de dia");
            di=teclado.next().toLowerCase();
            if(tiempo<=5)
                {
                    pag=tiempo*1;
                }
            else if (tiempo<=8)
                {
                    pag=(tiempo-5)*0.80+5;
                }
            else if(tiempo<=10)
                {
                    pag=(tiempo-8)*0.70+7.40;
                }
            else
                {
                    pag=(tiempo-10)*0.50+8.80;
                }
     
            System.out.println("total pagar sin impuestos ni jornada "+pag);
            
            
            
            if(di.contentEquals("lunes")||di.contentEquals("martes")||di.contentEquals("miercoles")||di.contentEquals("jueves")||di.contentEquals("viernes"))
                {
                    System.out.println("es en la mañana?");
                    tu=teclado.nextLine();
                    if (tu.equalsIgnoreCase("si"))
                        {
                            pag=pag*1.15;
                        }
                    else{
                        pag=pag*1.10;
                    }
                }
            else
                {
                    pag=pag*1.03;
                }
           
            System.out.println("pago con recargo de dia: "+pag);
           
                
        }catch (Exception e)
            {
                System.out.println("error de datos de entrada "+e);
            }
    }
}
