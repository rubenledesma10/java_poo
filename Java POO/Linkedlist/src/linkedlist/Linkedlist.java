package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>(); //con esto declaro la variable lista y la inicializo con el ArrayList...
                                                        //entre las picos pongo de lo que me va a hacer un nuevo ArrayList   
                                                        //y los parentesis hace referencia a que va a ser una nueva construccion de un nuevo arraylist
        //AGREGAR ALGO NUEVO AL FINAL DE MI LISTA
        lista.add(new Persona(1, "Ruben", 26));
        lista.add(new Persona(2, "Lucas", 28));
        lista.add(new Persona(3, "Pablo", 33));
        lista.add(new Persona(4, "Nancy", 56));
        lista.add(new Persona(5, "Adolfo", 62));
        
        //AGREGAR ALGO NUEVO AL PRINCIPIO DE MI LISTA, tenemos que agregar un 0 para indicar que empieza al principio y nada mas
        lista.add(0, new Persona(6, "Floki", 5));
        lista.add(1, new Persona(7, "Messi", 35));
        
        
        
        
        //las linkedlist no se pueden recorrer con un for porque no tienen un indice bien definido como las arraylist 
                
        //recorrido for each (elemento por elemento, por cada uno)
        
        for (Persona perso:lista){ //creo una variable auxiliar. Lo de parentesis quiere decir que por cada persona (perso) que este dentro de la lista, me traiga el nombre
            System.out.println(perso.getNombre());
        }
    }
    
}
