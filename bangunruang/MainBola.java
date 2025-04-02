
package OOP2_BangunRuang;

public class MainBola {
    public static void main(String[] args) {
        Bola b = new Bola();
        b.setRadius(7);
        System.out.println("Jari-jari : "+b.r_bola+" cm");
        System.out.println("Volume bola: "+b.ComputeAndSetVolume()+" cm");
    }
    
}
