package players;

public class Player {
    protected int points;
    protected char playerSymbol;

    public Player(int points, char playerSymbol) {
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

    public char getSymbol() {
        return playerSymbol;
    }
}
