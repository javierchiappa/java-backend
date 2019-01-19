
package Grupo4Egg.BuscaOficios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Trabajo {

    @Id
    @GeneratedValue
    private int idTrabajo;
    @ManyToOne
    private Contratista contratista;
    @ManyToOne
    private Cliente cliente;
    private String descripcion;
    private float presupuesto;
    @ManyToOne
    private Estado estado;
    private String comentarioCliente;
    private String comentarioContratista;
    private int puntuacionCliente;
    private int puntuacionContratista;
    private String direccion;
    private int numCalle;
    private String localidad;
    @ManyToOne
    private Zona zona;

    /*constructores*/
    public Trabajo() {

    }

    public Trabajo(int idTrabajo, Contratista contratista, Cliente cliente, String descripcion, float presupuesto, Estado estado, String comentarioCliente, String comentarioContratista, int puntuacionCliente, int puntuacionContratista, String direccion, int numCalle, String localidad, Zona zona) {
        this.idTrabajo = idTrabajo;
        this.contratista = contratista;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
        this.estado = estado;
        this.comentarioCliente = comentarioCliente;
        this.comentarioContratista = comentarioContratista;
        this.puntuacionCliente = puntuacionCliente;
        this.puntuacionContratista = puntuacionContratista;
        this.direccion = direccion;
        this.numCalle = numCalle;
        this.localidad = localidad;
        this.zona = zona;
    }

    /*getters & setters*/

    public int getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public Contratista getContratista() {
        return contratista;
    }

    public void setContratista(Contratista contratista) {
        this.contratista = contratista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getComentarioCliente() {
        return comentarioCliente;
    }

    public void setComentarioCliente(String comentarioCliente) {
        this.comentarioCliente = comentarioCliente;
    }

    public String getComentarioContratista() {
        return comentarioContratista;
    }

    public void setComentarioContratista(String comentarioContratista) {
        this.comentarioContratista = comentarioContratista;
    }

    public int getPuntuacionCliente() {
        return puntuacionCliente;
    }

    public void setPuntuacionCliente(int puntuacionCliente) {
        this.puntuacionCliente = puntuacionCliente;
    }

    public int getPuntuacionContratista() {
        return puntuacionContratista;
    }

    public void setPuntuacionContratista(int puntuacionContratista) {
        this.puntuacionContratista = puntuacionContratista;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumCalle() {
        return numCalle;
    }

    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }


}
