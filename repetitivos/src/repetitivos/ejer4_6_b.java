package repetitivos;

import java.util.*;
public class ejer4_6_b {

    public static void main(String[] args) {
       double aux, tot, total;
       int y,x=0;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("ingrese salario inicial");
        aux=teclado.nextDouble();
        System.out.println("digite cuantos años quiere calcular");
        y=teclado.nextInt();
        tot=aux*12;
        do
        {
            total=aux*0.10;
            aux=total+aux;
            System.out.println("su incremento es: "+aux);
            tot=tot+(aux*12);
            
            x=x+1;
        }
        while(x<y);
                
        System.out.println("su total ganado es: "+tot);
        System.out.println("su salario final es: "+aux);
        
    }
    
}