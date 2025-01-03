
import java.util.*;
import java.math.*;
public class ejer4_10 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double ph,tot;
        int h,acum1=0;
        
        for (int d = 1; d <= 6; d++) {
            System.out.println("cuantas horas trabajo el empleado el dia "+d);
            h=teclado.nextInt();
            acum1=acum1+h;
                     
        }  
        System.out.println("el empleado por toda la semana trabajo "+acum1+" horas");
        System.out.println("a como es el pago por hora de el empleado ");
            ph=teclado.nextDouble();
            tot=acum1*ph;
        System.out.println("el sueldo semanal es de: "+tot);
    }
}
