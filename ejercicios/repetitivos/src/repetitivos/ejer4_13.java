package repetitivos;


import java.util.*;
public class ejer4_13 {

    public static void main(String[] args) {
       int n;
       double val,acum1=0,acum2=0,tot1=0,tot2=0,total;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos ventas realizo?");
        n=teclado.nextInt();
        for (int x = 1; x <= n; x++) {
                System.out.println("ingrese valor de la venta "+x);
                val=teclado.nextDouble();
            if (val<=10000) {
                acum1=acum1+1;
                tot1=tot1+val;
            }
            else if (val>10000 && val<20000) {
                acum2=acum2+1;
                tot2=tot2+val;
            }
            
        }
        total=tot1+tot2;
        System.out.println("ventas menores e iguales a 10.000 fueron: "+acum1);
        System.out.println("el monto de ventas menores e iguales a 10.000 fue de $"+tot1);
        System.out.println("ventas mayores a 10000 y menores a 20000 fueron: "+acum2);    
        System.out.println("el monto de ventas mayores a 10000 y menores a 20000 fue de $"+tot2);
        System.out.println("el monto global de las ventas fue de $"+total);
        
    }
}