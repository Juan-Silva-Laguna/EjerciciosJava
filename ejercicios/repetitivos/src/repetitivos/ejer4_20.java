package repetitivos;


import java.util.*;
public class ejer4_20 {

    public static void main(String[] args) {
       int n;
       double ang,tot;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("a cuantos angulos quieres sacarle el seno?");
        n=teclado.nextInt();
        for (int x = 1; x <= n; x++) {
            System.out.println("ingrese angulo "+x);
            ang=teclado.nextDouble();
            tot=Math.sin(ang);
            System.out.println("el seno de el angulo "+x+" es: "+tot);
        }

    }
}