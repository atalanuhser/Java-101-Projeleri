import java.util.Scanner;
public class bki {
    public static void main (String[]args){
        double kg,boy;
        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz: ");
        boy= input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kg= input.nextDouble();

        double formul= kg/boy*boy;
        System.out.print("Vücut Kitle İndeksiniz :"+formul);



    }
}
