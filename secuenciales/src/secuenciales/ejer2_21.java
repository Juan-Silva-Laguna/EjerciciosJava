/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;
public class ejer2_21 {
    
    public static void main(String[] args) {
        int añona,añoac,años,mese,dias,horas,minutos;
        Scanner teclado= new Scanner(System.in);
        System.out.println("año en que nacio");
        añona=teclado.nextInt();
        System.out.println("año en actual");
        añoac=teclado.nextInt();
        años=añoac-añona;
        mese=años*12;
        dias=años*365;
        horas=dias*24;
        minutos=horas*60;
        System.out.println("La persona a vivido ");
        System.out.println(mese+" meses");
        System.out.println(dias+" dias");
        System.out.println(horas+" horas");
        System.out.println(minutos+" minutos");
       
    }
    
}