package Java102.StaticCodeBlocks;

public class Main
{
    public static void main(String[] args) {

        Yazar[] liste = YazarIslemleri.getYazarlar();

        for(int i = 0; i < liste.length; i++){
            System.out.println(liste[i].getBilgi());
        }
    }
}
