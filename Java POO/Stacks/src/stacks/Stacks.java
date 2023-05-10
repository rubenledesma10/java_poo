package stacks;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("Lista vacia: " + pila);
        System.out.println("¿Esta vacia la? " + pila.isEmpty());

        //AGREGAR
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //RECORRIDO
        for (Integer pilita : pila) {
            System.out.println(pilita);
        }

        //MOSTRAR
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia? " + pila.isEmpty());
        
        //ELIMINAR EL ULTIMO REGISTRO QUE SE INGRESO
        pila.pop();
        
        //BUSCAR UN ELEMENTRO PARTICULAR DENTRO DE LA PILA. Me va a devolver un valor positivo en caso de que no lo encuentro y un -1 en caso de que no lo encuentre
        System.out.println("Esta el 3? " +pila.search(3)); //si trabajsmos con objetos que tiene mas de 1 atributo no funciona como tal
        
        //PARA SABER EL ULTIMO ELEMENTO QUE SE AGREGO
        System.out.println("Ultimo agregado: " +pila.peek());

    }

}
