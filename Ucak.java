import java.util.Scanner;
public class Ucak {
    public static void main (String [] args){
        int km, yas, tip ;
        double bilet=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = inp.nextInt();
        double tutar = km * 0.10;


        if((km>0 && yas>0) && (tip>0 && tip<3)){
            if (yas < 12) {
                bilet = tutar * 0.5;
            } else if (yas >= 12 && yas <= 24) {
                bilet = tutar * 0.9;
            }else if (yas > 24 && yas <=65){
                bilet = tutar ;

            } else if (yas > 65) {
                bilet = tutar * 0.7;
            }
            if (tip==1){
                System.out.print("Toplam Tutar:"+bilet + " TL");
            }else{
                double hesap = (bilet * 0.8) * 2 ;
                System.out.print("Toplam Tutar:"+hesap+" Tl");
            }

        }else{
            System.out.println("Hatalı Veri Girdiniz!");
        }

    }
}

