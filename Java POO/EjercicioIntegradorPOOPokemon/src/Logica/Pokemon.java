package Logica;

public abstract class Pokemon {
    
    //atributos
    protected int numPokedex;
    protected String nombrePokemon;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
}
