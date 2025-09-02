import java.util.Scanner ;

public class KombinasyonWhile {
    public static void main ( String [] args) {
        Scanner scan =  new Scanner(System.in) ;
        System.out.print("n değerini giriniz: ");
        int n = scan.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scan.nextInt();

        int ntotal = 1;
        int rtotal = 1;
        int nrtotal = 1;

        if ( r>n ) {
            System.out.println("r, n'den büyük olamaz.Tekrar değer giriniz:");
            r = scan.nextInt();
        } else {
            int i = 1 ;
            while (i<=n){
                ntotal *= i ;
                i++ ;
            }

            int j = 1 ;
            while ( j<=r) {
                rtotal *= j ;
                j++ ;

            }

            int k = 1 ;
            while ( k<= (n-r)){
                nrtotal *= k ;
                k++ ;
            }
            int kombinasyon = ntotal / (rtotal * nrtotal) ;
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        }


    }
}
