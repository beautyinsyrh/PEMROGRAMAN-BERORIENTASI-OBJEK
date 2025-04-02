
package Inheritance;


public class MainAnimalMultiLevel {

    public static void main(String[] args) {
        BirdMultiLevel bm = new BirdMultiLevel();
        bm.speak();
        bm.fly();
        PenguinMultiLevel pm = new PenguinMultiLevel();
        pm.speak();
        pm.fly();
    }
    
}
