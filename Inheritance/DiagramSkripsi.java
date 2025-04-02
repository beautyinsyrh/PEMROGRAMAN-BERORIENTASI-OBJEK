package Inheritance;

public class DiagramSkripsi extends DiagramBuku {
    private String npm; 
    
    public DiagramSkripsi(String npm, String judul, String penulis, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.npm = npm;
    }

    public String toString() {
        return "NPM: " + npm + ", Judul: " + judul + ", Penulis: " + getPenulis() + 
               ", Penerbit: " + penerbit + ", Tahun: " + tahun;
    }
}
