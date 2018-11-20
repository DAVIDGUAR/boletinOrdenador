package boletin_ordenador;

/**
 *
 * @author drodriguezguardiola
 */
public class Ordenador {
    
    private Cpu procesador ;
    private Rato raton = new Rato();
    private Teclado teclas = new Teclado();
    private Monitor pantalla ;
    
    
    
   
     public Ordenador(int nucleos,int ram,boolean inhalambrico,String modelo,int numTecla,String marca, float pulgadas){ //constructor
       procesador= new Cpu(nucleos,ram);  
       raton.setModelo(modelo);
       raton.setInhalambrico(inhalambrico);
       teclas.setNumTeclas(numTecla);
       pantalla= new Monitor(marca,pulgadas);
       
         
         
         
         
         
     }
     
     
     public void CalcularPrezo(){
         float prezo;
         
         prezo=procesador.getNucleos()+ prram*5+(true inhalambrico+1,5 || false inhalambrico +1) + numTeclas*0,7+pulgada*12;
     }
    
    public void VisualizarAtributos(){
        String atributos;
        
        atributos=nucleos+ram+inhalambrico,modelo,numTeclas,marca,pulgadas;
        
        System.out.println("nucleos = "+ordenador1.getNucleos+ "\nram = "+ordenador1.getRam+ "\n inhalambrico = "+ordenador1.getnumTeclas+);
        
    }
    
    
    
}
