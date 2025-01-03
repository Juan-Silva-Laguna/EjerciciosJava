
import java.util.*;
import java.math.*;
public class ejer4_4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
    
        double pr;
        int nu,su=0,ed,c;
        
        System.out.println("cantidad de alumnos");
        nu=teclado.nextInt();
        for (c = 1; c <= nu; c++) {
            System.out.println("edad de alumno"+c);
            ed=teclado.nextInt();
            su=su+ed;
        }
        pr=su/nu;
        System.out.println("edad promedio es"+pr);
    }
}