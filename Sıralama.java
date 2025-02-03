import java.util.Scanner;
public class Sıralama {
    public static void main (String[]args){
        int a,b,c;
        Scanner sayi= new Scanner(System.in);

        System.out.println("Birbirinden farklı sayılar giriniz.");
        System.out.print("1.sayıyı giriniz: ");
        a= sayi.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        b= sayi.nextInt();
        System.out.print("3.sayıyı giriniz: ");
        c= sayi.nextInt();

        if(a>b && a>c){
            if (b<c){
                System.out.println("a>c>b");
            }else{
                System.out.println("a>b>c");
            }
        }else if (b>a && b>c){
            if (a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>a>c");
            }
        }else{
            if (a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }

        }
    }


}
