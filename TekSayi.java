import java.util.Scanner;

public class TekSayi {
    public static void main (String[]args) {
        int n ;
        int total = 0 ;
        Scanner input= new Scanner(System.in);

        do {
            System.out.print ("Sayı Giriniz: ");
            n=input.nextInt();
            if( n % 2 == 1) {
                total += n ;
            }

        } while ( n > 0) ;
        System.out.print ( "Toplam: " + total );


    }
}
