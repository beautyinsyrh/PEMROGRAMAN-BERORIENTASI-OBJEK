
package OOP2_BangunRuang;

public class MainKubus {
    public static void main(String[] args) {
        Kubus k = new Kubus();
        k.setSisi(7);
        System.out.println("Panjang sisi kubus : " +k.sisi+ " cm");
        System.out.println("Volume kubus : "+k.ComputeAndSetVolume()+ " cm");
    }
    
}
