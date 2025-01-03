package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_6 {
    public static void main(String[] args) {
    
    double pres,cost,desc;
 
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("por favor ingrese precio del articulo:");
        pres=teclado.nextDouble();
        
                
        if (pres>=200) {
            desc=pres*0.15;
            cost=pres-desc;
            System.out.println("Se le descuentan $"+desc+" por lo tanto el articulo tiene un costo de: $"+cost);            
        }
        else if (pres<200 && pres>100) {
            desc=pres*0.12;
            cost=pres-desc;
            System.out.println("Se le descuentan $"+desc+" por lo tanto el articulo tiene un costo de: $"+cost);             
        }
        else if (pres<100){
            desc=pres*0.10;
            cost=pres-desc;
            System.out.println("Se le hace un descuentan $"+desc+" por lo tanto el articulo tiene un costo de: $"+cost); 
        }
        else{
            System.out.println("no hay articulos con esos precios");
        }
        
        
        
    }
}