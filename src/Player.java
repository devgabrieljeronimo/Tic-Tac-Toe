public class Player {
    protected int points;
    protected Symbol symbol;

    protected void play() {
        
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

    public Symbol getSymbol() {
        return symbol;
    }
}
