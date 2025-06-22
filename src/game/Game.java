package game;
import players.*;

public class Game {
    private int rounds;
    private GameModel gameModel;
    private Player playerOne;
    private Player playerTwo;
    private Player playerTime;
    private boolean gameEnded;
    private char[][] table;

    public Game(int rounds, GameModel gameModel) {
        this.rounds = rounds;
        this.gameModel = gameModel;

        playerOne = new Player(0, PlayerSymbol.O);
        playerTwo = new Player(0, PlayerSymbol.X);

        playerTime = playerOne;

        gameEnded = false;

        table = new char[][] {
                {' ', ' ' , ' '},
                {' ', ' ' , ' '},
                {' ', ' ' , ' '}
        };
    }

    public void updateGame(int X, int Y) {
        table[X][Y] = playerTime.getSymbol();
        setPlayerTime();
        verifyGame();
    }

    public void verifyGame() {

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

    public char[][] getTable() {
        return table;
    }

    public void setTable(char[][] table) {
        this.table = table;
    }

    public Player getPlayerTime() {
        return playerTime;
    }

    public void setPlayerTime() {
        if(playerTime == playerOne) {
            playerTime = playerTwo;
        }
        else {
            playerTime = playerOne;
        }
    }
}
