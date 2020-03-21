/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listasse.modelo;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Maria Camila
 */
@Named(value = "infante")
@Dependent
public class Infante {
     private String nombre;
     private short codigo;
     private short edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }
     
    /**
     * Creates a new instance of Infante
     */
    public Infante() {
    }
    
}
