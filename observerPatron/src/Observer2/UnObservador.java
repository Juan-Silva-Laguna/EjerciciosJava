/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

public class UnObservador implements IObservador
{
    private UnObservado objObservado;
    // ---------------------------------
     public UnObservador( UnObservado objObservado ) {
        this.objObservado = objObservado;
         objObservado.agregarObservador(this);
    }
    // ---------------------------------
    @Override
     public void observadoActualizado() {
       System.out.println("El valor del objeto Observado ha cambiado a [" + this.objObservado.getNumero() + "]");
    }
}