/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

public class Main
{
    public static void main(String[] args)
    {
        // Instanciar el objeto que será Observado
         UnObservado objObservado = new UnObservado();
        // Instanciar los observadores, pasándoles como parámetro el que será Observado
         new UnObservador( objObservado );
         new UnObservador( objObservado );
         new UnObservador( objObservado );
         
         objObservado.setNumero(55);
         
    }
}