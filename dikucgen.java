import java.util.Scanner;
public class dikucgen {
    public static void main (String[]args){
        int a,b;
        double c;
        Scanner girdi= new Scanner(System.in);
        System.out.println("1.Kenarın Uzunluğunu Giriniz.");
        a= girdi.nextInt();
        System.out.println("2.Kenarın Uzunluğunu Giriniz");
        b= girdi.nextInt();
        c= Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs:"+c);


    }

}
