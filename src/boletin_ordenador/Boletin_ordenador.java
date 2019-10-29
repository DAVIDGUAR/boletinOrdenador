package boletin_ordenador;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin_ordenador {

    public static void main(String[] args) {
Ordenador ordenador3 = new Ordenador();
        Ordenador ordenador1 = new Ordenador(new Cpu(5, 6), true, "b07", 49, "Asus", 15.9f);
        System.out.println(ordenador1.getPantalla().getMarca() + "\n" + (ordenador1.getPantalla().getPulgadas() * 2));
        System.out.println("Ordenador 1= "+ordenador1.toString());

        Ordenador ordenador2 = new Ordenador(new Cpu(Integer.parseInt(JOptionPane.showInputDialog("introduce cantidad de nucleos")),Integer.parseInt(JOptionPane.showInputDialog("Introduce ram"))),true,"bo7",49, "Asus", 15.9f);
        
        System.out.println("Oredenador 2= "+ordenador2.toString());
       System.out.println("Oredenador 3= "+ordenador3.toString());
//        Scanner ler = new Scanner(System.in);
//        
//        ordenador1.CalcularPrezo();
//        System.out.println("el precio seria = "+ordenador1.CalcularPrezo());
//        ordenador1.VisualizarAtributos();
//        System.out.println("el ordenador esta formado = "+ordenador1.VisualizarAtributos());
//        
//        
//        
//        
    }

}


