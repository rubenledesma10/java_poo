package Logica;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Squirtle y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola, soy Squirtle y este es mi ataque HidroBomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola, soy Squirtle y este es mi ataque PistolaAgua");
    }
    
}
