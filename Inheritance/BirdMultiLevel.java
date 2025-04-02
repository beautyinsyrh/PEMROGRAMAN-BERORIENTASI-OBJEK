
package Inheritance;

public class BirdMultiLevel extends AnimalMultiLevel {
   public BirdMultiLevel() {
       super();
       System.out.println("I am a bird");
   }
   public void speak(){
       System.out.println("Chirp ... Chirp...");
   }
   public void fly(){
       System.out.println("I'm flying");
   }
}
