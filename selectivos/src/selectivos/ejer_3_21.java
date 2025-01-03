package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_21 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
  
    double salac,pagmin,pagnin,multa,inte,salant,comp,depo;
    
        System.out.println("monto de las compras que realizo:");
        comp=teclado.nextDouble();
        System.out.println("saldo anterior:");
        salant=teclado.nextDouble();
        System.out.println("cuanto deposito en el corte anterior:");
        depo=teclado.nextDouble();
        if (depo*0.15>comp) {
            inte=salant*0.12;
            multa=200;
        }
        else{
            inte=0;
            multa=0;
        }
        salac=salant+comp-depo+inte+multa;
        pagmin=salac*0.15;
        pagnin=salac*0.85;
        System.out.println("iteres del "+inte+"% ");
        System.out.println("multa de $"+multa);
        System.out.println("pago minimo $"+pagmin);
        System.out.println("pago para no generar intereses $"+pagnin);
        System.out.println("saldo actual de $"+salac);
    }
}