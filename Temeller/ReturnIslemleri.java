public class ReturnIslemleri
{
    public static int ikiIleToplama(int a){
        return a+2;
    }
    public static int ikiIleCikarma(int a){
        return a -2 ;
    }
    public static int ikiIleCarpma(int a){
        return a * 2;
    }
    public static int ikiIleBolme(int a){
        return a/2;
    }

     public static void main(String[] args) {
         System.out.println(ikiIleBolme(ikiIleCikarma(ikiIleCarpma(ikiIleToplama(8)))));
    }
}
