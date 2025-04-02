
package OOP2_BangunRuang;

public class MainLimasSegiEmpat {
    public static void main(String[] args) {
        LimasSegiEmpat l = new LimasSegiEmpat();
        l.setPanjangSisi(5);
        l.setTinggiLimas(10);
        System.out.println("Panjang sisi alas: "+l.sisi+" cm");
        System.out.println("Tinggi limas: "+l.tinggi_limas+" cm");
        System.out.println("Volume limas: "+l.ComputeAndSetVolume()+" cm");
          
    }
    
}
