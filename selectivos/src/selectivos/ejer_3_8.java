package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_8 {
    public static void main(String[] args) {
    
    double bono, tot, sueldo;
    int ant;

    Scanner teclado = new Scanner (System.in);
    
       
        
            System.out.println("cuantos años lleva trabajando");
            ant=teclado.nextInt();
            System.out.println("digite el sueldo que recibe mensualmente");
            sueldo=teclado.nextDouble();
           
                
            if(ant>2 && ant<5){
              tot=sueldo*0.20;
              bono=sueldo+tot;
              System.out.println("su bono mensual es de: "+bono);
            }
            else if (ant>5) {
                tot=sueldo*0.30;
                bono=sueldo+tot;
                System.out.println("su bono mensual es de: "+bono);
            }
            else if (sueldo<1000) {
                tot=sueldo*0.25;
                bono=sueldo+tot;
                System.out.println("su bono mensual es de: "+bono);
            }
            else if (sueldo>1000 && sueldo<3500) {
                tot=sueldo*0.15;
                bono=sueldo+tot;
                System.out.println("su bono mensual es de: "+bono);
            }
            else if(sueldo>3500){
                tot=sueldo*0.10;
                bono=sueldo+tot;
                System.out.println("su bono mensual es de: "+bono);
            }
            else{
                System.out.println("no lograste obtener ningun bono");
            }
     }
}
