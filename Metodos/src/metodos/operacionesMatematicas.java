/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

public class operacionesMatematicas {
    static int potencia(int val1, int val2){
        return (int) Math.pow((double)val1,(double)val2);
    }
    static double raiz(int val1, int val2){
        return Math.pow(val1,1.0/val2);
    }
    static double porciento(double val1, double val2){
        double valor1=val1/100;
        double tot=val2*valor1;
        return tot;
    }
    static double sin(int val1, int val2){
        return (val1* Math.sin(val2));
    }
}
