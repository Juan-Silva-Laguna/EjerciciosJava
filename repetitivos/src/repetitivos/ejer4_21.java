package repetitivos;


import java.util.*;
public class ejer4_21 {

    public static void main(String[] args) {
       int cm,cb,val,a1=0,a2=0,a3=0,bill,b1=0,b2=0,b3=0;
       double tot1=0,tot2=0,total;
       Scanner teclado=new Scanner(System.in);
       
       System.out.println("cuantas monedas son?");
        cm=teclado.nextInt();
        System.out.println("cuantos billetes son?");
        cb=teclado.nextInt();
        
        for (int x = 1; x <= cm; x++) {
        System.out.println("ingrese el valor de moneda numero "+x);
        val=teclado.nextInt();
            if (val==1) {
                 a1=a1+1;
            }
            else if (val==5) {
                a2=a2+5;
            }
            else if (val==10) {
                 a3=a3+10;
            }
            else{
                System.out.println("solo son monedas de 10,5 y 1 peso");
            }
            tot1=a1+a2+a3;
        }
        
        for (int y = 1; y <= cb; y++) {
        System.out.println("ingrese el valor del billete numero "+y);
        bill=teclado.nextInt();
            if (bill==10) {
                 b1=b1+10;
            }
            else if (bill==20) {
                b2=b2+20;
            }
            else if (bill==50) {
                 b3=b3+50;
            }
            else{
                System.out.println("solo son monedas de 10,5 y 1 peso");
            }
             tot2=b1+b2+b3;
        }
            System.out.println("la cantidad de dinero que tiene en su monedero es de "+(tot1+tot2)+".    monedas: "+tot1+" y billetes: "+tot2);
    }
}
    