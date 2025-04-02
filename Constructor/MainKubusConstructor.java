
package Constructor;

public class MainKubusConstructor {

    public static void main(String[] args) {
        KubusConstructor k = new KubusConstructor() ;
        KubusConstructor k1 = new KubusConstructor(7);
        System.out.println("Sisi kubus: " + k1.sisi);
        System.out.println("Volume kubus dengan parameter: " + k1.ComputeAndSetVolume());
        System.out.println("Volume kubus tanpa parameter: " + k.ComputeAndSetVolume());
    }
    
}
