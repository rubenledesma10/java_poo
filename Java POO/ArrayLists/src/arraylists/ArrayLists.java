package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>(); //con esto declaro la variable lista y la inicializo con el ArrayList...
                                                        //entre las picos pongo de lo que me va a hacer un nuevo ArrayList   
                                                        //y los parentesis hace referencia a que va a ser una nueva construccion de un nuevo arraylist
        //COMANDO PARA AGREGAR ALGO NUEVO A MI LISTA
        lista.add(new Persona(1, "Ruben", 26));
        lista.add(new Persona(2, "Lucas", 28));
        lista.add(new Persona(3, "Pablo", 33));
        lista.add(new Persona(4, "Nancy", 56));
        lista.add(new Persona(5, "Adolfo", 62));
        
        //recorrer por indice
        for(int i = 0; i<lista.size();i++){ //lista.size es para el tamaño de la lista
            System.out.println(lista.get(i).getNombre());
        }
        
        System.out.println("--------------------------------------");
        
        //recorrido for each (elemento por elemento, por cada uno)
        
        for (Persona perso:lista){ //creo una variable auxiliar. Lo de parentesis quiere decir que por cada persona (perso) que este dentro de la lista, me traiga el nombre
            System.out.println(perso.getNombre());
        } 

        
    }                                                   
                                                        
    
}
