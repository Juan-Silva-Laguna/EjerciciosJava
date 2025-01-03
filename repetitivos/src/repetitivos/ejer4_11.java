package repetitivos;


import java.util.*;
public class ejer4_11 {

    public static void main(String[] args) {
       int n,x,fac,j,i=0,y;
       double ex=0;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("digite valor de x");
        x=teclado.nextInt();
        
        while  (i<=x){
            fac=1;
            j=i;
            y=1;
            while(j>0)
            {
                fac=fac*j;
                j=j-1;
                y=y+1;
            }
            ex=1+(Math.pow(x,y)/fac);
            i=i+1;
        }
        System.out.println("el resultado es: "+ex);
    }
}