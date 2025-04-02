
package ArrayOfObjects;

public class ArrayMainBalok {
    public static void main(String[] args) {
        ArrayBalok[] arrayBalok = new ArrayBalok[5];
        arrayBalok[0] = new ArrayBalok();
        arrayBalok[1] = new ArrayBalok(1, 2, 3);
        arrayBalok[2] = new ArrayBalok (2, 5, 7);
        arrayBalok[3] = new ArrayBalok(5, 7, 9);
        arrayBalok[4] = new ArrayBalok(6, 9, 13);
        
        for (int i = 0; i < arrayBalok.length; i++){
            System.out.println("Balok "+(i+1)+ ", Panjang: "+ arrayBalok[i].panjang+" cm"+ ", Lebar: "+ arrayBalok[i].lebar+" cm"+", Tinggi: "+ arrayBalok[i].tinggi+" cm"+ arrayBalok[i].ComputeAndSetVolume()+" cm");
        }
        
        double VolumeTotal = 0;
        for (ArrayBalok b : arrayBalok){
            VolumeTotal += b.ComputeAndSetVolume();
        }
        
        double AVGVolume = 0;
        AVGVolume = VolumeTotal / arrayBalok.length;
        
        System.out.println("Volume Total: "+ VolumeTotal+ " cm");
        System.out.println("Rata-rata Volume: "+ AVGVolume+ " cm");
    }
}
