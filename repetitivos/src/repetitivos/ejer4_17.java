package repetitivos;


import java.util.*;
public class ejer4_17 {

    public static void main(String[] args) {
       int n;
       double tot=0,tie;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("ingrese numero, para saber su tabla de multiplicar");
        n=teclado.nextInt();
        for (int x = 1; x < 10; x++) {
                tie=x*n;
                System.out.println(n+"x"+x+"="+tie);
        }
       
     }
}
