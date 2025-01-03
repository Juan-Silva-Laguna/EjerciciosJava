package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_13 {
    public static void main(String[] args) {
    int num,tot;
    
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("cuantoa alumnos son?");
        num=teclado.nextInt();
                        
        if (num>100) {
            tot=num*20;
            System.out.println("el viaje sale por $20 por pasajero y por el grupo seria "+tot);            
        }
        else if (num>50) {
            tot=num*35;
            System.out.println("el viaje sale por $35 por pasajero y por el grupo seria "+tot);                
        }
        else if (num>20 && num<49){
            tot=num*40;
            System.out.println("el viaje sale por $40 por pasajero y por el grupo seria "+tot);      
        }
        else{
            tot=num*70;
            System.out.println("el viaje sale por $70 por pasajero y por el grupo seria "+tot);     
        }
    }
}