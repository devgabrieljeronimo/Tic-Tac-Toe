package players;

public class Player {
    protected int points;
    protected char playerSymbol;

    public Player(int points, char playerSymbol) {
        this.points = points;
        this.playerSymbol = playerSymbol;
    }

    public void addPoint() {
        if(points < 4) {
            points += 1;
        }
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public char getSymbol() {
        return playerSymbol;
    }
}
