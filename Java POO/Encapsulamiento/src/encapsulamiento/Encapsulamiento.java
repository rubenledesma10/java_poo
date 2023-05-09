
package encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno (15, "Ruben", "Ledesma");
        
        System.out.println("id: " +alu2.getId()+ " nombre: " +alu2.getNombre()+ " apellido: " +alu2.getApellido());
      
        
    }
    
}
