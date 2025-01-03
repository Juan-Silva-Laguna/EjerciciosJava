package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_7 {
    public static void main(String[] args) {
    
    double prom,b;
    int edad;
 
    Scanner teclado = new Scanner (System.in);
    
        System.out.println("por favor ingrese edad del estudiante:");
        edad=teclado.nextInt();
        System.out.println("por favor ingrese el promedio del estudiante");
        prom=teclado.nextDouble();
                
        if (edad>18) {
            
            if(prom>=9){
                  b=2000; 
                  System.out.println("la beca es de "+b);
            }
            else if (prom>=7.5) {
                b=1000;
                System.out.println("la beca es de "+b);
            }
            else if (prom<7.5 && prom>6) {
                b=500;
                System.out.println("la beca es de "+b);
            }
            else{
                System.out.println("estudien mas en el siguiente ciclo");
            }
        }
        else{
            if(prom>=9){
                  b=3000;  
                  System.out.println("la beca es de "+b);
            }
            else if (prom<9 && prom>=8) {
                b=2000;
                System.out.println("la beca es de "+b);
            }
            else if (prom<8 && prom>=6) {
                b=100;
                System.out.println("la beca es de "+b);
            }
            else{
                System.out.println("estudien mas en el siguiente ciclo");
            }
        }
        
        
    }
}