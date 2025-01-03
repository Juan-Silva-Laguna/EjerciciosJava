package ejerciciosselectivos;
import java.util.*;
import java.math.*;
import java.io.*;
public class banco {
    public static void main(String[] args) {
        int tt;
        double la,ac,nc;
        
         Scanner teclado=new Scanner(System.in);
         
         System.out.println("digite tipo de tarjeta");
         tt=teclado.nextInt();
        
        switch(tt)
        {
            case 1:
                {
                    System.out.println("limite actual de credito");
                    la=teclado.nextDouble();
                    ac=la*0.25;
                    nc=la+ac;
                    System.out.println("el aumento de credito es de: "+ac);
                    System.out.println("el nuvo limite de credito es de: "+nc);
                    break;
                }
            case 2:
                {
                    System.out.println("limite actual de credito");
                    la=teclado.nextDouble();
                    ac=la*0.35;
                    nc=la+ac;
                    System.out.println("el aumento de credito es de: "+ac);
                    System.out.println("el nuvo limite de credito es de: "+nc);
                    break;
                }
            case 3:
                {
                    System.out.println("limite actual de credito");
                    la=teclado.nextDouble();
                    ac=la*0.40;
                    nc=la+ac;
                    System.out.println("el aumento de credito es de: "+ac);
                    System.out.println("el nuvo limite de credito es de: "+nc);
                    break;
                }
            default:
                {
                    System.out.println("tipo de tarjeta no identificado");

                }
            
            
        }
        
    }
}