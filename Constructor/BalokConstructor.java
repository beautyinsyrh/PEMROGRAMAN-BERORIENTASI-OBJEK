
package Constructor;

public class BalokConstructor {
    int panjang, lebar,tinggi, GetVolume;
    
    public BalokConstructor(){
        this.panjang = 2;
        this.lebar = 3;
        this.tinggi = 1;
    }
    public BalokConstructor(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public int ComputeAndSetVolume(){
        GetVolume = panjang * lebar * tinggi;
        return GetVolume;
    }
}
