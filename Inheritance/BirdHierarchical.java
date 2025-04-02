
package Inheritance;

public class BirdHierarchical extends AnimalHierarchical{
    public BirdHierarchical(){
        super();
        name = "Bird";
        System.out.println("I am a "+name);
    }
    public void speak(){
        System.out.println("Chirp ... Chirp...");
    }
    public void fly(){
        System.out.println("I am flying");
    }
}
