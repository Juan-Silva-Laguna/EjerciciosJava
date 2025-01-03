/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanc
 */

import java.util.Arrays;

public class Empleado extends Persona {

    // instance variables - replace the example below with your own
    private int aniosAntiguedadEmpleado;
    public String cargoEmpleado;
    private int diasVacacionesEmpleado;
    private double salario;
    private String[] arrayCargos = {"cajero", "supervisor", "recepcionista"};

    public Empleado(int cedula, String nombres, String apellidos, int antiguedad, String cargo) {
        super(nombres, apellidos, cedula);
        aniosAntiguedadEmpleado = antiguedad;
        cargoEmpleado = cargo;
    }

    public int getAniosAntiguedadEmpleado() {
        return aniosAntiguedadEmpleado;
    }

    public void diasVacaciones(int antiguedad) {
        diasVacacionesEmpleado = 0;
        aniosAntiguedadEmpleado = antiguedad;
        if (aniosAntiguedadEmpleado <= 1) {
            diasVacacionesEmpleado = 0;
        } else if (aniosAntiguedadEmpleado == 1) {
            diasVacacionesEmpleado = 5;
        } else if (aniosAntiguedadEmpleado <= 8) {
            diasVacacionesEmpleado = (aniosAntiguedadEmpleado - 1) * 2 + 5;
        } else {
            diasVacacionesEmpleado = 20;
        }
        //return diasVacacionesEmpleado;
        System.out.println("El empleado " + nombres + " " + apellidos + " tiene " + diasVacacionesEmpleado + " dias de vacaciones");
    }

    public void setCargo(String cargo) {
        if (validarCargo(cargo)) {
            cargoEmpleado = cargo;
        } else {
            System.out.println("Ese no es un cargo valido");
        }
    }

    public String getCargo() {
        return cargoEmpleado;
    }

    public void setAniosAntiguedadEmpleado(int antiguedad) {
        aniosAntiguedadEmpleado = antiguedad;
    }

    public boolean validarCargo(String cargo) {
        return Arrays.asList(arrayCargos).contains(cargo);
    }
    
    public void Salario(double s){
        salario=s;
    }
}