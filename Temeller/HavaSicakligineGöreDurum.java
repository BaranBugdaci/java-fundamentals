package Temeller;

public class HavaSicakligineGoreDurum
{
     public static void main(String[] args) {
         double sicaklik = 24.7;

         if (sicaklik > 0){
             if(sicaklik > 35)
                 System.out.println("Yüzmek İyi bir Seçenek Olurdu :)");

         else if( sicaklik>25 && sicaklik < 35)
             System.out.println("Akşam yürüyüşü sarardı");
         else if( sicaklik > 15 && sicaklik <25)
             System.out.println("Sabah Serin bir yürüyüş manyak sarar ");
         else if(sicaklik>0 && sicaklik<15)
             System.out.println("Güzel sıcak bir yerde kahve içme işi fena akar");
         }
         else
             System.out.println("Buz gibi hava belki kar topu veyahut bir kayak patlar");
    }
}
