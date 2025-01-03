package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_9 {
    public static void main(String[] args) {
    
    double tot=0;
    int edad;
    String pol, p1,p2,p3,p4;

    Scanner teclado = new Scanner (System.in);
 
            System.out.println("su poliza es tipo A o B?");
            pol=teclado.next().toLowerCase();
            System.out.println("consume alcohol?");
            p1=teclado.next().toLowerCase();
            System.out.println("utiliza lentes?");
            p2=teclado.next().toLowerCase();
            System.out.println("sufre alguna enfermedad?");
            p3=teclado.next().toLowerCase();
            System.out.println("ingrese edad");
            edad=teclado.nextInt();
            
            if (pol.contentEquals("a")) {
                if (p1.contentEquals("si")&&p2.contentEquals("si")&&p3.contentEquals("si")&&edad>40) {
                    tot=1200+120+60+60+240;
                    
                }
                else if (p1.contentEquals("si")&&p2.contentEquals("si")&&p3.contentEquals("si")&&edad<40) {
                    tot=1200+120+60+60+120;
                    
                }
                else if (p2.contentEquals("si")&&p3.contentEquals("si")&&edad>40) {
                    tot=1200+60+60+240;
                    
                }
                else if (p2.contentEquals("si")&&p3.contentEquals("si")&&edad<40) {
                    tot=1200+60+60+120;
                    
                }
                else if (p3.contentEquals("si")&&edad>40) {
                    tot=1200+60+240;
                    
                }
                else if (p3.contentEquals("si")&&edad<40) {
                    tot=1200+60+120;
                    
                }
                else if (edad>40) {
                    tot=1200+240;
                    
                }
                else if (edad<40) {
                    tot=1200+120;
                }
                else{
                    System.out.println("no tiene aumento en su poliza por lo tanto queda en 1200");
                }
                System.out.println("la poliza A le queda en:"+tot);
            }
            else if (pol.contentEquals("b")) {
                if (p1.contentEquals("si")&&p2.contentEquals("si")&&p3.contentEquals("si")&&edad>40) {
                    tot=590+59+29.5+29.5+180;
                    
                }
                else if (p1.contentEquals("si")&&p2.contentEquals("si")&&p3.contentEquals("si")&&edad<40) {
                    tot=590+59+29.5+29.5+59;
                    
                }
                else if (p2.contentEquals("si")&&p3.contentEquals("si")&&edad>40) {
                    tot=590+29.5+29.5+180;
                    
                }
                else if (p2.contentEquals("si")&&p3.contentEquals("si")&&edad<40) {
                    tot=590+29.5+29.5+59;
                    
                }
                else if (p3.contentEquals("si")&&edad>40) {
                    tot=590+29.5+180;
                    
                }
                else if (p3.contentEquals("si")&&edad<40) {
                    tot=590+29.5+59;
                    
                }
                else if (edad>40) {
                    tot=590+180;
                    
                }
                else if (edad<40) {
                    tot=590+59;
                }
                else{
                    System.out.println("no tiene aumento en su poliza por lo tanto queda en 590");
                }
                System.out.println("la poliza B le queda en:"+tot);
            }
              
     }
}
