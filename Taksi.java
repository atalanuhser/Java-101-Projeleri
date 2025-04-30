import java.util.Scanner;
public class Taksi {
    public static void main(String[]args){
        int km;
        double perKm = 2.20, total = 10, minimumucret = 20 ; 
        Scanner input= new Scanner (System.in);
        System.out.println ("Mesafeyi km cinsinden giriniz");
        km = input.nextInt();
        
        total += (km*perKm);
        total = (total < minimumucret) ? minimumucret:total ; 
        System.out.println("Toplam Tutar:"+ total + "TL");

    }
}
