package players;

public class Player {
    protected int points;
    protected PlayerSymbol playerSymbol;

    public Player(int points, PlayerSymbol playerSymbol) {
        this.points = points;
        this.playerSymbol = playerSymbol;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        if(points == 1) {
            this.points = points;
        }
        else {
            System.out.println("ERROR!");
        }
    }

    public PlayerSymbol getSymbol() {
        return playerSymbol;
    }
}
