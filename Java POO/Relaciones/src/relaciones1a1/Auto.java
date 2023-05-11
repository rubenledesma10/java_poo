package relaciones1a1;

public class Auto {
    
    private Long id;
    private String marca;
    private String modelo;
    
    private Propietario prop; //declaro un nuevo objeto propietario, y de esta menera genero una relacion 1 a 1, auto y propietario tienen una relacion 1 a 1
    
    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, Propietario prop) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.prop = prop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }

   
    
}
