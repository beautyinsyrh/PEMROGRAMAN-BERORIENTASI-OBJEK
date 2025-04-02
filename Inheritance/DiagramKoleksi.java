
package Inheritance;

public class DiagramKoleksi {
    protected String judul, penerbit;
    protected int tahun;
    
    public DiagramKoleksi(String judul, String penerbit, int tahun){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    public String toString(){
        return judul+" "+penerbit+" "+tahun;
    }
}
