
package Observer1;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        // Instanciar el objeto que será Observado
         UnObservado objObservado = new UnObservado();
         objObservado.agregarObservador( new UnObservador() );
         objObservado.agregarObservador( new UnObservador() );
         objObservado.agregarObservador( new UnObservador() );
         
         objObservado.setNombre("PEPE");
         objObservado.setNombre("MARTA");
    }
}