package repetitivos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
public class Repetitivos {

    public static void main(String[] args) {
       double aux, tot;
       int y=0;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("digite salario inicial");
        aux=teclado.nextDouble();
        System.out.println("digite cuantos años quiere calcular");
        y=teclado.nextInt();
        tot=aux*12;
        
        for (int x = 0; x < y; x++) {
            aux=aux+1.10;
            System.out.println("su incremento es: "+aux);
            tot=tot+(aux*12);
            System.out.println("su total ganado es: "+tot);
            System.out.println("su salario final es: "+aux);
            
        }
        
    }
    
}
