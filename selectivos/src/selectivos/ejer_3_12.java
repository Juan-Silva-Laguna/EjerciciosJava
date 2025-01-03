package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_12 {
    public static void main(String[] args) {
    int h;
    double ph,tot,total,ex,o;
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("horas trabajadas?");
        h=teclado.nextInt();
        System.out.println("pago por hora?");
        ph=teclado.nextDouble();
        tot=h*ph;
        
        if (h>=41 && h<=45) {
            ex=45-h;
            ex=5-ex;
            o=(ex*ph)*2;
            total=tot+o;
            System.out.println("sin pago doble: "+tot);
            System.out.println("pago es de: "+total+" incluidas las "+ex+" horas extras");
        }
        else if (h>=46 && h<=50) {
            ex=50-h;
            ex=5-ex;
            o=(ex*ph)*3;
            total=tot+o;
            System.out.println("sin pago doble: "+tot);
            System.out.println("pago es de: "+total+" incluidas las "+ex+" horas extras");
        }
        else if(h>50){
            System.out.println("no es permitido");
        }
        
        
        
    }
}