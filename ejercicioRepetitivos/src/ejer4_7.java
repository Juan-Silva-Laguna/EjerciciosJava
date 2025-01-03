
import java.util.*;
import java.math.*;
public class ejer4_7 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int can;
        double num,acum1=0,acum2=0;
        System.out.println("cuantas numeros va a ingresar");
        can=teclado.nextInt();
        for (int x = 1; x < can+1; x++) {
            System.out.println("ingresar cantidad numero "+x);
            num=teclado.nextDouble();
            
        if(num<=0){
            acum1=acum1+1;
        }
        else{
            acum2=acum2+1;
        }
              
        }
        System.out.println("las cantidades menores o iguales a cero son "+acum1);
        System.out.println("las cantidades mayores a cero son "+acum2);
            
    }
}