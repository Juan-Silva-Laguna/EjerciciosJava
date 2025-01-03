package repetitivos;


import java.util.*;
public class ejer4_12 {

    public static void main(String[] args) {
       int bill,mon,edad;
       double val1,val2,acum1=0,acum2=0;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos billetes son?");
        bill=teclado.nextInt();
        System.out.println("de que precio son los billetes");
        val1=teclado.nextDouble();
        System.out.println("cuantos monedas son?");
        mon=teclado.nextInt();
        System.out.println("de que precio son las monedas");
        val2=teclado.nextDouble();
        for (int x = 0; x < bill; x++) {
                acum1=acum1+val1;            
            }
        for (int x = 0; x < mon; x++) {
                acum2=acum2+val2;            
            }
         
        System.out.println("en billetes hay $"+acum1+" y en monedas hay $"+acum2+" en total seria: "+(acum1+acum2));
    }
}