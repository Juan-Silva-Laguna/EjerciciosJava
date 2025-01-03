/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer1;

public class UnObservador implements IObservador
{
    public UnObservador() {
    }
    // ---------------------------------
    @Override
     public void observadoActualizado( Observado objObservado, Object valor ) {
       System.out.println("El valor del objeto ha cambiado a [" + ((String) valor) + "]");
    }
}