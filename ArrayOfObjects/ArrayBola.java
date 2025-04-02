
package ArrayOfObjects;

public class ArrayBola {
    int r_bola;
   
   public ArrayBola(){
     this.r_bola = 5;  
   }
   
   public ArrayBola(int r_bola){
       this.r_bola = r_bola;
   }
  
   public double ComputeAndSetVolume(){
       return 4/3 * Math.PI * r_bola * r_bola * r_bola;
   } 
}
