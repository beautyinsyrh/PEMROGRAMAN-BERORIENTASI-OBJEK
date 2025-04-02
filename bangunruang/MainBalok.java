
package OOP2_BangunRuang;

public class MainBalok {
    public static void main(String[] args) {
       Balok b = new Balok();
       b.setPanjang(8);
       b.setLebar(4);
       b.setTinggi(6);
       System.out.println("Panjang balok: "+b.panjang+ " cm");
       System.out.println("Lebar balok: "+b.lebar+" cm");
       System.out.println("Tinggi balok: "+b.tinggi+" cm");
       System.out.println("Volume balok: "+b.ComputeAndSetVolume()+" cm");
               
    }
    
}
