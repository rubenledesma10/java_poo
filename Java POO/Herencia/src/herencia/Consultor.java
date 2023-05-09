/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author ledes
 */
public class Consultor extends Persona {
    String nombre_consultora;
    int num_consultor;
    
    public Consultor(){
    }

    public Consultor(String nombre_consultora, int num_consultor, int id, String dni, String nombre, String apellido, String domiclio, String telefono) {
        super(id, dni, nombre, apellido, domiclio, telefono);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
    
    
    
    
}
