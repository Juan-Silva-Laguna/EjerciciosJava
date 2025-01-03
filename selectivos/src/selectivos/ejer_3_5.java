package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_5 {
    public static void main(String[] args) {
    int ed1,ed2,ed3;
    String nom1,nom2,nom3;
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("por favor ingrese primer nombre:");
        nom1=teclado.next();
        System.out.println("por favir ingresar edad de "+nom1);
        ed1=teclado.nextInt();
        System.out.println("por favor ingrese segundo nombre:");
        nom2=teclado.next();
        System.out.println("por favir ingresar edad de "+nom2);
        ed2=teclado.nextInt();
        System.out.println("por favor ingrese tercer nombre:");
        nom3=teclado.next();
        System.out.println("por favir ingresar edad de "+nom3);
        ed3=teclado.nextInt();
                
        if (ed1<ed2) {
            System.out.println(nom1+" es menor con una edad de: "+ed1);            
        }
        else if (ed2<ed3) {
            System.out.println(nom2+" es menor con una edad de: "+ed2);             
        }
        else if (ed3<ed1 && ed3<ed2){
            System.out.println(nom3+" es menor con una edad de: "+ed3); 
        }
        else{
            System.out.println("ninguno es menor que ninguno");
        }
        
        
        
    }
}