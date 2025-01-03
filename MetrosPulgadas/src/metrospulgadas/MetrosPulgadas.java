/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrospulgadas;

import java.util.*;
import java.math.*;
public class MetrosPulgadas {

    public static void main(String[] args) {
     double cm, pg;
       Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresar la cantidad de metros ");
        cm=teclado.nextDouble();
        pg=cm/0.0254;
       
         System.out.println("la cantidad de tela que debe pedir en pulgadas es de: "+pg);
    }
    
}
