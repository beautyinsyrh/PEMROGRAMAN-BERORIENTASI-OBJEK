package OOP2_BangunRuang;

public class Kubus {
   int sisi;
   
   public void setSisi(int input_sisi){
       sisi = input_sisi;
   }
   public int ComputeAndSetVolume(){
       int Getvolume = sisi * sisi * sisi ;
       return Getvolume;
   }
}
