package Logica;

public class EjercicioIntegradorPOOPokemon {
   
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu();
        
        //llamamos a los ataques de squirtle
        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();
        
        //llamamos a los ataques de charmander
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        
        //llamamos a los ataques de bulbasaur
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        
        //llamamos a los ataques de pikachu
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
        
        
    }
    
}
