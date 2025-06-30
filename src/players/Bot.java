package players;

import game.Game;

import java.util.Random;

public class Bot extends PlayerBase{

    public Bot(int points, char playerSymbol) {
        this.points = points;
        this.playerSymbol = playerSymbol;
    }

    public void play() {
        /*int voidPlaces = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(Game.getTable(i, j) == ' ') {
                    voidPlaces++;
                }
            }
        }*/
        verifyPlay();
    }

    public void verifyPlay() {
        Random random = new Random();
        int x = random.nextInt(3);
        int y = random.nextInt(3);

        if(Game.getTable(x, y) != ' ') {
            verifyPlay();
        }
        else {

        }
    }
}
