/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico_miercoles30;
import java.util.*;

public class Validacion {
    
    static void multi(){
        int t_dato;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Elija el tipo de Dato:");
        System.out.println("1: Entero.    2: Decimal.     3:Texto");
        t_dato=teclado.nextInt();
         switch(t_dato){
             case 1:{
                 Matriz.entero();
                 break;
             }
             case 2:{
                 Matriz.decimal();
                 break; 
             }
             case 3:
            {
                Matriz.texto();
                break;
            }
            default:{
                System.out.println("solo puede escoger la opcion 1 2 o 3");

            } 
         }        
    }
    
    static void uni(){
        int t_dato;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Elija el tipo de Dato:");
        System.out.println("1: Entero.    2: Decimal.     3:Texto");
        t_dato=teclado.nextInt();
         switch(t_dato){
             case 1:{
                 MatrisUni.entero();
                 break;
             }
             case 2:{
                 MatrisUni.decimal();
                 break; 
             }
             case 3:
            {
                MatrisUni.texto();
                break;
            }
            default:{
                System.out.println("solo puede escoger la opcion 1 2 o 3");

            } 
         }        
    }
    
}
