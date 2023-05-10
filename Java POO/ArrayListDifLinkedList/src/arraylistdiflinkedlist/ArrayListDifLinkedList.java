package arraylistdiflinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDifLinkedList {

    public static void main(String[] args) {
        List<Persona> listaArray = new ArrayList<Persona>();

        listaArray.add(new Persona(1, "Ruben", 26));
        listaArray.add(new Persona(2, "Lucas", 28));
        listaArray.add(new Persona(3, "Pablo", 33));
        listaArray.add(new Persona(4, "Nancy", 56));
        listaArray.add(new Persona(5, "Adolfo", 62));

        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "Ruben", 26));
        listaLinked.add(new Persona(2, "Lucas", 28));
        listaLinked.add(new Persona(3, "Pablo", 33));
        listaLinked.add(new Persona(4, "Nancy", 56));
        listaLinked.add(new Persona(5, "Adolfo", 62));

        //REMOVE ARRAYLIST
        listaArray.remove(0); //hago referencia a la lsita que quiero borrar y el indice en el cual se encuentra que yo quiero eliminar

        //REMOVE LINKEDLIST
        String nombreBorrar = "Ruben"; //variable auxiliar para lo que quiero borrar
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)) { //si el nombre de la persona es igual a la variable nombre borrar
                listaLinked.remove(persona2); //voy a borrar la persona
                break; //corto que deje de recorrer, para que la lista se reacomode y podamos volver a recorrerla
            }
        }

        System.out.println("DESPUES DE ELIMINAR");
        System.out.println("ARRAYLIST");
        for (Persona persona : listaArray) {
            System.out.println(persona.getNombre());
        }

        System.out.println("LINKEDLIST");

        for (Persona persona2 : listaLinked) {
            System.out.println(persona2.getNombre());
        }

        //TAMAÑO DE LA LISTA
        System.out.println("TAMAÑO DE LA LISTAS");
        System.out.println("ArrayList: " + listaArray.size()); //size muestra la cantidad de elementos que tiene la lista
        System.out.println("LinkedList: " + listaLinked.size());

        //OBTENER PRIMER OBJETO (SOLO PARA LINKEDLIST)
        System.out.println("PRIMER Y ULTIMO OBJETO (SOLO PARA LINKEDLIST)");
        System.out.println("Primer elemento de LinkedList: " + listaLinked.getFirst().toString()); //toString es para que nos muestra el nombre de lo que hay, sino nos va a mostrar un codigo y no vamos a entender, pasa un objeto a un formato String
        System.out.println("Ultimo elemento de Linkedlist: " + listaLinked.getLast().toString());

        //BORRAR TODA LA LISTA
        System.out.println("Borrado de ambas listas");
        listaArray.clear();
        listaLinked.clear();

        //COMPROBAR SI ESTA VACIA
        System.out.println("¿Esta vacia alguna lista?");
        System.out.println("ArrayList: " + listaArray.isEmpty()); //con isEmpty pregunto si esta vacia la lista, me devuelve un true si esta vacio y un false si tiene algun registro
        System.out.println("LinkedList: " + listaLinked.isEmpty());

    }

}
