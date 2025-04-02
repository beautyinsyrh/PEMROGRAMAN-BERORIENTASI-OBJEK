package OOP1;

public class Square {
    private int sisi;
    
    public void setSisi(int input_sisi){
        sisi = input_sisi;
    }
    
    public int getSisi(){
        return sisi;
    }
    
    public int Luas(){
        int luas = sisi*sisi;
        return luas;
    }
    
    public int Keliling(){
        int keliling = 4*sisi;
        return keliling;
    }
}
