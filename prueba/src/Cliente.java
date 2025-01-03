/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanc
 */
public class Cliente extends Persona {

    private int numeroCliente;

    public Cliente(int cedula, String nombres, String apellidos, int numero) {
        super(nombres, apellidos, cedula);
        numeroCliente = numero;
    }

    public boolean Identificacion(int c) {
        return cedula == c;
    }

    public void setNumeroCliente(int n) {
        numeroCliente = n;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }
}