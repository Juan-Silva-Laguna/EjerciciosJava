
package metodos;
import java.util.*;

public class calculadora2 {
    
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
        System.out.println("\n");
        System.out.println("suma (+)  resta(-)  multiplicacion(*) division(/)  Potenciacion(elevado)  raiz(raiz)  porceentaje(%)"
                +  "seno(seno)");
        switch (sim){
            case "+":
            {
                System.out.println("total de la suma es "+operacionesBasicas.suma(val1,val2));
                break;
            }
            case "-":
            {
                System.out.println("total de la resta es "+operacionesBasicas.resta(val1,val2));
                break;
            }
            case "*":
            {
                System.out.println("total de la multiplicacion es "+operacionesBasicas.multi(val1,val2));
                break;
            }
            case "/":
            {
                System.out.println("total de la division es "+operacionesBasicas.divi(val1,val2));
                break;
            }
            case "elevado":
            {
                System.out.println(val1+"elevado a la"+val2+" es "+operacionesMatematicas.potencia(val1,val2));
                break;
            }
            case "raiz":
            {
                System.out.println(val1+"elevado a la"+val2+" es "+operacionesMatematicas.raiz(val1,val2));
                break;
            }
            case "%":
            {
                System.out.println(val1+" porciento del "+val2+" es "+operacionesMatematicas.porciento(val1,val2));
                break;
            }
            case "seno":
            {
                System.out.println(val1+"elevado a la"+val2+" es "+operacionesMatematicas.sin(val1,val2));
            }
        }
        
    }
    
    
    
    
    
}
