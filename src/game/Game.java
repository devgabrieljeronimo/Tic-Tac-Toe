package game;
import players.*;

import java.util.Arrays;

public class Game {
    private int currentRound;
    private int rounds;
    private GameMode gameMode;
    private Player playerOne;
    private Player playerTwo;
    private Bot bot;
    private PlayerBase playerTime;
    private boolean roundEnded;
    private boolean gameEnded;
    private static char[][] table;

    public Game(int rounds, GameMode gameMode) {
        currentRound = 1;

        this.rounds = rounds;
        this.gameMode = gameMode;

        if(gameMode == GameMode.PLAYER_VS_BOT) {
            playerOne = new Player(0, 'O');
            bot = new Bot(0, 'X');
        }
        else {
            playerOne = new Player(0, 'O');
            playerTwo = new Player(0, 'X');
        }

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
        boolean isTableFull = false;

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

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(table[i][j] == ' ') {
                    isTableFull = false;
                    break;
                }
                else {
                    isTableFull = true;
                }
            }
            if(!isTableFull) break;
        }

        if(isTableFull == true) {
            endGame(' ');
        }
    }

    public void endGame(char winnerSymbol) {
        if(gameMode == GameMode.PLAYER_VS_BOT) {
            if (winnerSymbol == playerOne.getSymbol()) {
                playerOne.addPoint();
            } else if (winnerSymbol == bot.getSymbol()) {
                bot.addPoint();
            }
        }
        else {
            if (winnerSymbol == playerOne.getSymbol()) {
                playerOne.addPoint();
            } else if (winnerSymbol == playerTwo.getSymbol()) {
                playerTwo.addPoint();
            }
        }

        if(currentRound == rounds) {
            gameEnded = true;
        }
        else {
            currentRound++;
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

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public PlayerBase getPlayerTime() {
        return playerTime;
    }

    public void setPlayerTime() {
        if(gameMode == GameMode.PLAYER_VS_BOT){
            if(playerTime == playerOne) {
                playerTime = bot;
            }
            else {
                playerTime = playerOne;
            }
        }
        else {
            if(playerTime == playerOne) {
                playerTime = playerTwo;
            }
            else {
                playerTime = playerOne;
            }
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

    public static char getTable(int x, int y) {
        return table[x][y];
    }

    public void setTable(char[][] table) {
        this.table = table;
    }

    public static void setTable(char playerChar, int x, int y) {
        table[x][y] = playerChar;
    }
}
