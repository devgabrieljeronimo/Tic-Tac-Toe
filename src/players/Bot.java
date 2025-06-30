package players;

import game.Game;

import java.awt.*;
import java.util.Random;

public class Bot extends PlayerBase{

    private Point point;

    public Bot(int points, char playerSymbol) {
        this.points = points;
        this.playerSymbol = playerSymbol;
    }

    public void play() {

        verifyPlay();
    }

    private void verifyPlay() {
        Game game = Game.currentGame;

        Random random = new Random();
        int x = random.nextInt(3);
        int y = random.nextInt(3);


        if(game.getTable(x, y) != ' ') {
            verifyPlay();
        } else {
            game.setTable(playerSymbol, x, y);
            System.out.println("Bot played in: " + x + "," + y);
            game.updateGame(x, y); // Update the game
            setPoint(x, y);
        }
    }

    public Point getPoint() {
        return this.point;
    }

    public void setPoint(int x, int y) {
        point = new Point(x, y);
    }
}
