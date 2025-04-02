
package ArrayOfObjects;

public class ArrayMainKubus {

    public static void main(String[] args) {
        ArrayKubus[] arrayKubus = new ArrayKubus[5];
        arrayKubus[0] = new ArrayKubus();
        arrayKubus[1] = new ArrayKubus(2);
        arrayKubus[2] = new ArrayKubus(3);
        arrayKubus[3] = new ArrayKubus(5);
        arrayKubus[4] = new ArrayKubus(10);
        
        for (int i = 0; i <arrayKubus.length; i++){
            System.out.println("Kubus "+(i+1)+ ", Sisi: "+arrayKubus[i].sisi+", Volume: "+arrayKubus[i].ComputeAndSetVolume());
        }
        
        double VolumeTotal = 0;
        for (ArrayKubus k: arrayKubus){
            VolumeTotal += k.ComputeAndSetVolume();
        }
        
        double AVGVolume = VolumeTotal / arrayKubus.length;
        System.out.println("Total Volume: "+VolumeTotal);
        System.out.println("Rata-rata volume: "+AVGVolume);
    }
    
}
