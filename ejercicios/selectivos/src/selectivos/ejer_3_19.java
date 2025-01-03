package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_19 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int ed;
    String sex;
    
        System.out.println("ingrese edad:");
        ed=teclado.nextInt();
        System.out.println("tipo de sexo:");
        sex=teclado.next();
        if (ed>70) {
            System.out.println("Aplicar vacuna tipo C");
        }
        else if (ed>=16 && ed<=70) {
            if (sex.contentEquals("f")) {
                System.out.println("Aplicar vacuna tipo B");
            }
            else{
                System.out.println("Aplicar vacuna tipo A");
            }
        }
        else if(ed<16){
            System.out.println("Aplicar vacuna tipo A");
        }
    }
}