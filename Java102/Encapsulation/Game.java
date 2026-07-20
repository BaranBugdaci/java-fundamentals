package Java102.Encapsulation;

public class Game
{
    private String name;
    private int playerId;


    Game(String name,int playerId){
        this.name = name;
        if (playerId < 0 ){
            playerId = 0;
        }
        this.playerId = playerId;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getPlayerId(){
        return this.playerId;
    }
    public void setPlayerId(int playerId){
        if (playerId < 0 ){
            playerId = 0;
        }
        this.playerId = playerId;
    }

}
