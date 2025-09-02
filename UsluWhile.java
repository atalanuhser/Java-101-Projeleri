import java.util.Scanner ;
public class UsluWhile {
    public static void main (String [] args) {
        Scanner inp = new Scanner (System.in) ;
        int n,k ;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = inp.nextInt();

        System.out.print("Üs olacak sayıyı giriniz: ");
        k = inp.nextInt();
        int total = 1 ;

        int i = 1 ;
        while (i<=k){
            total *= n ;
            i++ ;
        }

        System.out.println("Cevap: "+total);


    }
}
