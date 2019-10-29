package boletin_ordenador;

/**
 *
 * @author drodriguezguardiola
 */
public class Monitor {
    
    private String marca;
    private float pulgadas;
    
    public Monitor(String marca,float pulgadas){            //constructor
        this.marca=marca;
        this.pulgadas=pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + "\n pulgadas=" + pulgadas + '}';
    }
    
}
