
package OOP2_BangunRuang;

public class MainTabung {
    public static void main(String[] args) {
        Tabung t = new Tabung();
        t.setRadius(7);
        t.setTinggi(10);
        System.out.println("Jari-jari alas: "+t.r_alas+" cm");
        System.out.println("Tinggi tabung: "+t.tinggi_tabung+" cm");
        System.out.println("Volume tabung: "+t.ComputeAndSetVolume()+ "cm");
    }
    
}
