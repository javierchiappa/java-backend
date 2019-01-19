/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupo4Egg.BuscaOficios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author BANGHO
 */
@Entity
public class Zona {
    
    @Id
    @GeneratedValue
    private Integer idZona;
    private String nombre;
    
    /**constructores**/
    public Zona() {
        
    }
        
    public Zona(String nombre) {
        this.nombre = nombre;
    }

    /*get & set*/
    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
