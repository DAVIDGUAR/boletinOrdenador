package boletin_ordenador;

/**
 *
 * @author drodriguezguardiola
 */
public class Cpu {
    
    private int nucleos,ram;
    
    
    public Cpu(int nucleos,int ram){               //constructor
       this.ram=ram;
       this.nucleos=nucleos;
        
    }

    public int getNucleos() {
        return nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
    
}
