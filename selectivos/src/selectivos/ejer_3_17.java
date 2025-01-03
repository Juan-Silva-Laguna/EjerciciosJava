package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_17 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int pun;
    
    
        System.out.println("cunto dinero recibira en diciempre :");
        pun=teclado.nextInt();
        if (pun>=50000) {
            System.out.println(" su dinero alcanza para el Paquete A: una televisión,\n" +
                "un modular, tres pares de zapatos, cinco camisas y cinco pantalones.");
        }
        else if (pun>=20000 && pun<50000) {
            System.out.println(" su dinero alcanza para el Paquete B: una grabadora, tres pares de zapatos,\n" +
        "cinco camisas y cinco pantalones.");
        }
        else if (pun>10000 && pun<20000) {
            System.out.println(" su dinero alcanza para el Paquete C: dos pares de zapatos, tres camisas y tres\n" +
            "pantalones.");
        }
        else{
            System.out.println(" su dinero alcanza para el Paquete D8: un par de zapatos, dos camisas y dos pantalones.");
        }
    }
}