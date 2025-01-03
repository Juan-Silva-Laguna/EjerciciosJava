

package evaluacion;
import java.util.*;
public class problema_3 {

    public static void main(String[] args) { 
    try 
            (Scanner teclado = new Scanner(System.in)) 
        {
            
            int i;
            String[] Nombre = new String[10];
            double[] Nota = new double[10];
            String[] Calificacion = new String[10];

            System.out.println("Ingrese nombres y notas .");
            
            for(i=0;i<10;i++){
                 
                System.out.println("Alumno " + (i+1) + ": ");
                Nombre[i] = teclado.nextLine();
                System.out.print("Joven "+Nombre [i]+" Ingrese su nota :");
                
                do{
                    Nota[i] = Double.parseDouble(teclado.nextLine());
                    
                    if(Nota[i] >= 0 && Nota[i] < 4.99)
                    {
                        Calificacion[i] = "Perdido";
                    }
                    else if(Nota[i] >= 5 && Nota[i] < 6.99) 
                    {
                        Calificacion[i] = "Bien";
                    }
                    else if(Nota[i] >= 7 && Nota[i] < 8.99)
                    {
                        Calificacion[i] = "Notable";
                    }
                    else if(Nota[i] >= 9 && Nota[i] <= 10) 
                    {
                        Calificacion[i] = "Sobresaliente";
                    }
                    else 
                    {
                        System.out.println("ERROR EN LA NOTA" + "\nDigite nuevamente la nota") ;
                    }
                } 
                while(Nota[i] < 0 || Nota[i] > 10);
            }
            for (i = 0; i <10; i++) {                
                System.out.println("La nota de "+Nombre[i]+" es :"+Calificacion[i]);                
            }
        }catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
    
}
