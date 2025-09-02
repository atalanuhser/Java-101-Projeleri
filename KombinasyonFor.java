import java.util.Scanner ;
public class KombinasyonFor {
    public static void main ( String [] args) {
        Scanner scan = new Scanner ( System.in);

        System.out.print( "n değerini giriniz: ");
        int n = scan.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scan.nextInt();

        if (r>n){
            System.out.println("r, n'den büyük olamaz.Tekrar değer giriniz.");
            r = scan.nextInt();

        }

            int ntotal = 1 ;
            for (int i = 1 ; i<=n ; i++ ){
                ntotal *=i ;
            }

        int rtotal = 1 ;
        for ( int j =1 ; j<=r ; j++){
            rtotal *=j ;

        }
       int nrtotal = 1 ;
        for ( int k = 1 ; k<=(n-r) ;k++){
            nrtotal *=k ;

        }
        int kombinasyon = ntotal / (rtotal * nrtotal);
        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);

    }
}
