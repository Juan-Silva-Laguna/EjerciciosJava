package repetitivos;


import java.util.*;
public class ejer4_18 {

    public static void main(String[] args) {
       int añof;
       double tot=0,tie;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("ingrese año actual");
        añof=teclado.nextInt();
        for (int x = 1961; x < añof; x++) {
                tie=1500*0.15;
                tot=tot+tie; 
                System.out.println(tot);
        }
        System.out.println(" el ahorro durante todos los años es de: "+(tot+1500));
     }
}