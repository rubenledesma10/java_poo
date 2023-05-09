
package encapsulamiento;

public class Alumno {
    
    //los atributos tienen que ser privados para que no cualquier clase no puedan acceder a ellas
    private int id;
    private String nombre;
    private String apellido;
    
    //si alumno fuese clase hija de otra clase (por ejemplo clase persona) uso protected)
    
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
