package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_3 {
    public static void main(String[] args) {
    double din;
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("Con cuanto dinero cuenta para el regalo?");
        din=teclado.nextDouble();
                
        if(din<10)
            {
                System.out.println("le recomenamos comprar tarjetas");
            }
        else if((din>11)&&(din<100))
            {
                System.out.println("le recomenamos comprar chocolates");
            }
        else if((din>101)&&(din<250))
            {
                System.out.println("le recomenamos comprar flores");
            }
        else if(din>251)
            {
                System.out.println("le recomenamos comprar anillos");
            }
        else
            {
                System.out.println("vallase para todo 300, tacaño");
            }
        
        
    }
}
