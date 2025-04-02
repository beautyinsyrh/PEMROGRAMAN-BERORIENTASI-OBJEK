
package OOP2_BangunRuang;

public class LimasSegiEmpat {
    int sisi, tinggi_limas;
    
    public void setPanjangSisi(int input_sisi){
        sisi = input_sisi;
    }
    public void setTinggiLimas(int input_tinggi){
        tinggi_limas = input_tinggi;
    }
    public double ComputeAndSetVolume(){
        double GetVolume = sisi * sisi * tinggi_limas / 3;
        return GetVolume;
    }
}
