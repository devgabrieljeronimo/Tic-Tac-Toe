package players;

import game.Game;
import graphic_interface.GameInterface;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
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

        System.out.println("Percorrido");

        Random random = new Random();
        int x = random.nextInt(3);
        int y = random.nextInt(3);


        if(game.getTable(x, y) != ' ') {
            verifyPlay();
        } else {
            game.setTable(playerSymbol, x, y);
            System.out.println("Bot jogou em: " + x + "," + y);
            game.updateGame(x, y); // atualiza regras e troca turno
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
