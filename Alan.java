import java.util.Scanner;
public class Alan {
    public static void main(String[]args){
        int a,b,c;
        Scanner inp= new Scanner (System.in);
        System.out.println("1.Kenar Uzunluğunu Giriniz");
        a=inp.nextInt();
        System.out.println("2.Kenar Uzunluğunu Giriniz");
        b=inp.nextInt();
        System.out.println("3.Kenar Uzunluğunu Giriniz");
        c=inp.nextInt();
        double u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:"+alan);


    }
}
