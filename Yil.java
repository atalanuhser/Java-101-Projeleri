import java.util.Scanner;
public class Yil {
    public static void main (String [] args){
        int yil ;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if((yil %4==0) && (yil %100 !=0)|| (yil % 400 == 0)){
            System.out.println(yil+ " Artık bir yıldır.");
        } else {
            System.out.println(yil+ " Artık bir yıl değildir.");
        }


    }

}
