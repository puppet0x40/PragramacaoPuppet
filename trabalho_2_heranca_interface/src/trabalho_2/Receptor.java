
package trabalho_2;


public class Receptor extends Aparelho  implements Controle {
    private int volume;
    private int canal;

    
    
    void setVolume(int volume){
        this.volume = volume;
    }
    
    
    int getVolume(){
        return volume;
    }
    
    
    void setSintonia(int sintonia){
        this.canal = sintonia;
    }
    
    
    int getSintonia(){
        return canal;
    }
    
    
    
    @Override
    public void aumentaVolune() {
        if(this.getLigado() == true){
            this.setVolume(++volume);
            System.out.println("volume: "+getVolume());
        }
    }

    
    
    @Override
    public void diminuirVolune() {
        if(this.getLigado() == true){
            this.setVolume(--volume);
            System.out.println("volume: "+getVolume());
        }
    }

    
    
    @Override
    public void proximoCanal() {
        if(this.getLigado() == true){
            this.setSintonia(++canal);
            System.out.println("sintonia: " + getSintonia());
        }
    }

  
    @Override
    public void voltarCanal() {
        if(this.getLigado() == true){
            this.setSintonia(--canal);
            System.out.println("sintonia: " + getSintonia());
        }
    }

    
    
    @Override
    public void OnOff() {
        setLigado(!getLigado());
        System.out.print("radio está ");
        if(getLigado() == true){
            System.out.println("ligado");
        }else{
            System.out.println("desligado");
        }
    }
    
    
    
  

}
