package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_18 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int año,sue;
    double tot;
    
        System.out.println("cuntos años lleva trabajando en la tienda:");
        año=teclado.nextInt();
        System.out.println("cueanto es su sueldo en la tienda:");
        sue=teclado.nextInt();
        if (año>4 || sue<2000) {
            tot=sue*0.25;
            System.out.println("el bono navideño que le da la tirnda es de: "+tot);
        }
        else{
            tot=sue*0.20;
            System.out.println("el bono navideño que le da la tirnda es de: "+tot);
        }
    }
}