package claabstractas;

public class Cuadrado implements Figura, Dibujable{
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    
    
    @Override //trae el metodo que tiene figura y lo sobreescribe por esta implementacion
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("hola, estoy dibujando un cuadrado");      
    }
    
}
