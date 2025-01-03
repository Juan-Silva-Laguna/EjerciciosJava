

package Arreglos;
import java.util.*;
public class ejer5_9 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,j,neg=0;
        double min,suma=0;
        
       double arr[][]= new double [15][12];
       
        for(i=0;i<15;i++){
            for(j=0;j<12;j++){
                arr[i][j]=Math.floor(Math.random()*180);
                System.out.print("["+arr[i][j]+"] ");
            }
            System.out.println("\n");
        }
        
        
       for(i=0;i<5;i++)
        {
            for(j=0;j<12;j++)
            {
              suma=suma+arr[i][j]; 
            }
        }
       
       System.out.println("la suma de las 5 primeras filas es de "+suma);
       
       for(i=0;i<5;i++)
        {
            for(j=5;j<9;j++)
            {
                if (arr[i][j]<0) {
                    neg=neg+1; 
                }
            }
        }
       System.out.println("de la columna 5 a la 9 hay "+neg+" numeros negativos");
       
       min=arr[0][0];
        for(i=0;i<15;i++)
        {
            for(j=0;j<12;j++)
            {
             if(min>arr[i][j])
                {
                    min=arr[i][i];
                }
            }
        }
        System.out.println("numero menor de el arreglo: "+min);
       
    }

}