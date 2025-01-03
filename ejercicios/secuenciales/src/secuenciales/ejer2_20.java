/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;
public class ejer2_20 {
    
    public static void main(String[] args) {
        double a,b,c,t1,t2,t3,tot;
        Scanner teclado= new Scanner(System.in);
        System.out.println("ingrese nota de el primer examen");
        a=teclado.nextDouble();
        System.out.println("ingrese nota de el segundo examen");
        b=teclado.nextDouble();
        System.out.println("ingrese nota de el tercer examen");
        c=teclado.nextDouble();
        t1=a*0.25;
        t2=b*0.25;
        t3=c*0.50;
        tot=(t1+t2+t3)/3;
        System.out.println("El promedio es: "+tot);
  
       
    }
    
}