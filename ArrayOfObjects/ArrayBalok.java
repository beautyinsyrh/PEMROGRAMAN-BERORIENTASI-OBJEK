
package ArrayOfObjects;

public class ArrayBalok {
     int panjang, lebar,tinggi, GetVolume;
    
    public ArrayBalok(){
        this.panjang = 2;
        this.lebar = 3;
        this.tinggi = 1;
    }
    public ArrayBalok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public int ComputeAndSetVolume(){
        GetVolume = panjang * lebar * tinggi;
        return GetVolume;
    }
}
