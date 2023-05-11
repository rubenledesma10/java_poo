/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones1an;

/**
 *
 * @author ledes
 */
public class Propietario {
    
    private Long id;
    private String nombre;
    private String apellido;

    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public Propietario() {
    }
    
    public Propietario(long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
