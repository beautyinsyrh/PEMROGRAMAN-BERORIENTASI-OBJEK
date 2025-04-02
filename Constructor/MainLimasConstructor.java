
package Constructor;

public class MainLimasConstructor {
    public static void main(String[] args) {
        LimasSegiEmpatConstructor l1 = new LimasSegiEmpatConstructor();
        LimasSegiEmpatConstructor l2 = new LimasSegiEmpatConstructor(5, 8);
        System.out.println("Sisi limas default: "+l1.sisi);
        System.out.println("Tinggi limas default: "+l1.tinggiLimas);
        System.out.println("Volume limas default: "+l1.ComputeAndSetVolume());
        System.out.println("Sisi limas: "+l2.sisi);
        System.out.println("Tinggi limas: "+l2.tinggiLimas);
        System.out.println("Volume limas: "+l2.ComputeAndSetVolume());
    }
    
}
