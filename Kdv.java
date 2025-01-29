import java.util.Scanner;
public class Kdv {
    public static void main (String[]args){
        double tutar, kdvOran = 0.18;
        Scanner inp = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz");
        tutar= inp.nextDouble();
        double kdvTutar= tutar*kdvOran;
        double kdvliTutar= tutar+ kdvTutar;
        System.out.println("Kdv'siz Tutar:"+ tutar);
        System.out.println("Kdv Oranı:"+ kdvOran);
        System.out.println("Kdv Tutarı:"+ kdvTutar);
        System.out.println("Kdv'li Tutar:"+ kdvliTutar);


    }


}
