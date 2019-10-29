package boletin_ordenador;

/**
 *
 * @author drodriguezguardiola
 */
public class Cpu {

    private int nucleos, ram;

    public Cpu(int n, int r) {               //constructor
        this.ram = r;
        this.nucleos = n;

    }

    public int getNucleos() {
        return nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setNucleos(int n) {
        this.nucleos = n;
    }

    public void setRam(int r) {
        this.ram = r;
    }

    @Override
    public String toString() {
        return "Cpu{" + "nucleos=" + nucleos + ", ram=" + ram + '}';
    }

}
