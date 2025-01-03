package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_20 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int tall,pan;
    double m1=1.50,m2=1.80,tot=0,cos,to=0,total=0;
    String mod,sex;
        System.out.println("cuantos pantalones desea fabricar:");
        pan=teclado.nextInt();
        System.out.println("ingrese modelo de pantalon:");
        mod=teclado.next();
        System.out.println("ingrese talla:");
        tall=teclado.nextInt();
        
        for (int x = 0; x < pan; x++) {
          switch  (mod)
            {
                case "a":
                {
                    System.out.println("costo por tela");
                    cos=teclado.nextDouble();
                    
                    if (tall == 32 || tall == 36) {
                        tot=cos+(cos*0.80);
                        to=tot+(tot*0.04);
                        System.out.println("costo por mano de obra y tela: "+to);
                    }
                    else{
                        tot=cos+(cos*0.80);
                        System.out.println("costo por mano de obra y tela: "+tot);
                        
                    }
                    break;
                }
                case "b":
                {
                    System.out.println("costo por tela");
                    cos=teclado.nextDouble();
                    
                    if (tall == 32 || tall == 36) {
                        tot=cos+(cos*0.95);
                        to=tot+(tot*0.04);
                        System.out.println("costo por mano de obra y tela: "+to);
                    }
                    else{
                        tot=cos+(cos*0.95);
                        System.out.println("costo por mano de obra y tela: "+tot);
                        
                    } 
                }
                default:
                {
                    System.out.println("ese modelo no existe solo modelos a y b");
                    x=x-1;
                }
            }
          total=tot+to;
         }
        System.out.println("precio final de venta "+total);
        System.out.println("la ganacia extra de la tienda es de "+(total*0.30));
    }
}