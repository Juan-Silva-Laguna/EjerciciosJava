
package ejerciciorepetitivos;
import java.util.*;
import java.math.*;
public class EjercicioRepetitivos {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int y=0,x=1,val1,val2;
        double tot;
        
        try{
         while (x!=0){
             
             System.out.println("ingre operacion a realizar (1:x  2:+  3:-  4:/  0:Salir)");
             y=teclado.nextInt();
             
             
             switch(y){
                 case 1:
                     System.out.println("usted escogio multiplicacion");
                     System.out.println("ingrese primer valor");
                     val1=teclado.nextInt();
                     System.out.println("ingrese segundo valor");
                     val2=teclado.nextInt();
                     tot=val1*val2;
                     System.out.println("total: "+tot);
                     break;
                 case 2:
                     System.out.println("usted escogio suma");
                     System.out.println("ingrese primer valor");
                     val1=teclado.nextInt();
                     System.out.println("ingrese segundo valor");
                     val2=teclado.nextInt();
                     tot=val1+val2;
                     System.out.println("total: "+tot);
                     break;
                 case 3:
                     System.out.println("usted escogio resta");
                     System.out.println("ingrese primer valor");
                     val1=teclado.nextInt();
                     System.out.println("ingrese segundo valor");
                     val2=teclado.nextInt();
                     tot=val1-val2;
                     System.out.println("total: "+tot);
                     break;
                 case 4:
                     System.out.println("usted escogio division");
                     System.out.println("ingrese primer valor");
                     val1=teclado.nextInt();
                     
                     val2=1;
                             do{
                                 System.out.println("ingrese segundo valor");
                                 val2=teclado.nextInt();
                                 if (val2==0) {
                                     System.out.println("no puede dividir por cero");
                                    }
                                    }while (val2==0);
                                    tot=val1/val2;
                                    System.out.println("total: "+tot);        
                     break;         
                case 0:
                    x=0;
                      System.out.println("salir");
                      break;
                      
                    default:
                        System.out.println("opcion no valida");
                               
            }
         }
             
        }catch(Exception e)
        {
            System.out.println("error de ingreso de datos");
        }
    }
    
}
