/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer1;


import java.util.ArrayList;
 public abstract class Observado
{
    private ArrayList<IObservador> observadores = new ArrayList<IObservador>();
    // ---------------------------------
    public Observado() {
    }
    // ---------------------------------
     public void agregarObservador(IObservador o) {
        observadores.add(o);
    }
    // ---------------------------------
     public void eliminarObservador(IObservador o) {
        observadores.remove(o);
    }
    // ---------------------------------
     public void notificarObservadores( Object valor )
    {
        // Enviarles la notificación a cada observador a través de su propio método
         for (IObservador obj : observadores) {
             obj.observadoActualizado(this, valor);
        }
    }
}