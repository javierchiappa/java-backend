
package Grupo4Egg.BuscaOficios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Cliente {
    
    @Id
    @GeneratedValue
    private int idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int numCalle;
    private String localidad;
    @OneToOne
    private Zona zona;
    private String email;
    private String telefono;
    private String password;
    private float desempeño;
    
    /*constructores*/
    public Cliente (){
        
    }

    public Cliente(int idCliente, String nombre, String apellido, String direccion, int numCalle, String localidad, Zona zona, String email, String telefono, String password, float desempeño) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numCalle = numCalle;
        this.localidad = localidad;
        this.zona = zona;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
        this.desempeño = desempeño;
    }
    
    /*getters & setters*/

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
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

    public float getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(float desempeño) {
        this.desempeño = desempeño;
    }

    

    
}
