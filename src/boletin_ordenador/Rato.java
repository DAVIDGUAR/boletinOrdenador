package boletin_ordenador;

/**
 *
 * @author drodriguezguardiola
 */
public class Rato {
    
    private boolean inhalambrico;
    private String modelo;

    public Rato() {                                         // por defecto constructor
    }
    
    public Rato(boolean inhalambrico,String modelo){       //constructor
        this.inhalambrico=inhalambrico;
        this.modelo=modelo;
    }

    public boolean isInhalambrico() {
        return inhalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setInhalambrico(boolean inhalambrico) {
        this.inhalambrico = inhalambrico;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
}
