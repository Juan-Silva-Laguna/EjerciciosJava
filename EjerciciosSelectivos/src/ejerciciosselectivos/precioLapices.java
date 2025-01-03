/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosselectivos;
import java.util.*;
import java.math.*;
public class precioLapices {
    public static void main(String[] args) {
    
        double cant, pag;
         Scanner teclado=new Scanner(System.in);
        System.out.println("cantidad de lapices a comprar?");
        cant=teclado.nextDouble();
        
        if(cant>1000)
            {
                pag=cant*0.85;
                System.out.println("el costo es de: "+pag);
            }
        else
            {
                pag=cant*0.95;
                System.out.println("el costo es de: "+pag);
            }
    
    }
}
