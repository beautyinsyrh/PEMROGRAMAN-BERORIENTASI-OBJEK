
package ArrayOfObjects;

public class ArrayMainLimas {

    public static void main(String[] args) {
        ArrayLimasSegiEmpat[] arrLimas = new ArrayLimasSegiEmpat[5];
        arrLimas[0] = new ArrayLimasSegiEmpat();
        arrLimas[1] = new ArrayLimasSegiEmpat(56, 78);
        arrLimas[2] = new ArrayLimasSegiEmpat();
        arrLimas[3] = new ArrayLimasSegiEmpat(35, 46);
        arrLimas[4] = new ArrayLimasSegiEmpat(10, 30);
        
        for (int i = 0; i < arrLimas.length; i++){
            System.out.println("Limas "+(i+1)+ " sisi alas: "+arrLimas[i].sisi+" cm"+" , Tinggi Limas: "+arrLimas[i].tinggiLimas+" cm"+ "Volume limas: "+arrLimas[i].ComputeAndSetVolume()+" cm");
        }
        
        double VolTot = 0;
        for (ArrayLimasSegiEmpat lse : arrLimas){
            VolTot += lse.ComputeAndSetVolume();
        }
        
        double AVGVolTot = VolTot / arrLimas.length;
        
        System.out.println("Volume Total Limas: "+VolTot+" cm");
        System.out.println("Rata-rata volume Limas: "+ AVGVolTot+ " cm");
    }
    
}
