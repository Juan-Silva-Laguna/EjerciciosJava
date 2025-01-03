
import java.util.*;
import java.math.*;
public class ejer4_12 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double n,t1=0,t2=0,t3=0,tt=0,cn=1,v;
        int a=0,b=0,c=0;
        System.out.println("digite numero de ventas");
        n=teclado.nextDouble();
        while(cn<=n){
            System.out.println("digite monto de venta");
            v=teclado.nextDouble();
            if (v>1000) {
                a=a+1;
                t1=t1+t1;
            }
            else if(v>500){
                b=b+1;
                t2=t2+1;
            }
            else{
                c=c+1;
                t3=t3+1;
            }
        
        tt=tt+v;
        cn=cn+1;
        }
        System.out.println("las ventas y el total de ventas 1 es:  "+a+" y "+t1);
        System.out.println("las ventas y el total de ventas 2 es:  "+b+" y "+t2);
        System.out.println("las ventas y el total de ventas 3 es:  "+c+" y "+t2);  
        System.out.println("el total de ventas es de "+tt);
    }
}
