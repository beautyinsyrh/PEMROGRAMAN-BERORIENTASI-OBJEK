package Inheritance;

public class DiagramMajalah {
    private String judul;
    private String edisi;
    private String penerbit;
    private int tahun;

    public DiagramMajalah(String judul, String edisi, String penerbit, int tahun) {
        this.judul = judul;
        this.edisi = edisi;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public String toString() {
        return "Judul: " + judul + ", Edisi: " + edisi + ", Penerbit: " + penerbit + ", Tahun: " + tahun;
    }
}
