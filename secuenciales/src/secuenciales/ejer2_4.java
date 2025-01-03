/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;
import java.util.*;
import java.math.*;
public class ejer2_4 {
        public static void main(String[] args) {
        double cobro, cobroh, inicio, fin, horas, res;
         Scanner teclado=new Scanner(System.in);
        System.out.println("hora en que inicia");
        inicio=teclado.nextDouble();
        System.out.println("hora en que salio");
        fin=teclado.nextDouble();
        inicio=inicio*60;
        fin=fin*60;
        horas=(fin-inicio);
        horas=horas/60;
        res=horas%2;
        int n =(int)horas;
        if(res>0)
            {
                n=n+1;
            }
        System.out.println("cobro por hora");
        cobroh=teclado.nextDouble();
        cobro=(cobroh*horas);
        System.out.println("el valor por las "+horas+" horas transcurridad es de: "+cobro);
    }
    
}
