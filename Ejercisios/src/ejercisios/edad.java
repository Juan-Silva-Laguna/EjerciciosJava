package ejercisios;

import java.util.*;
import java.math.*;
//</editor-fold>
public class edad {

   
    public static void main(String[] args) {
      double edad, añon, añoa;
       Scanner teclado=new Scanner(System.in);
        System.out.println("digite el año en que nacio");
        añon=teclado.nextDouble();
        System.out.println("Digite el año actual");
        añoa=teclado.nextDouble();
        edad=(añoa/añon);
        System.out.println("los dolares a entregar: "+edad);
    }
    
}