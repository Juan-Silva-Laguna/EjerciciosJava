package selectivos;

import java.util.*;
import java.math.*;
public class ejer_3_10 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int vac;
    double pres,tot,con;
        System.out.println("a donde le gustaria ir en estas vacaciones:");
        System.out.println("1: Mexico");
        System.out.println("2: P.V");
        System.out.println("3: Acapulco");
        System.out.println("4: Cancun");
        vac=teclado.nextInt();
        System.out.println("precio por km");
        pres=teclado.nextDouble();
        System.out.println("con cuanto dinero cuenta?");
        con=teclado.nextDouble();
        switch(vac){
            case 1:
            {
                tot=(pres*750)*2;
                if (con>tot) {
                    System.out.println("el viaje cuesta "+tot+" con el dindero que usted cuenta si puede viajar");   
                }
                else{
                    System.out.println("lamentablemente tiene que quedarse en casa.");
                }
                break;
            }
            case 2:
            {
                tot=(pres*800)*2;
                if (con>tot) {
                    System.out.println("el viaje cuesta "+tot+" con el dindero que usted cuenta si puede viajar");   
                }
                else{
                    System.out.println("lamentablemente tiene que quedarse en casa.");
                }
                break;
            }
            case 3:
            {
                tot=(pres*1200)*2;
                if (con>tot) {
                    System.out.println("el viaje cuesta "+tot+" con el dindero que usted cuenta si puede viajar");   
                }
                else{
                    System.out.println("lamentablemente tiene que quedarse en casa.");
                }
                break;
            }
            case 4:
            {
                tot=(pres*1800)*2;
                if (con>tot) {
                    System.out.println("el viaje cuesta "+tot+" con el dindero que usted cuenta si puede viajar");   
                }
                else{
                    System.out.println("lamentablemente tiene que quedarse en casa.");
                }
            }
            default:
            {
                System.out.println("no tenemos mas ofertas de viaje");
            }
                
         }
    }
}