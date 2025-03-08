
package OOP1;

public class MainElipses {
    public static void main(String[] args) {
        Elipses e = new Elipses();
        e.SetMayor(10);
        e.setMinor(7);
        System.out.println("Panjang Mayor : "+e.panjang_mayor+" cm");
        System.out.println("Panjang Minor : "+e.panjang_minor+" cm");
        System.out.println("Luas Eclipse : "+e.LuasEclipse()+ " cm");
        System.out.println("Keliling Eclipse : "+e.KelilingEclipse()+ " cm");
    }
    
}
