import java.util.Scanner;

public class KullaniciGirisiSorgulama {
     public static void main(String[] args) {

         //Kullanıcı Girişi Sorgulama while döngüsü

         Scanner scanner = new Scanner(System.in);
         String kullaniciAdi = "Baran";
         String sifre = "987456321";
         int girisHakki = 3;


         while(true){
             System.out.println("Kullanıcı Adı: ");
             String inputUserName = scanner.nextLine();
             System.out.println("Şifre: ");
             String inputPassword = scanner.nextLine();

             if(inputUserName.equals(kullaniciAdi) && inputPassword.equals(sifre)){
                 System.out.println("Hoş Geldiniz");
                 break;
             }
             else {
                 System.out.println("Kullanıcı Adı veya Şifre Yalnış!! ");
                 girisHakki--;
                 System.out.println("Kalan Giriş Hakkınız: " + girisHakki);
                 System.out.println("----------------------------------");
                 if(girisHakki == 0){
                     System.out.println("Giriş hakkınız kalmamıştır.Program Kapanıyor...");
                     break;
                 }

             }
         }
    }
}
