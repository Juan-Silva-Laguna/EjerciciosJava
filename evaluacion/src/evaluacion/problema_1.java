

package evaluacion;
import java.util.*;
public class problema_1 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int i,j,acum=0;
       double tot=0,aux,mayor=0,menor=0;
       double matriz1 [][] = new double [3][3];
       double matriz2 [][] = new double [3][3];
       double matriz3 [][] = new double [3][3];
        for (i = 0; i < 3; i++) {
                for ( j = 0; j < 3; j++) {
                
                System.out.println("Digite el numero para la posición: " +(i+1)+ ", " +(j+1));
                matriz1[i][j] = teclado.nextInt();
                }
        }
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                matriz2[i][j]=Math.floor(Math.random()*100);
            }
         }
       
        System.out.println("la matriz 1 que usted relleno es:");

        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print("["+matriz1[i][j] + "]");
            }
                System.out.print("\n");
        }
        System.out.println("la matriz 2 con numeros aleatories es:");

        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print("["+matriz2[i][j]+"] ");
            }
                System.out.print("\n");
        }
        
        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
              matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        System.out.println("la matriz 3 que es la suma de los elementos de las 2 matrices anteriores es:");

        for (i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print("["+matriz3[i][j] +"] ");
            }
                System.out.print("\n");
        }
        //ordenar de mayor a menor matriz 3
        for( i=0; i < 3; i++)
        {
           for( j=0;j <3; j++)
           {
              for(int x = 0; x < 3; x++)
              {
                  for(int y=0; y < 3 ; y++)
                  {
                     if(matriz3[i][j] < matriz3[x][y])
                     {
                       aux = matriz3[i][j];
                       matriz3[i][j] = matriz3[x][y];
                       matriz3[x][y] = aux;
                       

                     }
                  }
              }
           }
        }
        System.out.println("la matriz 3 ordenadamente quedaria asi:");
        for( i = 0;i <3; i++){
           for( j = 0;j <3; j++)
           {
            System.out.print("["+matriz3[i][j]+"] ");
            } 
               System.out.print("\n");
           } 
       
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (menor > matriz1[i][j]) {
                    menor = matriz1[i][j];
                 } 
            }
         }
        mayor=menor;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (mayor < matriz1[i][j]) {
                    mayor = matriz1[i][j];
		} 
            }
         }
        System.out.println("el numero mayor de la matriz 1 es: "+mayor);
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (menor > matriz2[i][j]) {
                    menor = matriz2[i][j];
                 } 
            }
         }
        mayor=menor;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (mayor < matriz2[i][j]) {
                    mayor = matriz2[i][j];
		} 
            }
         }
        System.out.println("el numero mayor de la matriz 2 es: "+mayor);
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (menor > matriz3[i][j]) {
                    menor = matriz3[i][j];
                 } 
            }
         }
        mayor=menor;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (mayor < matriz3[i][j]) {
                    mayor = matriz3[i][j];
		} 
            }
         }
        System.out.println("el numero mayor de la matriz 3 es: "+mayor);
       
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (matriz3[i][j]%2==0) {
                    acum=acum+1;
                 } 
            }
         }
        System.out.println("hay "+acum+" pares en la matriz 3 y son los siguientes.");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                tot=matriz3[i][j];
                    if (matriz3[i][j]%2==0) {
                        
                        System.out.println(tot);
                     } 

                 } 
            }
         }

    }
