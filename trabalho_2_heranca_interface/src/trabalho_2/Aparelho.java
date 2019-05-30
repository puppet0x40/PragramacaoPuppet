
package trabalho_2;


public class Aparelho {
    private String marca = null;
    private String modelo = null ;
    private int numeroDeSerie = 0;
    private boolean ligado = false;
    
    
    
    
    void setModelo(String modelo){
        this.modelo = modelo; 
    }
    
    String getModelo(){
        return modelo; 
    }
    
    void setMarca(String marca){
        this.marca = marca; 
    }
    
    String getMarca(){
        return marca; 
    }
    
    
    
    void setNumeroDeSerie(int numeroDeSerie){
        this.numeroDeSerie = numeroDeSerie; 
    }
    
    int getnumeroDeSerie(){
        return numeroDeSerie; 
    }
    
    
    
    void setLigado(boolean ligado){
        this.ligado = ligado; 
    }
    
    boolean getLigado(){
        return ligado; 
    }
    
    
    
    

}

