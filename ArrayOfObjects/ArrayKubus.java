
package ArrayOfObjects;

   public class ArrayKubus {
    int sisi, GetVolume;
    
    public ArrayKubus(){
        this.sisi = 5;
    }
    
    public ArrayKubus(int sisi){
        this.sisi = sisi;
    }
    public int ComputeAndSetVolume(){
        GetVolume = sisi * sisi * sisi;
        return GetVolume;
    }
} 

