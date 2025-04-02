
package Constructor;

public class MainTabungConstructor {
    public static void main(String[] args) {
        TabungConstructor t1 = new TabungConstructor();
        TabungConstructor t2 = new TabungConstructor(7, 10);
        System.out.println("Jari-jari alas tabung default: "+t1.r_alas);
        System.out.println("Tinggi tabung default: "+t1.tinggiTabung);
        System.out.println("Volume tabung default: "+t1.ComputeAndSetVolume());
        System.out.println("Jari-jari alas tabung: "+t2.r_alas);
        System.out.println("Tinggi tabung: "+t2.tinggiTabung);
        System.out.println("Volume tabung: "+t2.ComputeAndSetVolume());
    }
    
}
