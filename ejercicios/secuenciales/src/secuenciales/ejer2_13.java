/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales;

import java.util.Scanner;

public class ejer2_13 {
    public static void main(String[] args) {
        double ahorro, sueldo, totalm, totala, des;
         Scanner teclado=new Scanner(System.in);
        System.out.println("sueldo semanal?");
        sueldo=teclado.nextDouble();
        des=(sueldo*15)/100;
        totalm=des*4;
        totala=totalm*12;
        System.out.println("el ahorro anual es de: "+totala);
    }
}
