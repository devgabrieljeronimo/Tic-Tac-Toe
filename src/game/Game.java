package game;
import players.*;

public class Game {
    private int currentRound;
    private int rounds;
    private GameMode gameMode;
    private Player playerOne;
    private Player playerTwo;
    private Player playerTime;
    private boolean roundEnded;
    private boolean gameEnded;
    private char[][] table;

    public Game(int rounds, GameMode gameMode) {
        currentRound = 1;

        this.rounds = rounds;
        this.gameMode = gameMode;

        playerOne = new Player(0, 'O');
        playerTwo = new Player(0, 'X');

        playerTime = playerOne;

        roundEnded = false;
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
        for(int i = 0; i < 3; i++) {
            if(table[i][0] != ' ' && table[i][0] == table[i][1] && table[i][1] ==  table[i][2]) {
                endGame(table[i][0]);
            }
        }

        for(int i = 0; i < 3; i++) {
            if(table[0][i] != ' ' && table[0][i] == table[1][i] && table[1][i] == table[2][i]) {
                endGame(table[0][1]);
            }
        }

        if(table[0][0] != ' ' && table[0][0] == table[1][1] && table[1][1] == table[2][2]) {
            endGame(table[0][0]);
        }
        else if(table[0][2] != ' ' && table[0][2] == table[1][1] && table[1][1] == table[2][0]) {
            endGame(table[0][2]);
        }
    }

    public void endGame(char winnerSymbol) {
        if(winnerSymbol == playerOne.getSymbol()) {
            playerOne.addPoint();
        }
        else {
            playerTwo.addPoint();
        }

        if(currentRound == rounds) {
            gameEnded = true;
        }
        else {
            currentRound += 1;
            roundEnded = true;

            table = new char[][] {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
            };
        }
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
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

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
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

    public boolean isRoundEnded() {
        return roundEnded;
    }

    public void setRoundEnded(boolean roundEnded) {
        this.roundEnded = roundEnded;
    }

    public boolean isGameEnded() {
        return gameEnded;
    }

    public char[][] getTable() {
        return table;
    }

    public void setTable(char[][] table) {
        this.table = table;
    }
}
