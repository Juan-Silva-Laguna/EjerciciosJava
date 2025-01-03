
package metodos;
import java.util.*;
public class Metodos {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int val1,val2;
        String sim;
        System.out.println("ingrese valor 1");
        val1=teclado.nextInt();
        System.out.println("ingrese valor 2");
        val2=teclado.nextInt();
        System.out.println("ingrese simbolo para desarrolla la operacion");
        sim=teclado.next();
        switch (sim){
            case "+":
            {
                suma(val1,val2);
                break;
            }
            case "-":
            {
                resta(val1,val2);
                break;
            }
            case "*":
            {
                multi(val1,val2);
                break;
            }
            case "/":
            {
                divi(val1,val2);
            }
        }
        
    }
    public static void suma(int val1, int val2){
        System.out.println("total de la suma es "+(val1+val2));
    }
    public static void resta(int val1, int val2){
        System.out.println("total de la resta es "+(val1-val2));
    }
    public static void multi(int val1, int val2){
        System.out.println("total de la multiplicacion es "+(val1*val2));
    }
    public static void divi(int val1, int val2){
        System.out.println("total de la division es "+(val1/val2));
    }
    
}
