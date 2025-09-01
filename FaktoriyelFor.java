import java.util.Scanner ;

public class FaktoriyelFor {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print (" Sayı Giriniz: ");
        int n = scan.nextInt();
        int faktoriyel = 1 ;

        for (int i = 1 ; i<=n ; i++){
            faktoriyel *=i ;
        }
        System.out.print(n+ "! =" +faktoriyel);
    }

        }