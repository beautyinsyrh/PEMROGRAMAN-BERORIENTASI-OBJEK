
package OOP2_BangunRuang;

public class Tabung {
    int r_alas, tinggi_tabung;
    
    public void setRadius(int input_radAlas){
        r_alas = input_radAlas;
    }
    public void setTinggi(int input_tinggiTabung){
        tinggi_tabung = input_tinggiTabung;
    }
    public double ComputeAndSetVolume(){
        double Getvolume = Math.PI * (r_alas * r_alas) * tinggi_tabung;
        return Getvolume;
    }
}
