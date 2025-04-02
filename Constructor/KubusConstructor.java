
package Constructor;

public class KubusConstructor {
    int sisi, GetVolume;
    
    public KubusConstructor(){
        this.sisi = 5;
    }
    
    public KubusConstructor(int sisi){
        this.sisi = sisi;
    }
    public int ComputeAndSetVolume(){
        GetVolume = sisi * sisi * sisi;
        return GetVolume;
    }
}
