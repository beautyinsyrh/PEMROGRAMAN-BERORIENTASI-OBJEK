
package Constructor;


public class BolaConstructor {
   int r_bola;
   
   public BolaConstructor(){
     this.r_bola = 5;  
   }
   
   public BolaConstructor(int r_bola){
       this.r_bola = r_bola;
   }
  
   public double ComputeAndSetVolume(){
       return 4/3 * Math.PI * r_bola * r_bola * r_bola;
   }
}
