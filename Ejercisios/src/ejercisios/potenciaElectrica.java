/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisios;
import java.util.*;
import java.math.*;
public class potenciaElectrica {
    public static void main(String[] args) {
        double potencia, tension, intensidad, resistencia;
         Scanner teclado=new Scanner(System.in);
        System.out.println("ingesar la intensidad electrica");
        intensidad=teclado.nextDouble();
        System.out.println("ingesar la resistencia electrica");
        resistencia=teclado.nextDouble();
        tension=intensidad*resistencia;
        potencia=resistencia*intensidad;
     
        System.out.println("la potencia del circuito electrico es: "+potencia);
    }
}
