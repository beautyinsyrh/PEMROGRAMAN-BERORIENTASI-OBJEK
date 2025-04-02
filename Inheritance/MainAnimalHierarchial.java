
package Inheritance;

public class MainAnimalHierarchial {

    public static void main(String[] args) {
        AnimalHierarchical a = new AnimalHierarchical();
        a.speak();
        BirdHierarchical b = new BirdHierarchical();
        b.speak();
        CatHierarchical c = new CatHierarchical();
        c.speak();
    }
    
}
