/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico_miercoles30;
import java.util.*;
/**
 *
 * @author USUARIO
 */
public class Matriz {
     
    static void entero(){
        Scanner teclado = new Scanner(System.in);
        int i, j, casilla,aux;
        System.out.println("Digite el numero de casillas");
        casilla = teclado.nextInt();

       int matriz[][] = new int[casilla][casilla];
       System.out.println("la matriz original:");

        
        for (i = 0; i < casilla; i++) {

            for (j = 0; j < casilla; j++) {

                System.out.println("Digite el numero para la posición: " +(i+1)+ ", " +(j+1));
                matriz[i][j] = teclado.nextInt();
            }
            
        }
        for (i = 0; i < casilla; i++) {
            for ( j = 0; j < casilla; j++) {
                System.out.print("["+matriz[i][j] +"] ");
            }
                System.out.print("\n");
        }
        for( i=0; i < casilla; i++)
        {
           for( j=0;j < casilla; j++)
           {
              for(int x = 0; x < casilla; x++)
              {
                  for(int y=0; y < casilla; y++)
                  {
                     if(matriz[i][j] < matriz[x][y])
                     {
                       aux = matriz[i][j];
                       matriz[i][j] = matriz[x][y];
                       matriz[x][y] = aux;
                       

                     }
                  }
              }
           }
        }
        System.out.println("la matriz 3 ordenada de menor a moyor quedaria asi:");
        for( i = 0;i <casilla; i++){
           for( j = 0;j <casilla; j++)
           {
            System.out.print("["+matriz[i][j]+"] ");
            } 
               System.out.print("\n");
           } 
        
        for( i=0; i < casilla; i++)
        {
           for( j=0;j < casilla; j++)
           {
              for(int x = 0; x < casilla; x++)
              {
                  for(int y=0; y < casilla; y++)
                  {
                     if(matriz[i][j] > matriz[x][y])
                     {
                       aux = matriz[i][j];
                       matriz[i][j] = matriz[x][y];
                       matriz[x][y] = aux;
                       

                     }
                  }
              }
           }
        }
        System.out.println("la matriz 3 ordenada de mayor a menor quedaria asi:");
        for( i = 0;i <casilla; i++){
           for( j = 0;j <casilla; j++)
           {
            System.out.print("["+matriz[i][j]+"] ");
            } 
               System.out.print("\n");
           } 
    }
    
    static void decimal(){
        Scanner teclado = new Scanner(System.in);
         int i, j, casilla;
        double aux;
        System.out.println("Digite el numero de casillas");
        casilla = teclado.nextInt();

       double matriz[][] = new double[casilla][casilla];
       System.out.println("la matriz original:");
        for (i = 0; i < casilla; i++) {

            for (j = 0; j < casilla; j++) {

                System.out.println("Digite el numero para la posición: " +(i+1)+ ", " +(j+1));
                matriz[i][j] = teclado.nextInt();
            }
            
        }
        for (i = 0; i < casilla; i++) {
            for ( j = 0; j < casilla; j++) {
                System.out.print("["+matriz[i][j] +"] ");
            }
                System.out.print("\n");
        }
        for( i=0; i < casilla; i++)
        {
           for( j=0;j < casilla; j++)
           {
              for(int x = 0; x < casilla; x++)
              {
                  for(int y=0; y < casilla; y++)
                  {
                     if(matriz[i][j] < matriz[x][y])
                     {
                       aux = matriz[i][j];
                       matriz[i][j] = matriz[x][y];
                       matriz[x][y] = aux;
                       

                     }
                  }
              }
           }
        }
        System.out.println("la matriz 3 ordenada de menor a moyor quedaria asi:");
        for( i = 0;i <casilla; i++){
           for( j = 0;j <casilla; j++)
           {
            System.out.print("["+matriz[i][j]+"] ");
            } 
               System.out.print("\n");
           } 
        
        for( i=0; i < casilla; i++)
        {
           for( j=0;j < casilla; j++)
           {
              for(int x = 0; x < casilla; x++)
              {
                  for(int y=0; y < casilla; y++)
                  {
                     if(matriz[i][j] > matriz[x][y])
                     {
                       aux = matriz[i][j];
                       matriz[i][j] = matriz[x][y];
                       matriz[x][y] = aux;
                       

                     }
                  }
              }
           }
        }
        System.out.println("la matriz 3 ordenada de mayor a menor quedaria asi:");
        for( i = 0;i <casilla; i++){
           for( j = 0;j <casilla; j++)
           {
            System.out.print("["+matriz[i][j]+"] ");
            } 
               System.out.print("\n");
           } 
        
    }
    
