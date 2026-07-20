package Java102.Encapsulation;

public class Main
{
    public static void main(String[] args) {
        Game game = new Game("Zelda",10);

        System.out.println(game.getName());
        game.setName("TLOU");
        System.out.println(game.getName());
        game.setPlayerId(71);
        System.out.println(game.getPlayerId());
    }
}
