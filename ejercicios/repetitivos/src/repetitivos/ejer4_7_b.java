package repetitivos;

import java.util.*;
public class ejer4_7_b {

    public static void main(String[] args) {
       double tot=0,tt=0,ot;
       int y,x=0;
       Scanner teclado=new Scanner(System.in);
       String tipo,pag;
        System.out.println("digite numero de hamburguesas");
        y=teclado.nextInt();
        System.out.println("digite forma de pago");
        pag=teclado.next();

        do
        {
           System.out.println("que tipo de hamburguesa desea: (s, d, t)");
                tipo=teclado.next();

                switch(tipo){
                    case "s":
                    {
                        tot=tot+20;
                        tt=tot;
                        break;
                    }
                    case "d":
                    {
                        tot=tot+25;
                        tt=tot;
                        
                        break;
                    }
                    case "t":
                    {
                        tot=tot+28;
                        tt=tot;
                    }
                    default:{
                        System.out.println("no hay ese tipo de hamburguesa");
                        x=x-1;
                    }  
                    
            
            }
            x=x+1;
        }
        while  (x<y);
        if (pag.contentEquals("tarjeta")) {
                ot=tt*0.05;
                ot=tt+ot;
                System.out.println("total a pagar con tarjeta es: "+ot);
            }
            else{
                System.out.println("total a pagar es: "+tt);
            }
    }
    
}
