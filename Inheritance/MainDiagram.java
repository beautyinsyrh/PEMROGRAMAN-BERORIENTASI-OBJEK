package Inheritance;

public class MainDiagram {
    public static void main(String[] args) {
        DiagramBuku buku1 = new DiagramBuku("Pemrograman Java", "Ali Brth", "TechBooks", 2021);
        DiagramMajalah majalah1 = new DiagramMajalah("Science ", "Edisi 45", "Science", 2023);
        DiagramSkripsi skripsi1 = new DiagramSkripsi("22021001", "Kesehatan Tradisional", 
                                                     "Dr. Andi", "Universitas A", 2024);

        System.out.println("Data Buku:");
        System.out.println(buku1.toString());

        System.out.println("\nData Majalah:");
        System.out.println(majalah1.toString());

        System.out.println("\nData Skripsi:");
        System.out.println(skripsi1.toString());
    }
}
