import java.util.Scanner;
public class Sifre {
    public static void main (String[]args){
        String userName,password;

        Scanner input = new Scanner(System.in);
        System.out.print ("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.print ("Şifreniz: ");
        password= input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println ("Giriş yaptınız.");
        }else{
            System.out.println ("Bilgileriniz yanlış");
            System.out.println ("Şifrenizi sıfırlamak ister misiniz? Evet\\Hayır");
            String sifirlama = input.nextLine();

            if (sifirlama.equals("Evet")){
                System.out.print("Yeni şifrenizi girin: ");
                String sifre= input.nextLine();
                if(sifre.equals("java123")){
                    System.out.println ("Şifre oluşturulamadı.Lütfen başka şifre giriniz: ");
                    String answer = input.nextLine();
                    System.out.print("Şifre başarıyla değiştirildi.");

                }else{
                    System.out.println("Şifre oluşturuldu.");
                }

            }else{
                System.out.print("Hatalı giriş yaptınız.Tekrar deneyiniz.");
            }


        }



    }
}
