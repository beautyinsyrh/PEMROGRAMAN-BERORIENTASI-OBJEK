
package Constructor;

public class LimasSegiEmpatConstructor {
    int sisi, tinggiLimas;
    double GetVolume;
    
    public LimasSegiEmpatConstructor(){
        this.sisi = 8;
        this.tinggiLimas = 10;
    }
    public LimasSegiEmpatConstructor(int sisi, int tinggiLimas){
        this.sisi = sisi;
        this.tinggiLimas = tinggiLimas;
    }
    public double ComputeAndSetVolume(){
        double GetVolume = sisi * sisi * tinggiLimas / 3;
        return GetVolume;
    }
}
