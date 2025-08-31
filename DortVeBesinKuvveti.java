import java.util.Scanner ;

public class DortVeBesinKuvveti {
    public static void main (String [] args) {
        Scanner inp= new Scanner ( System.in) ;

        System.out.print ( "Sınır sayısını giriniz: ");
        int sayi = inp.nextInt();

        int i = 1 ;
        int j = 1 ;
        System.out.println("4 ve 5'in kuvvetleri: ");

        while (i <= sayi || j <= sayi){
            if( i <= sayi){
                System.out.println(i);
                i *=4 ;
            }
            if ( j<= sayi ){
                System.out.println(j);
                j *=5 ;
            }
        }
    }
}
