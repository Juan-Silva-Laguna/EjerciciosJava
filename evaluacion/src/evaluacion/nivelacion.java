

package evaluacion;
import java.util.*;
public class nivelacion {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,min,max,aux;
        String n="",no="";
       String a="",ap="";
       String nombres[] = new String [3];
       String apellidos[] = new String [3];
       int cedulas[] = new int [3];
       String union[] = new String [3];
       String acum[] = new String [3];
       
        for (i = 0; i < 3; i++) {
            System.out.println("Digite el nombre: "+(i+1));
            nombres[i] = teclado.next();
        }
        for (i = 0; i < 3; i++) {
            System.out.println("señor "+nombres[i]+" Digite su apellido: ");
            apellidos[i] = teclado.next();
        }
        for (i = 0; i < 3; i++) {
            System.out.println("señor "+nombres[i]+" "+apellidos[i]+" Digite su numero de cedula: ");
            cedulas[i] = teclado.nextInt();
        }
        for (i = 0; i < 3; i++) {
            union[i]= nombres[i]+" "+apellidos[i]+" con cedula: "+cedulas[i];
        }
        min=cedulas[0];
       max=cedulas[0];
        
        for(i=0;i<3;i++)
        {
         
                if(min>cedulas[i])
                {
                    min=cedulas[i];
                    n=nombres[i]+" "+apellidos[i];
                    
                }
                
            if(max<cedulas[i])
                {
                    max=cedulas[i];
                    no=nombres[i]+" "+apellidos[i];
                }
        }
        System.out.println("el numero menor de las cedulas es: "+min+" que le corresponde a: "+n);
        System.out.println("el numero mayor de las cedulas es: "+max+" que le corresponde a: "+no);
        for (i = 0; i < 3; i++) {
            System.out.println(union[i]);
        }
        
        for(int  x=0; x < 3; x++)
        {
           for(i=0;i <3; i++)
           {
               
               if(cedulas[x] < cedulas[i])
                     {
                       aux = cedulas[x];
                       cedulas[x] = cedulas[i];
                       cedulas[i] = aux;
                       
                       n=nombres[x];
                       nombres[x] = nombres[i];
                       nombres[i]=n;
                       
                       a=apellidos[x];
                       apellidos[x] = apellidos[i];
                       apellidos[i]=a;
                       
                     }
               
               
           }
           
        }
        System.out.println("el arreglo resultante ordenado quedaria asi:");
        for(i = 0;i <3; i++)
           {
              {
            System.out.println("cedula "+cedulas[i]+" que le corresponde a "+nombres[i]+" "+apellidos[i]);
              } 
           }
        
    }

}