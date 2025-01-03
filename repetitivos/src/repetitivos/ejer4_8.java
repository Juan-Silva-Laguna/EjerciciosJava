package repetitivos;


import java.util.*;
public class ejer4_8 {

    public static void main(String[] args) {
       int foc,col;
       double desc=0,tot=0,acum=0;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos articulos adquiere");
        foc=teclado.nextInt();
        
        for (int x = 1; x <= foc; x++) {
            System.out.println("ingrese precio de articulo "+x);
            col=teclado.nextInt();
            if (col>=200) {
               desc=col*0.15;
               tot=col-desc;
            }
            else if (col>=100 && col<200) {
               desc=col*0.12;
               tot=col-desc;
            }
            else{
                desc=col*0.10;
               tot=col-desc;
            }
            acum=acum+tot;
        }
        System.out.println("total de los articulos por llevar es "+acum);
    }
}