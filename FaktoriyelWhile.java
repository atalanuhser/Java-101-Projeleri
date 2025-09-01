import java.util.Scanner ;

public class FaktoriyelWhile {
    public static void main ( String[]args) {
        Scanner scan = new Scanner ( System.in) ;
        int n ;
        int faktoriyel = 1 ;
        int i = 1;

        System.out.print("Sayı Giriniz: ");
        n= scan.nextInt();

        while( i<=n){
            faktoriyel *= i;
            i++ ;

        }
        System.out.print(n +"! = "+faktoriyel);
    }
}
