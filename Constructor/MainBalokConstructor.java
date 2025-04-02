
package Constructor;


public class MainBalokConstructor {
    
    public static void main(String[] args) {
        BalokConstructor b = new BalokConstructor();
        BalokConstructor b1 = new BalokConstructor(10, 7, 10);
        System.out.println("Panjang balok default: "+b.panjang);
        System.out.println("Lebar balok default: "+b.lebar);
        System.out.println("tinggi balok default: "+b.tinggi);
        System.out.println("Volume balok default: "+b.ComputeAndSetVolume());
        System.out.println("Panjang balok: "+b1.panjang);
        System.out.println("Lebar balok: "+b1.lebar);
        System.out.println("tinggi balok: "+b1.tinggi);
        System.out.println("Volume balok: "+b1.ComputeAndSetVolume());
    }
    
}
