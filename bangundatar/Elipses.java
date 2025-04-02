
package OOP1;
public class Elipses {
    int panjang_mayor, panjang_minor;
    
    public void SetMayor(int input_mayor){
        panjang_mayor = input_mayor;
    }
    public void setMinor(int input_minor){
        panjang_minor = input_minor;
    }
    public double LuasEclipse(){
        double luas = Math.PI * panjang_mayor * panjang_minor;
        return luas;
    }
    public double KelilingEclipse() {
        double keliling = 2 * Math.PI * Math.sqrt((panjang_mayor * panjang_mayor + panjang_minor * panjang_minor) / 2);
        return keliling;
    }
}
