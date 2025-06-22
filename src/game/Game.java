package game;
import players.*;

public class Game {
    private int rounds;
    private GameMode gameMode;
    private Player playerOne;
    private Player playerTwo;
    private Player playerTime;
    private boolean gameEnded;
    private char[][] table;

    public Game(int rounds, GameMode gameMode) {
        this.rounds = rounds;
        this.gameMode = gameMode;

        playerOne = new Player(0, 'O');
        playerTwo = new Player(0, 'X');

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

    public GameMode getGameModel() {
        return gameMode;
    }

    public void setGameModel(GameMode gameMode) {
        this.gameMode = gameMode;
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
