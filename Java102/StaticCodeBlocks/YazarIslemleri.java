package Java102.StaticCodeBlocks;

public class YazarIslemleri
{
    private static  Yazar[] yazarlar;
    static {
        yazarlar = new Yazar[5];
        yazarlar[0] = new Yazar("Özkan","Perçin");
        yazarlar[1] = new Yazar("Burak","Eroğlu");
        yazarlar[2] = new Yazar("Baran","Buğdaci");
        yazarlar[3] = new Yazar("Efe Talha","Öksüz");
        yazarlar[4] = new Yazar("Rosida","Böksüz");
    }
    public static Yazar[] getYazarlar(){
        return YazarIslemleri.yazarlar;
    }
}
