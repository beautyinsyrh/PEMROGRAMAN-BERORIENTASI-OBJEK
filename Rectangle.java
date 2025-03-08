
package OOP1;

public class Rectangle {
   int panjang, lebar;
    
    public void setPanjang (int input_panjang){
        panjang = input_panjang;
    }
    
    public void setLebar (int input_lebar){
        lebar = input_lebar;
    }
    
    public int Luas(){
        int luas = panjang * lebar;
        return luas;
    }
    
    public int Keliling(){
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
