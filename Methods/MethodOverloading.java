package Methods;

public class MethodOverloading
{
    public static void skorHesapla(String isim,int puan){
        System.out.println(isim + " Adlı Oyuncunun " + puan + " kadar Puanı var.");
    }

    public static void skorHesapla(String isim){
        System.out.println(isim + " Adlı oyuncunun hiç puanı yok");
    }
    public static void skorHesapla(int puan){
        System.out.println("İsimsiz oyuncunun " + puan + " bu kadar puanı var");
    }
    public static void skorHesapla(float fpuan){
        System.out.println("Herhangi bir adam " + fpuan + "kadar puanı var ");
    }

    public static void main(String[] args) {

        skorHesapla("Bedo");
        skorHesapla("Baran",784);
        skorHesapla(744);
        skorHesapla(871.4f);
    }
}


