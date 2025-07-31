import java.util.Scanner;

public class Hava {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("Sinema etkinliğini öneririm.");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("Piknik yapmayı öneririm.");
        } else { 
            System.out.println("Yüzme etkinliğini öneririm.");
        }
    }
}
