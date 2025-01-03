
package ejercico_miercoles30;
import java.util.*;

public class Ejercico_miercoles30 {
static int tipo;
    public static void main(String[] args) {
        
        
        try{
            menu();
        }catch (Exception e)
        {
            System.out.println("error de ingreso de datos"+e);
        }
    }
        
        static void menu(){
        int salir=0;

             do
            {
               Scanner teclado=new Scanner(System.in);
                System.out.println("Elija la opcion de su preferncia:");
         System.out.println("1: Multidimensional.    2: Unidimensional     3:Salir");
         tipo=teclado.nextInt();
         switch(tipo){
                        case 1:
                        {
                            Validacion.multi();
                            break;
                        }
                        case 2:
                        {
                            Validacion.uni();
                            break;
                        }
                        case 3:
                        {
                            System.out.println("Salio Satisfactoriamente de el sistema");
                            salir=3;
                            break;
                        }
                        default:{
                            System.out.println("solo puede escoger la opcion 1 o 2");

                        }
                        
                }
            }while  (salir!=3);
        }
           
    
    
}
