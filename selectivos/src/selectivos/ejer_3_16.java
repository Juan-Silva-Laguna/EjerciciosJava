package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_16 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int pun;
    double min=828.116;
   
        System.out.println("ingresar puntos disponibles :");
        pun=teclado.nextInt();
        if (pun>0 && pun<=100) {
            System.out.println("con "+pun+" puntos usted recibe un bono de $"+ min);
        }
        else if (pun>100 && pun<=150) {
            min=min*2;
            System.out.println("con "+pun+" puntos usted recibe un bono de $"+ min);
        }
        else{
            min=min*3;
            System.out.println("con "+pun+" puntos usted recibe un bono de $"+ min);
        }
    }
}