package repetitivos;


import java.util.*;
public class ejer4_15 {

    public static void main(String[] args) {
       int n, h;
       double ph,tot,desc,acum1,acum2,acum3,tot1=0,tot2=0,tot3=0;
       String nom;
       Scanner teclado=new Scanner(System.in);
       
        System.out.println("cuantos trabajadores son?");
        n=teclado.nextInt();
        for (int x = 1; x <= n; x++) {
                System.out.println("ingrese el  nombre ");
                nom=teclado.next();
                System.out.println("ingrese horas trabajadas ");
                h=teclado.nextInt();
                System.out.println("ingrese el  precio por horas ");
                ph=teclado.nextDouble();
                tot=h*ph;
            if (tot<=150) {
                desc=tot*0.05;
                acum1=tot-desc;
                System.out.println(nom+": "+acum1); 
                tot1=tot1+acum1;
            }
            else if(tot>150 && tot<300) {
                desc=tot*0.07;
                acum2=tot-desc;
                System.out.println(nom+": "+acum2); 
                tot2=tot2+acum2;
            }
            else if (tot>300 && tot<450) {
                desc=tot*0.09;
                acum3=tot-desc;
                System.out.println(nom+": "+acum3);
                tot3=tot3+acum3;
            }
             
        }
        System.out.println("sueldo semanal de todos los trabajadores es de "+(tot1+tot2+tot3));    
        
    }
}