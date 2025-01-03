

package arreglos;
import java.util.*;
public class ejer5_17 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,h,max;
        double s,acum=0;
        String n="";
       String nombres[] = new String [5];
       int horas[] = new int [5];
       double pago[] = new double [5];
       
        for (i = 0; i < 5; i++) {
            System.out.println("Digite el nombre: "+(i+1));
            nombres[i] = teclado.next();
            System.out.println("horas trabajadas de "+nombres[i]);
            horas[i] = teclado.nextInt();
            System.out.println("pago por hora");
            pago[i] = teclado.nextDouble();
            
        }
        
        for (i = 0; i < 5; i++) {
            h=horas[i]*6;
            s=h*pago[i];
            acum=acum+s;
            System.out.println(nombres[i]+" a trabajado "+h+" horas en el transcurso de la semana, por lo tanto su sueldo es de "+s);
             System.out.println("\n");
        }
        System.out.println("en total la empresa debera pagar a los 5 trabajadores un total de "+acum);
       max=horas[0];
        
        for(i=0;i<3;i++)
        {
            if(max<horas[i])
                {
                    max=horas[i];
                    n=nombres[i];
                }
        }
        System.out.println("el que trabaja mayor numero de horas es:"+n);
        
                
    }

}