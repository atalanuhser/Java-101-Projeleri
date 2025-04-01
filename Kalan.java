import java.util.Scanner;
public class Kalan {
    public static void main (String[]args){
        int adet=0, toplam=0;
        int k;
        double sonuc=0 ;
        Scanner inp = new Scanner (System.in);
        System.out.print("Bir sayı giriniz: ");
        k = inp.nextInt();

        for(int i=0;i<=k;i++){
            if(i%12==0){
                adet++;
                toplam+=i;
                sonuc=(toplam/adet);
            }
        }
        System.out.println("Sayıların ortalaması: "+ sonuc);



    }
}