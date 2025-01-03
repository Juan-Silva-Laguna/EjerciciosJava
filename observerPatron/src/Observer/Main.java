
package Observer;
import java.util.Scanner;
public class Main {
     
    
    public static void main(String[] args)
    {
         String nuevo,nuevo1,nuevo2,nuevo3,nuevo4,nuevo5;
       int op=0;
        Scanner teclado= new Scanner(System.in);
        
                UnObservado objObservado = new UnObservado();
                
                System.out.println("como va a nombrar el primer observador");
                nuevo=teclado.next();
                UnObservador objObservadorPepito = new UnObservador(nuevo);
                objObservado.agregarObservador(objObservadorPepito);
                System.out.println("\n");
                System.out.println("como va a nombrar el segundo observador");
                nuevo1=teclado.next();
                UnObservador objObservadorPepito1 = new UnObservador(nuevo1);
                objObservado.agregarObservador(objObservadorPepito1);
                System.out.println("\n");
                System.out.println("como va a nombrar el tercer observador");
                nuevo2=teclado.next();
                UnObservador objObservadorPepito2 = new UnObservador(nuevo2);
                objObservado.agregarObservador(objObservadorPepito2);
                System.out.println("\n");
                System.out.println("como va a nombrar el cuarto observador");
                nuevo3=teclado.next();
                UnObservador objObservadorPepito3 = new UnObservador(nuevo3);
                objObservado.agregarObservador(objObservadorPepito3);
                System.out.println("\n");
                System.out.println("como va a nombrar el quinto observador");
                nuevo4=teclado.next();
                UnObservador objObservadorPepito4 = new UnObservador(nuevo4);
                objObservado.agregarObservador(objObservadorPepito4);
                
        
       
    }
}
