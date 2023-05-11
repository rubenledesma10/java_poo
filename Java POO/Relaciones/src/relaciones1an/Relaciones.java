package relaciones1an;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        Auto aut = new Auto();
        
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Logan");
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario>(); //para crear la lista de propietarios
        
        Propietario prop1 = new Propietario(); //creo propietario 1
        Propietario prop2 = new Propietario(); //creo propietario 2
        
        //SETEO EL PROPIETARIO 1
        
        prop1.setId(26L); 
        prop1.setNombre("Ruben");
        prop1.setApellido("Ledesma");
        
        //SETEO EL PROPIETARIO 2
        
        prop2.setId(35L);
        prop2.setNombre("Lionel");
        prop2.setApellido("Messi");
        
        //AGREGO LOS PROPIETARIOS A LA LISTA DE PROPIETARIOS
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        //AL AUTO LE SETEO LA LISTA DE PROPIETARIOS
        
        aut.setListaPropietarios(listaPropietarios);
        
        //MUESTRO POR PANTALLA LA LISTA DE PROPIETARIOS
        
        System.out.println("El auto " +aut.getMarca()+ " " +aut.getModelo()+ " tiene como propietarios a: "
                +aut.getListaPropietarios().toString());
        
    }
  
    
}
