/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanciapuntos;
import java.util.*;
import java.math.*;

public class DistanciaPuntos {

    
    public static void main(String[] args) {
       double  x1, x2, y1, y2, x, y, d;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar las cordenadas del punto 1");
        x1=teclado.nextDouble();
        y1=teclado.nextDouble();
        System.out.println("Ingresar las cordenadas del punto 2");
        x2=teclado.nextDouble();
        y2=teclado.nextDouble();
        
        x=x2-x1;
        y=y2-y1;
        d=Math.sqrt((x*x)+(y*y));
        
         System.out.println("la distancia entre el punto 1 el punto 2 es de: "+d);
    }
    
}
