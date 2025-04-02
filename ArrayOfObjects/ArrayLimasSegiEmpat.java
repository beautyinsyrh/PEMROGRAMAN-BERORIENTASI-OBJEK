
package ArrayOfObjects;

public class ArrayLimasSegiEmpat {
   int sisi, tinggiLimas;
    double GetVolume;
    
    public ArrayLimasSegiEmpat(){
        this.sisi = 8;
        this.tinggiLimas = 10;
    }
    public ArrayLimasSegiEmpat(int sisi, int tinggiLimas){
        this.sisi = sisi;
        this.tinggiLimas = tinggiLimas;
    }
    public double ComputeAndSetVolume(){
        double GetVolume = sisi * sisi * tinggiLimas / 3;
        return GetVolume;
    } 
}
