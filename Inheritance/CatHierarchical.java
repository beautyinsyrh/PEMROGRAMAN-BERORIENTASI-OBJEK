
package Inheritance;

public class CatHierarchical extends AnimalHierarchical{
    public CatHierarchical(){
        super();
        name = "cat";
        System.out.println("I am a "+name);
    }
    public void speak(){
        System.out.println("Meow");
    }
}
