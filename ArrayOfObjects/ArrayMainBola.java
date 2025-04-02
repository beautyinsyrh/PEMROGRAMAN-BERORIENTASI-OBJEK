
package ArrayOfObjects;

public class ArrayMainBola {
    public static void main(String[] args) {
       ArrayBola[] arrBola = new ArrayBola[5];
       arrBola[0] = new ArrayBola();
       arrBola[1] = new ArrayBola(4);
       arrBola[2] = new ArrayBola();
       arrBola[3] = new ArrayBola(7);
       arrBola[4] = new ArrayBola(10);
       
       for (int i = 0; i < arrBola.length; i++){
           System.out.println("Bola "+(i+1)+ "Jari-jari bola: "+arrBola[i].r_bola+" cm"+", Volume bola: "+arrBola[i].ComputeAndSetVolume()+" cm");
       }
       
       double VolTotal = 0;
       for (ArrayBola bl : arrBola){
           VolTotal += bl.ComputeAndSetVolume();
       }
       
       double AVGVol = VolTotal / arrBola.length;
       
       System.out.println("Volume total bola: "+VolTotal+" cm");
       System.out.println("Rata-rata volume bola: "+AVGVol+ " cm");
    }
    
}
