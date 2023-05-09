
package Logica;

public class POO {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Ruben", "Ledesma");
        
        //aca traigo los valores de alu2 a traves del get
        System.out.println("La id del alumno 2 es: " +alu2.getId());
        System.out.println("El nombre y apellido del alumno 2 es: " +alu2.getNombre()+ " " +alu2.getApellido());
        System.out.println("---------------------------------");
        
        //aca agrego valores al alu1 que no tiene nada a traves del set
        alu1.setId(1);
        alu1.setNombre("Lionel");
        alu1.setApellido("Messi");
        
        System.out.println("La id del alumno 1 es: " +alu1.getId());
        System.out.println("El nombre y apellido del alumno 1 es: " +alu1.getNombre()+ " " +alu1.getApellido());
        
        System.out.println("---------------------------------");
        
        //aca cambio de valor a traves del set
        alu2.setId(35);
        System.out.println("La id del alumno 2 es: " +alu2.getId());
        System.out.println("El nombre y apellido del alumno 2 es: " +alu2.getNombre()+ " " +alu2.getApellido());
        
        
}
}
