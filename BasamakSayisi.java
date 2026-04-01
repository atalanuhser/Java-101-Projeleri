import java.util.Scanner ;

public class BasamakSayisi {
    public static void main (String [] args){
        int k, basamakSayisi=0, numberCounter=0 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        k = inp.nextInt();

        while (k !=0 ){
            k /= 10 ;
            numberCounter++ ;

        }
       System.out.print ( numberCounter+ " Basamaklıdır.");


    }

}
