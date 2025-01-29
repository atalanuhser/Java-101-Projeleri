import java.util.Scanner;

public class Dilim {
    public static void main (String [] args){
        int r ;
        double a, pi = 3.14 ;
        Scanner input = new Scanner(System.in);
        System.out.println ("Dairenin yarıçapının uzunluğunu giriniz");
        r = input.nextInt();
        System.out.println ("Daire diliminin merkez açısının ölçüsünü giriniz");
        a = input.nextDouble();
        double formul= (pi * (r*r) * a) / 360;
        System.out.println("Daire dilimin alanı: " + formul);




    }



}
