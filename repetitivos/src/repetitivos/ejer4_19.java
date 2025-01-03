package repetitivos;


import java.util.*;
public class ejer4_19 {

    public static void main(String[] args) {
       int aut, veh;
       double acum1=0,acum2=0,acum3=0,pres,tot,imp,i1=0,i2=0,i3=0;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("con cuantos autos posee?");
        aut=teclado.nextInt();
        for (int x = 1; x <= aut; x++) {
            System.out.println("que categoria es el vehiculo "+x);
            veh=teclado.nextInt();
            System.out.println("precio del vehiculo?");
            pres=teclado.nextDouble();
            switch(veh)
            {
                case 1:
                    imp=pres*0.10;
                    i1=i1+imp;
                    tot=pres+imp;
                    acum1=acum1+tot;
                    System.out.println("impuesto agregado del 10%");
                    break;
                case 2:
                    imp=pres*0.07;
                    i1=i1+imp;
                    tot=pres+imp;
                    acum2=acum2+tot;
                    System.out.println("impuesto agregado del 7%");
                    break;
                case 3:
                    imp=pres*0.05;
                    i1=i1+imp;
                    tot=pres+imp;
                    acum3=acum3+tot;
                    System.out.println("impuesto agregado del 5%");
                default:
                    System.out.println("esa categoria no esta");
                    x=x-1;
            }
           
        }
        System.out.println(" el impuesto total de todos los vehiculos es de: "+(i1+i2+i3));
        System.out.println("total a pagar es de "+(acum1+acum2+acum3));
        
     }
}