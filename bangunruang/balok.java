
package OOP2_BangunRuang;
public class Balok {
    int panjang, lebar, tinggi;
    
    public void setPanjang(int input_panjang){
        panjang = input_panjang;
    }
    public void setLebar(int input_lebar){
        lebar = input_lebar;
    }
    public void setTinggi(int input_tinggi){
        tinggi = input_tinggi;
    }
    public int ComputeAndSetVolume(){
        int GetVolume = panjang * lebar * tinggi;
        return GetVolume;
    }
}
