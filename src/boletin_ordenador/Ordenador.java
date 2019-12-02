package boletin_ordenador;

/**
 *
 * @author drodriguezguardiola
 */
public class Ordenador {

    private Cpu procesador;
    private Rato raton = new Rato();
    private Teclado teclas = new Teclado();
    private Monitor pantalla;

    public Ordenador(Cpu datos, boolean inhalambrico, String modelo, int numTecla, String marca, float pulgadas) { //constructor
        procesador = datos;
       // raton.setInhalambrico(inhalambrico);
       // raton.setModelo(modelo);
        teclas=new Teclado(numTecla);
        pantalla = new Monitor(marca, pulgadas);
        raton =new Rato(inhalambrico,modelo);
    }

    public Ordenador() {
        
        
        
    }
    
    
    

    public float CalcularPrezo() {
        float prezo, inha;

        if (raton.isInhalambrico()) {
            inha = 1.5f;
            
        } else {
            inha = 1f;
        }
       
      return prezo = procesador.getNucleos() + procesador.getRam() * 5 + inha + teclas.getNumTeclas() * 0.7f + pantalla.getPulgadas() * 12;
    }

    public void VisualizarAtributos() {
        System.out.println("Procesador " + procesador+ ", raton=" + raton+ ", teclas=" + teclas + ", pantalla=" + pantalla);
        
    }

    @Override
    public String toString() {
        return "Ordenador{" + "procesador=" + procesador + ", raton=" + raton+ ", teclas=" + teclas + ", pantalla=" + pantalla + '}';
    }

    

    public Cpu getProcesador() {
        return procesador;
    }

    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }

    public Rato getRaton() {
        return raton;
    }

    public void setRaton(Rato raton) {
        this.raton = raton;
    }

    public Teclado getTeclas() {
        return teclas;
    }

    public void setTeclas(Teclado teclas) {
        this.teclas = teclas;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

}
