package integradorplanta;

public class IntegradorPlanta {

    public static void main(String[] args) {
        Arbol arbolito = new Arbol();
        Flor florcita = new Flor();
        Arbusto arbustito = new Arbusto();
        
        //LLAMO AL METODO DE CADA UNO PARA QUE DIGA LO QUE ES
        arbolito.decirLoQueSoy();
        florcita.decirLoQueSoy();
        arbustito.decirLoQueSoy();
        
    }
    
}
