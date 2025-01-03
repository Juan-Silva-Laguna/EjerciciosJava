

package Arreglos;
import java.util.*;
public class ejer5_6 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,mayor=0,menor=0;
       
       String alumnos[] = new String [10];
       int edad[]= new int [10];

        for (i = 0; i < 10; i++) {

                System.out.println("Digite el nombre del estudiante numero: "+(i+1));
                alumnos[i] = teclado.next();
        }
        for (i = 0; i < 10; i++) {

                System.out.println("Ahora digite su rspectiva edad: ");
                edad[i] = teclado.nextInt();
         }
        
        System.out.println("el listado siguiente muestra el nombre con su respectiva edaad:");

        for (i = 0; i < 10; i++) {
            
                System.out.print("Nombre:" + alumnos[i] + " con una edad de: "+edad[i]+" años");
            
                System.out.print("\n");
            
        }
        for (i = 0; i < 10; i++) {
                if (menor > edad[i]) {
				menor = edad[i];
			}  
         }
        mayor=menor;
        for (i = 0; i < 10; i++) {
                if (mayor < edad[i]) {
				mayor = edad[i];
			}  
         }
        System.out.println("la edad mayor es: "+mayor);
       
    }

}