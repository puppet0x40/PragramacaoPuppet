
package trabalho_2;


public class Main {

    
    public static void main(String[] args) {
        Televisao tv = new Televisao("toshiba ", "S4HD", 1234); 
        tv.setCanal(3);
        tv.setVolume(50);
        
        System.out.println("informaçao da televisão:");
        System.out.println("marca: " + tv.getMarca());
        System.out.println("modelo: " + tv.getModelo());
        System.out.println("numero de serie: " + tv.getnumeroDeSerie());
        
        tv.OnOff();
        tv.aumentaVolune();
        tv.aumentaVolune();
        tv.aumentaVolune();
        tv.aumentaVolune();
        tv.proximoCanal();
        tv.voltarCanal();
        tv.OnOff();
       
        Receptor receptor = new Receptor();
        receptor.setMarca("Elsys");
        receptor.setModelo("ETRS44");
        receptor.setNumeroDeSerie(458422);
        receptor.setCanal(200);
        receptor.setVolume(80);
        
        System.out.println("informaçao do receptor:");
        System.out.println("marca: " + receptor.getMarca());
        System.out.println("modelo: " + receptor.getModelo());
        System.out.println("numero de serie: " + receptor.getnumeroDeSerie());
        

       
        receptor.OnOff();
        receptor.aumentaVolune();
        receptor.proximoCanal();
        receptor.voltarCanal();
        receptor.OnOff();
       
    }
    
}
