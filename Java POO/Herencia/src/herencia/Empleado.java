package herencia;

public class Empleado extends Persona { //para heredar se agregar extends + el nombre de la clase de la cual hereda (en este caso Persona)
    //creamos los atributos propios de emepleado
    int num_legajo;
    String cargo;
    Double sueldo;
    
    //creamos los constructores 
    
    public Empleado(){
        
    }

    public Empleado(int num_legajo, String cargo, Double sueldo, int id, String dni, String nombre, String apellido, String domiclio, String telefono) {
        super(id, dni, nombre, apellido, domiclio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }   
    
    
}
