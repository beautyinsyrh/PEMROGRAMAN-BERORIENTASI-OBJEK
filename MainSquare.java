
package OOP1;

public class MainSquare {
    public static void main(String[] args) {
        Square kotak1 = new Square();
        kotak1.setSisi(5);
        System.out.println("Sisi persegi = " +kotak1.getSisi()+" cm");
        System.out.println("Luas persegi = " +kotak1.Luas()+" cm");
        System.out.println("Keliling persegi = "+kotak1.Keliling()+" cm");
    }
    
}
