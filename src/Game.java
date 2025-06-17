public class Game {
    private int rounds;
    private GameModel gameModel;
    private Game game;
    private Game currentGame;
    private Player playerTurn;
    private String[][] table;

    public Game(int rounds, GameModel gameModel, Player playerTurn) {
        this.rounds = rounds;
        this.gameModel = gameModel;
        this.game = null;
        this.playerTurn = playerTurn;
        this.table = new String[][] {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };
    }

    public void newGame(Game lastGame) {
        if(lastGame == null) {
            this.game = new Game();
        }
        else {
            lastGame = new Game();
            this.game = lastGame;
        }
    }

    public void updateGame() {

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

    public Player getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(Player playerTurn) {
        this.playerTurn = playerTurn;
    }

    public String[][] getTable() {
        return table;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }
}
