package repetitivos;


import java.util.*;
public class ejer4_9 {

    public static void main(String[] args) {
       int año,inte,mes;
       double cant,tot=0,in,total=0;
       Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese durante cuantos años a depositado en el banco");
        año=teclado.nextInt();
        mes=año*12;
        if (año<=5) {
        for ( inte = 1; inte <= mes; inte++) {
            System.out.println("ingrese cuanto deposito el mes "+inte);
            cant=teclado.nextDouble();
            if (inte<=12) {
                total=total+cant;
                if(inte==12){
                    in=total*0.10;
                    tot=total+in;
                    System.out.println("inversion: "+tot);
                }
            }
            else if (inte<=24) {
                total=total+cant;
                if(inte==24){
                    in=total*0.10;
                    tot=total+in;
                    System.out.println("inversion: "+tot);
                }
            }
            else if (inte<=36) {
                total=total+cant;
                if(inte==36){
                    in=total*0.10;
                    tot=total+in;
                    System.out.println("inversion: "+tot);
                }
            }
            else if (inte<=48) {
               total=total+cant;
                if(inte==48){
                    in=total*0.10;
                    tot=total+in;
                    System.out.println("inversion: "+tot);
                }
            }
            else if (inte<=60) {
                total=total+cant;
                if(inte==60){
                    in=total*0.10;
                    tot=total+in;
                    System.out.println("inversion: "+tot);
                }
            }   
        }
    }
    else{
                System.out.println("los depositos no deben ser mayores a 5 años");
            }
    }
}