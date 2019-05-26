
package trabalho_2;


public class Trabalho_2 {

    
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        Receptor receptor = new Receptor();
        //int opcao;
        
        tv.setMarca("toshiba ");
        tv.setModelo("S4Hd");
        tv.setNumeroDeSerie(1234);
        tv.setCanal(3);
        tv.setVolume(50);
        
        
        receptor.setMarca("oi livre");
        receptor.setModelo("OIHDfull");
        receptor.setNumeroDeSerie(458422);
        receptor.setSintonia(200);
        receptor.setVolume(80);
        
        tv.informacao();
        
        tv.OnOff();
        tv.aumentaVolune();
        tv.aumentaVolune();
        tv.aumentaVolune();
        tv.aumentaVolune();
        tv.proximoCanal();
        tv.voltarCanal();
        tv.OnOff();
       
        
        receptor.informacao();
       
        receptor.OnOff();
        receptor.aumentaVolune();
        receptor.proximoCanal();
        receptor.voltarCanal();
        receptor.OnOff();
       
    }
    
}
