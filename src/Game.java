public class Game {
    private int rounds;
    private GameModel gameModel;
    private Player playerOne;
    private Player playerTwo;
    private String[][] table;

    public Game(int rounds, GameModel gameModel, Player playerOne, Player playerTwo) {
        this.rounds = rounds;
        this.gameModel = gameModel;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.table = new String[][] {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
    }

    public void newGame() {

    }

    public void updateGame(String[][] table) {

    }

    public void endGame() {

    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        if(rounds > 1 && rounds < 4) {
            this.rounds = rounds;
        }
        else {
            System.out.println("ERROR!");
        }
    }

    public GameModel getGameModel() {
        return gameModel;
    }

    public void setGameModel(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String[][] getTable() {
        return table;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }
}
