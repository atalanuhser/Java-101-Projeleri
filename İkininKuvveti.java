import java.util.Scanner;
public class İkininKuvveti {
    public static void main (String [] args) {
        Scanner inp = new Scanner ( System.in );
        int n ;
        System.out.print ("Sınır sayısını giriniz: ");
        n = inp.nextInt ();

        int i = 1;
        while ( i<=n) {
            System.out.println (i);
            i *= 2 ;

        }
    }
}
