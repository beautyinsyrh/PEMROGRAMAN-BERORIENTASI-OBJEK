
package ArrayOfObjects;

public class ArrayMainTabung {
    public static void main(String[] args) {
        ArrayTabung[] arrTabung = new ArrayTabung[5];
        arrTabung[0] = new ArrayTabung();
        arrTabung[1] = new ArrayTabung (7, 10);
        arrTabung[2] = new ArrayTabung (8, 20);
        arrTabung[3] = new ArrayTabung (9, 14);
        arrTabung[4] = new ArrayTabung (70, 90);
        
        for (int i = 0; i < arrTabung.length; i++){
        System.out.println("Tabung "+(i+1)+" Jari-jari tabung: "+arrTabung[i].r_alas+" cm"+", Tinggi tabung: "+ arrTabung[i].tinggiTabung+" cm"+", Volume Tabung: "+arrTabung[i].ComputeAndSetVolume()+" cm");
    }
       
        double VolumeTotal = 0;
        for (ArrayTabung t : arrTabung){
            VolumeTotal += t.ComputeAndSetVolume();
        }
        
        double AVGVolume = VolumeTotal / arrTabung.length;
        
        System.out.println("Total Volume Tabung: "+VolumeTotal+ " cm");
        System.out.println("Rata-rata Volume Tabung: "+AVGVolume+ " cm");
    }
    
}
