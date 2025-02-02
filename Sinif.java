import java.util.Scanner;
public class Sinif {
    public static void main(String [] args){
        int mat,fizik,turkce,kimya,muzik;

        Scanner inp = new Scanner (System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        if (0<=mat && mat<=100){

        }else{
            System.out.print("Notunuz geçersiz.");

        }
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce  = inp.nextInt();
        if(0<=turkce && turkce<=100){

        }else{
            System.out.print("Notunuz geçersiz.");

        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        if(0<=fizik && fizik<=100){

        }else{
            System.out.print("Notunuz geçersiz.");

        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        if(0<=fizik && fizik<=100){

        }else{
            System.out.print("Notunuz geçersiz.");

        }
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();
        if(0<=fizik && fizik<=100){

        }else{
            System.out.print("Notunuz geçersiz.");

        }
        double avarage= (mat+fizik+turkce+kimya+muzik)/5;
        if(avarage<=55){
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere");
            System.out.println("Ortalamanız: "+ avarage);

        }else{
            System.out.println("Tebrikler,sınıfı geçtiniz.");
            System.out.println("Ortalamanız:"+avarage);
        }



    }

}




