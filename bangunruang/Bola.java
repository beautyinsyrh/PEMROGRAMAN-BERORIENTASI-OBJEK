
package OOP2_BangunRuang;
public class Bola {
    int r_bola;
    public void setRadius(int input_rad){
        r_bola = input_rad;
    }
    public double ComputeAndSetVolume(){
        double GetVolume = 4/3 * Math.PI * r_bola * r_bola * r_bola;
        return GetVolume;
    }
}
