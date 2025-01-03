/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;

import java.util.*;
import java.math.*;
public class langostaAhumada {
    public static void main(String[] args) {
    
        double cp, total;
         Scanner teclado=new Scanner(System.in);
        System.out.println("cantidad de persosnas");
        cp=teclado.nextDouble();
        
        if(cp>300)
            {
                total=cp*75;
            }
        else
            {   
                if(cp>200)
                    {
                        total=cp*85;
                    }
                else
                    {
                        total=cp*95;
                    }
            }
       
        System.out.println("la tarifa queda en: "+total);
    }
}
