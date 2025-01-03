/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author USUARIO
 */
public class NewClass1 {
        public static void main(String[] args) {
            int [] arreglo = {10,8,12,7,4,9,90};
            int aux=0;
            
            
                for (int i = arreglo.length - 1 ; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        
                        if (arreglo[j]>arreglo[j+1]) {
                            aux = arreglo[j];
                            arreglo[j] = arreglo[j+1];
                            arreglo[j+1] = aux;
                        }
                    }
                }
               
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);   
            }
        }
}
