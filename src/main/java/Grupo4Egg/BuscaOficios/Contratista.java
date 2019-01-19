
package Grupo4Egg.BuscaOficios;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Contratista {

    @Id
    @GeneratedValue
    private int idContratista;
    private String nombre;
    private String apellido;
    private String direccion;
    private int numCalle;
    private String localidad;
    private String email;
    private String telefono;
    private String password;
    @OneToMany
    private List <Oficio> oficio;
    private String horarios;
    private float desempeño;
    @OneToMany
    private List<Zona> zona;
    private String imagen;

    /*constructores*/
    public Contratista() {

    }

    public Contratista(int idContratista, String nombre, String apellido, String direccion, int numCalle, String localidad, String email, String telefono, String password, Oficio oficio, String horarios, float desempeño, List<Zona> zona, String imagen) {
        this.idContratista = idContratista;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numCalle = numCalle;
        this.localidad = localidad;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
        this.oficio = (List<Oficio>) oficio;
        this.horarios = horarios;
        this.desempeño = desempeño;
        this.zona = zona;
        this.imagen = imagen;
    }

    public int getIdContratista() {
        return idContratista;
    }

    public void setIdContratista(int idContratista) {
        this.idContratista = idContratista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Oficio getOficio() {
        return (Oficio) oficio;
    }

    public void setOficio(Oficio oficio) {
        this.oficio = (List<Oficio>) oficio;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public float getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(float desempeño) {
        this.desempeño = desempeño;
    }

    public List<Zona> getZona() {
        return zona;
    }

    public void setZona(List<Zona> zona) {
        this.zona = zona;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    

}
