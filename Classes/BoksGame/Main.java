package Classes.BoksGame;

public class Main
{
    public static void main(String[] args) {
        Fighter muhammed = new Fighter("Muhammed", 150, 30, 120, 20);
        Fighter baran = new Fighter("Baran", 120, 20, 95,60 );
        Ring ring = new Ring(muhammed,baran,120,95);

        ring.run();
        ring.printScore();

    }
}
