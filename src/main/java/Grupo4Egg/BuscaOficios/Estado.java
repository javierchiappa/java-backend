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
public class Estado {
    @Id
    @GeneratedValue
    private Integer idEstado;
    private String estado;
    
    /*constructores*/
    public Estado (){        
    }

    public Estado(String estado) {
        this.estado = estado;
    }

    /*getters & setters*/
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
