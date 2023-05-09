package Logica;

public class Alumno {
    //ATRIBUTOS (las caracterticas que va a tener este alumno)
    //estas son variables globales
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        //estas son locales
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
    
    
    
    //METODO (acciones que va a tener este alumno)
    public void mostrarNombre() { //modificador de acceso (aca seria public) + tipo de dato que va a devolver este metodo,
                                  //en caso de que devuelva un valor (aca va void porque va a mostrar algo por pantalla)
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public void saberAprobado(double calificacion) {
        if (calificacion >= 6) {
            System.out.println("Aprobe");
        } else {
            System.out.println("Desaprobe");
        }
    }

}
