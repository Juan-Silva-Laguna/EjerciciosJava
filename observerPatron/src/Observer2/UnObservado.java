/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

public class UnObservado extends Observado
{
    private int numero = 0;
    // ---------------------------------
    public UnObservado() {
    }
    // ---------------------------------
    public int getNumero() {
        return this.numero;
    }
    // ---------------------------------
    public void setNumero(int numero) {
        this.numero = numero;
        // Según nuestro ejemplo, cada vez que se agregue un nuevo observador, los existentes serán notificados
         notificarObservadores();
    }
}