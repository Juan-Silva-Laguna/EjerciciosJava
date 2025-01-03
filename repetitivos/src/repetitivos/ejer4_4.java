package repetitivos;


import java.util.*;
public class ejer4_4 {

    public static void main(String[] args) {
       int foc,col,con1=0,con2=0,con3=0,tot;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos focos son en el lote?");
        foc=teclado.nextInt();
        
        for (int x = 1; x < foc+1; x++) {
            System.out.println("ingrese color: 1:verde, 2:blanco, 3:rojo");
            col=teclado.nextInt();
            switch(col){
                case 1:
                    con1=con1+1;
                    break;
                case 2:
                    con2=con2+1;
                    break;
                case 3:
                    con3=con3+1;
                default:
                    System.out.println("no tenemos ese color");
            }
        }
        System.out.println("focos verdes hay: "+con1);
        System.out.println("focos blancos hay: "+con2);
        System.out.println("focos rojos hay: "+con3);
    }
}