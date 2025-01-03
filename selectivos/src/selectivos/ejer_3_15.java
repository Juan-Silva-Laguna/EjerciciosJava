package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_15 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int vac;
   
        System.out.println("ingresar numero para saber dia de la semana:");
        vac=teclado.nextInt();
        
        switch(vac){
            case 1:
            {
                System.out.println("lunes");
                break;
            }
            case 2:
            {
                System.out.println("martes");
                break;
            }
            case 3:
            {
                System.out.println("miercoles");
                break;
            }
            case 4:
            {
                System.out.println("jueves");
                break;
            }
            case 5:
            {
                System.out.println("viernes");
                break;
            }
            case 6:
            {
                System.out.println("sabado");
                break;
            }
            case 7:
            {
                System.out.println("domingo");
                
            }
            default:
            {
                System.out.println("no hay mas de 7 dias en la semana");
            }
                
         }
    }
}