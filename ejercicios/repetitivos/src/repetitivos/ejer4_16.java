package repetitivos;


import java.util.*;
public class ejer4_16 {

    public static void main(String[] args) {
       int n, h;
       double tot;
       String nom;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos numeros positivos contentra el grupo?");
        n=teclado.nextInt();
        for (int x = 1; x <= n; x++) {
                System.out.println("ingrese el valor del numero "+x);
                h=teclado.nextInt();
                tot=Math.pow(h, 3);
        System.out.println("el "+h+" elevado a el cubo es igua a "+tot);   
        }
     }
}