
package OOP1;


public class MainRectangle {
    public static void main(String[] args) {
        Rectangle perspjg = new Rectangle();
        perspjg.setPanjang(10);
        perspjg.setLebar(6);
        System.out.println("Panjang persegi panjang: "+perspjg.panjang+ " cm");
        System.out.println("Lebar persegi panjang: "+perspjg.lebar+ " cm");
        System.out.println("Luas persegi panjang : "+perspjg.Luas()+ " cm");
        System.out.println("Keliling persegi panjang : "+perspjg.Keliling()+ " cm");
    }
    
}
