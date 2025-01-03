package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_14 {
    public static void main(String[] args) {
    int num,tot;
    
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("ingrese calificacion?");
        num=teclado.nextInt();
                        
        if (num<=10 && num>9) {
            System.out.println("A");            
        }
        else if (num<=9 && num>8) {
            System.out.println("B");                  
        }
        else if (num<=8 && num>7){
            System.out.println("C");        
        }
        else if (num<=7 && num>=6){
            System.out.println("D");        
        }
        else{
            System.out.println("F");   
        }
    }
}