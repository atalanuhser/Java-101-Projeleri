import java.util.Scanner;

public class BasamakToplam {
    public static void main (String [] args ){
        Scanner input = new Scanner(System.in);

        System.out.print ( "Bir sayı giriniz: ");
        int sayi = input .nextInt();

        int toplam = 0;
        int geciciSayi = sayi;


        while (geciciSayi != 0) {
            int sonRakam = geciciSayi % 10;
            toplam += sonRakam;
            geciciSayi /= 10;
        }

        System.out.println(sayi + " sayısının basamaklarının sayı değerleri toplamı: " + toplam);

    }
}
