package Inheritance;

public class DiagramBuku extends DiagramKoleksi {
    //Anak DiagramKoleksi
    private String penulis;

    public DiagramBuku(String judul, String penulis, String penerbit, int tahun) {
        super(judul, penerbit, tahun); 
        this.penulis = penulis;
    }
    public String getPenulis() {
        return penulis;
    }

    public String toString() {
        return "judul: " + judul + " penulis: " + penulis + " penerbit: " + penerbit + " tahun: " + tahun;
    }
}
