package integradorplanta;

public class Flor extends Planta {

    private String colorPetalos;
    private int cantPromPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionFlorece;

    public Flor() {
    }

    public Flor(String colorPetalos, int cantPromPetalos, String colorPistilo, String variedadFlor, String estacionFlorece, String nombre, Double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPromPetalos = cantPromPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPromPetalos() {
        return cantPromPetalos;
    }

    public void setCantPromPetalos(int cantPromPetalos) {
        this.cantPromPetalos = cantPromPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }
        
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy una flor");
    }
    
}
