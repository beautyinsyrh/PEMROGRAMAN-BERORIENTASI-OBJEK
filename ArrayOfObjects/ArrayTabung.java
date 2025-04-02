
package ArrayOfObjects;

public class ArrayTabung {
      double r_alas;  
   int tinggiTabung;
   
   public ArrayTabung(){
       
   }
   
   public ArrayTabung(double r_alas, int tinggiTabung){
       this.r_alas = r_alas;
       this.tinggiTabung = tinggiTabung;
   }
   public double ComputeAndSetVolume(){
       double GetVolume = Math.PI * (r_alas * r_alas) * tinggiTabung;
       return GetVolume;
   } 
}
