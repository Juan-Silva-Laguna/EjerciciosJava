package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_4 {
    public static void main(String[] args) {
    double hrs,p,tot;
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("Cuantas horas permanecio en el estacionamiento?");
        hrs=teclado.nextDouble();
                
        if(hrs==2)
            {
                p=5;
                tot=hrs*p;
                System.out.println("el precio del estacionamiento es de: "+tot);
                
            }
        else if(hrs<5)
            {
                p=4;
                tot=hrs*p;
                System.out.println("el precio del estacionamiento es de: "+tot);
            }
        else if(hrs<=10)
            {
               p=3;
               tot=hrs*p;
               System.out.println("el precio del estacionamiento es de: "+tot);
            }
        else if(hrs>10)
            {
                p=2;
                tot=hrs*p;
                System.out.println("el precio del estacionamiento es de: "+tot);
            }
        else
            {
                System.out.println("vallase para todo 300, tacaño");
            }
        
        
        
        
        
    }
}