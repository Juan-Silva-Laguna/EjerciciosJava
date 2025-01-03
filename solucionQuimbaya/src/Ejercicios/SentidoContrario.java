
package Ejercicios;

import java.util.Scanner;
import javax.swing.*;

public class SentidoContrario {
    private int n=0;
    private int x=0;
    public void menu(){
        int op=0;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Ejercicio numero uno\n"
                    + "2. Ejercicio numero dos\n"
                    + "3. Ejercicio numero tres\n"
                    + "4. Ejercicio numero cuatro\n"
                    + "5. Ejercicio numero cinco\n"
                    + "6. Salir"));
            
            switch(op){
            
                case 1:
                    JOptionPane.showMessageDialog(null, "En este Ejercicio se va a realizar la sumatoria en sentido "
                            + "contrario, de el numero que usted ingrese.");
                    n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
                    sumatoria(n);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "En este Ejercicio se va a realizar el factorial "
                            + "de el numero que usted ingrese.");
                    n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
                    factorial(n);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "En este Ejercicio le dira en cuanto tiempo podra generar "
                            + "x cantidad de dinero, reinvirtiendo su el dindero cada mes.");
                    x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor que va a invertir."));
                    n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tope a el que aspira llegar."));
                    interes(n, x);
                    break;
                case 4:
                    System.out.println("saliendo......");
                    break;
                case 5:
                    System.out.println("saliendo......");
                    break;
                case 6:
                    System.exit(0);
                    System.out.println("saliendo......");
                    break;
                default:
                    System.out.println("opción invalida 1 a 3 por favor :(");
                    break;
            
            }
        
        }while(op!=6);
    
    
    
    }
    
    private void sumatoria(int a){
    int resultado=0;
        for (int i = 0; i <= a; i++) {
            resultado=resultado+i;
        }
   JOptionPane.showMessageDialog(null, "El resultado es:"+resultado);

    }
    
    private void factorial (int a){
    int resultado=1;
        for (int i = 1; i <= a; i++) {
            resultado=resultado*i;
        }
   JOptionPane.showMessageDialog(null, "El resultado es:"+resultado);

    }
    
    private void interes (int a, int b){
    int resultado=0;
    int cont=1;
    
        while(b<a){
            resultado=(int) ((b*0.02)+b);
            b=resultado;
            cont++;
        }
   JOptionPane.showMessageDialog(null, "En "+cont+" meses usted podra tener "+resultado);
    }
    
    
    
}
