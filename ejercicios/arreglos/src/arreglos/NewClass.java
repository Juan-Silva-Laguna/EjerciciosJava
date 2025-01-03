/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;
import java.util.*;

/**
 *
 * @author Javier Pinto
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado =new Scanner (System.in);
        double arr[][]=new double[3][3];
        int x,y,t,c;
        double min,max,aux;
        for(x=0;x<3;x++)
        {
            for(y=0;y<3;y++)
            {
                System.out.println("digite numero posicion " + (x+1)+" . "+(y+1)+" "+arr[x][y]); 
                arr[x][y]=Math.floor(Math.random()*100);
            }
        }
       
       min=arr[0][0];
       max=arr[0][0];
        
        for(x=0;x<3;x++)
        {
            for(y=0;y<3;y++)
            {
                if(min>arr[x][y])
                {
                    min=arr[x][y];
                    System.out.println("min "+min+" posicion "+(x+1)+" "+(y+1));
                }
                if(max<arr[x][y])
                {
                    max=arr[x][y];
                    System.out.println("max "+max+" posicion "+(x+1)+ " "+(y+1) );
                }
            }
        }
        System.out.println("MINIMO " +min);
        System.out.println("MAXIMO" +max);
            for(int  i=0; i < 3; i++)
            {
               for(int  j=0;j <3; j++)
               {
                  for(x = 0; x < 3; x++)
                  {
                      for(y=0; y < 3 ; y++)
                      {
                         if(arr[i][j] < arr[x][y])
                         {
                           aux = arr[i][j];
                           arr[i][j] = arr[x][y];
                           arr[x][y] = aux;
                           System.out.println("cambio  " +arr[x][y]+",  Posicion "+(x+1)+" "+(y+1));

                         }
                      }
                  }
               }
            }
        for(int i = 0;i <3; i++)
           for(int j = 0;j <3; j++)
           {
              {
            System.out.print(arr[i][j]+"\n");
              } 
           }
    }
    
}
