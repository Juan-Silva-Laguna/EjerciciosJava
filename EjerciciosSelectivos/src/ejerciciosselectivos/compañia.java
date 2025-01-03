package ejerciciosselectivos;
import java.util.*;
import java.math.*;
import java.io.*;
public class compañia {
    public static void main(String[] args) {
        int zona, peso;
        double costo=0;
        
         Scanner teclado=new Scanner(System.in);
         
         System.out.println("digite numero de la zona a donde se dirige");
         zona=teclado.nextInt();
        
        switch(zona)
        {
            case 1:
                {
                    costo=11;
                    System.out.println("digita el peso");
                    peso=teclado.nextInt();
                    costo=costo*peso;
                    System.out.println("el costo es de: "+costo);
                    break;
                }
            case 2:
                {
                    costo=10;
                    System.out.println("digita el peso");
                    peso=teclado.nextInt();
                    costo=costo*peso;
                    System.out.println("el costo es de: "+costo);
                    break;
                }
            case 3:
                {
                    costo=12;
                    System.out.println("digita el peso");
                    peso=teclado.nextInt();
                    costo=costo*peso;
                    System.out.println("el costo es de: "+costo);
                    break;
                }
           case 4:
                {
                    costo=24;
                    System.out.println("digita el peso");
                    peso=teclado.nextInt();
                    costo=costo*peso;
                    System.out.println("el costo es de: "+costo);
                    break;
                }
            case 5:
                {
                    costo=27;
                    System.out.println("digita el peso");
                    peso=teclado.nextInt();
                    costo=costo*peso;
                    System.out.println("el costo es de: "+costo);
                }
            default:
                {
                    System.out.println("El numero de pais, no esta registrado");

                }
            
            
        }
        
    }
}