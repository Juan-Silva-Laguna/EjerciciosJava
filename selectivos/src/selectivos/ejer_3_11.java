package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_11 {
    public static void main(String[] args) {
    int año;
    
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("cuantoa años lleva trabajando en la empresa?");
        año=teclado.nextInt();
                        
        if (año==1) {
            System.out.println("se le hara un bono de $100");            
        }
        else if (año==2) {
            System.out.println("se le hara un bono de $200");               
        }
        else if (año==3){
            System.out.println("se le hara un bono de $300");   
        }
        if (año==4) {
            System.out.println("se le hara un bono de $400");            
        }
        else if (año==5) {
            System.out.println("se le hara un bono de $500");               
        }
        else if (año>5) {
            System.out.println("se le hara un bono de $1000");            
        }
        else{
        }
        
        
        
    }
}