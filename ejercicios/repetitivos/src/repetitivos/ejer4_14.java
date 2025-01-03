package repetitivos;


import java.util.*;
public class ejer4_14 {

    public static void main(String[] args) {
       int n;
       double val,acum1=0,acum2=0;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos estudianntes son?");
        n=teclado.nextInt();
        for (int x = 1; x <= n; x++) {
                System.out.println("ingrese la nota del estudiante numero "+x);
                val=teclado.nextDouble();
            if (val<=5) {
                acum1=acum1+1;
            }
            else {
                acum2=acum2+1;
            }
            
        }
        System.out.println("Reprobados: "+acum1);
        System.out.println("Aprobados: "+acum2);    
        
    }
}