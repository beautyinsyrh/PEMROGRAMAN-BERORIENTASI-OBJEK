
package Constructor;


public class MainBolaConstructor {
    
    public static void main(String[] args) {
        BolaConstructor b = new BolaConstructor();
        BolaConstructor b1 = new BolaConstructor(7);
        System.out.println("Jari-jari bola default: "+b.r_bola);
        System.out.println("Volume bola default: "+b.ComputeAndSetVolume());
        System.out.println("Jari-jari bola: "+b1.r_bola);
        System.out.println("Volume bola: "+b1.ComputeAndSetVolume());
    }
    
}
