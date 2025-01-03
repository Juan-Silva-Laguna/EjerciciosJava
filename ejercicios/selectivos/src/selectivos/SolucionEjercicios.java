/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectivos;

    import java.util.*;
    import java.math.*;
public class SolucionEjercicios {


    public static void main(String[] args) {
        int edad;
        String nombre;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("por favor ingrsar su nombre");
        nombre=teclado.next();
        System.out.println(nombre+ " ingresar su edad por favor");
        edad=teclado.nextInt();
        
        if(edad>18)
            {
                System.out.println("Señor(a) "+nombre+" usted puede votar satisfactoriamnete");
            }
        else
            {
                edad=18-edad;
                System.out.println("Joven "+nombre+" no puede votar, usted puede votar en "+edad+" años");
            }
               
    }
    
}