    static void texto(){
        System.out.println("EN ESTA OPCION SOLO PUEDES ESCRIBIR NUMEROS DE UNO A CINCO");
        Scanner teclado = new Scanner(System.in);
        String casilla;
        int aux,i,j,valor=0,posicion=0;
        System.out.println("Digite el numero de casillas");
        casilla = teclado.next();
        switch(casilla)
        {
            case "uno":
            {
                valor=1;
                break;
            }
            case "dos":
            {
                valor=2;
                break;
            }
            case "tres":
            {
                valor=3;
                break;
            }
            case "cuatro":
            {
                valor=4;
                break;
            }
            case "cinco":
            {
                valor=5;
                break;
            }
            default:{
                System.out.println("Solo puede escribir hasta 5");
            } 
            
        }
        int matriz[][] = new int[valor][valor];
          for (i = 0; i < valor; i++) {
            for (j = 0; j < valor; j++) {
                String num;
                System.out.println("Escriba el numero para la posición: " +(i+1)+ ", " +(j+1));
                num=teclado.next();
                switch(num)
                    {
                        case "uno":
                        {
                            posicion=1;
                            matriz[i][j] = posicion;
                            break;
                        }
                         case "dos":
                         {
                            posicion=2;
                            matriz[i][j] = posicion;
                            break;
                         }
                        case "tres":
                        {
                            posicion=3;
                            matriz[i][j] = posicion;
                            break;
                        }
                        case "cuatro":
                        {
                            posicion=4;
                            matriz[i][j] = posicion;
                            break;
                        }
                        case "cinco":
                        {
                            posicion=5;
                            matriz[i][j] = posicion;
                            break;
                        }
                        default:{
                            System.out.println("Solo puede escribir, y solo hasta 5");
                        }
                        
                    }
                }
            }
            
                
                System.out.println("------------la matriz original es:------------");
           for (i = 0; i < valor; i++) {
            for ( j = 0; j < valor; j++) {
                String sale="";
                switch(matriz[i][j])
                    {
                        case 1:
                            sale="uno";
                            break;
                        case 2:
                            sale="dos";
                            break;
                        case 3:
                            sale="tres";
                            break;
                        case 4:
                            sale="cuatro";
                            break;
                        case 5:
                            sale="cinco";
                            break;
                        default:{
                            System.out.println("Error");
                        } 
                    }
                System.out.print("["+ sale +"] ");
            }
                System.out.print("\n");
        }
        for( i=0; i < valor; i++)
        {
           for( j=0;j < valor; j++)
           {
              for(int x = 0; x < valor; x++)
              {
                  for(int y=0; y < valor; y++)
                  {
                     if(matriz[i][j] < matriz[x][y])
                     {
                       aux = matriz[i][j];
                       matriz[i][j] = matriz[x][y];
                       matriz[x][y] = aux;
                       

                     }
                  }
              }
           }
        }
        System.out.println("------------la matriz ordenada de menor a moyor quedaria asi:------------");
        for (i = 0; i < valor; i++) {
            for ( j = 0; j < valor; j++) {
                String sale="";
                switch(matriz[i][j])
                    {
                        case 1:
                            sale="uno";
                            break;
                        case 2:
                            sale="dos";
                            break;
                        case 3:
                            sale="tres";
                            break;
                        case 4:
                            sale="cuatro";
                            break;
                        case 5:
                            sale="cinco";
                            break;
                        default:{
                            System.out.println("Error");
                        } 
                    }
                System.out.print("["+ sale +"] ");
            }
                System.out.print("\n");
        }
        
        for( i=0; i < valor; i++)
        {
           for( j=0;j < valor; j++)
           {
              for(int x = 0; x < valor; x++)
              {
                  for(int y=0; y < valor; y++)
                  {
                     if(matriz[i][j] > matriz[x][y])
                     {
                       aux = matriz[i][j];
                       matriz[i][j] = matriz[x][y];
                       matriz[x][y] = aux;
                       

                     }
                  }
              }
           }
        }
        System.out.println("------------la matriz ordenada de mayor a menor quedaria asi:------------");
                for (i = 0; i < valor; i++) {
                    for ( j = 0; j < valor; j++) {
                        String sale="nada";
                        switch(matriz[i][j])
                            {
                                case 1:
                                    sale="uno";
                                    break;
                                case 2:
                                    sale="dos";
                                    break;
                                case 3:
                                    sale="tres";
                                    break;
                                    case 4:
                                    sale="cuatro";
                                    break;
                                case 5:
                                    sale="cinco";
                                    break;
                                default:{
                                    System.out.println("Error");
                                } 
                            }
                        System.out.print("["+ sale +"] ");
                    }
                        System.out.print("\n");
                }
         System.out.print("\n");
                
            }
    
            
        }
