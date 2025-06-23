package graphic_interface;

import javax.swing.*;
import java.awt.*;

import game.*;

public class GameInterface extends JFrame {
    // Game
    private Game game;
    // Game config
    private int gameRounds;
    private GameMode gameMode;

    private ImageIcon gameIcon;
    private JLabel gameTitle;
    private JButton playButton;
    private JPanel lobbyPanel;

    private JLabel gameOpponentText, gameRoundText, currentOpponentText, currentRoundText;
    private JButton startGameButton, backToLobbyButton, playerOpponentButton, botOpponentButton;
    private JButton[] roundButton;
    private JPanel configGamePanel;

    private JLabel[] line;
    private JButton[] gameButton;
    private JPanel gamePanel;

    private JLabel[] playerPoints;
    private JButton exitGameButton;
    private JPanel endPanel;

    public GameInterface() {
        setTitle("TicTacToe");
        gameIcon = new ImageIcon(getClass().getResource("ChatGPTImage06-18-2025,16_51_27.png"));
        setIconImage(gameIcon.getImage());
        //setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        setBounds(0, 0, 700, 700);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);

        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initGameConfig();
        initPanels();
        modifyPanels();
        addPanels();
        addButtonEvents();
    }

    private void initGameConfig() {
        // Default game config
        gameRounds = 1;
        gameMode = GameMode.PLAYER_VS_PLAYER;
    }

    private void initObjects() {
        // Instance objects of lobbyPanel
        gameTitle = new JLabel("Tic\nTac\nToe");
        playButton = new JButton("Play");

        // Instance objects of configGamePanel
        gameOpponentText = new JLabel("Opponent");
        gameRoundText = new JLabel("Rounds");
        currentOpponentText = new JLabel("Opponent: player");
        currentRoundText = new JLabel("Rounds: 1");
        startGameButton = new JButton("Start");
        backToLobbyButton = new JButton("X");
        playerOpponentButton = new JButton("Player");
        botOpponentButton = new JButton("Bot");

        roundButton = new JButton[4];
        for(int i = 0; i < 4; i++) {
            int rounds = i + 1;
            roundButton[i] = new JButton("" + rounds);
        }

        // Instance objects of gamePanel
        gameButton = new JButton[9];
        for(int i = 0; i < 9; i++) {
            gameButton[i] = new JButton();
        }

        line = new JLabel[4];
        for(int i = 0; i < 4; i++) {
            line[i] = new JLabel();
        }

        // Instance objects of endPanel
        playerPoints = new JLabel[2];
        playerPoints[0] = new JLabel();
        playerPoints[1] = new JLabel();
        exitGameButton = new JButton("Back");
    }

    private void modifyObjects() {
        // Modify objects of lobbyPanel
        gameTitle.setBounds(270, 250, 200, 200);
        gameTitle.setFont(new Font("Arial", Font.BOLD, 30));
        playButton.setBounds(300, 450, 100, 50);
        playButton.setBorderPainted(false);
        playButton.setFocusPainted(false);
        playButton.setBackground(Color.GREEN);
        playButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Modify objects of configGamePanel
        gameOpponentText.setBounds(170, 0, 100, 50);
        gameRoundText.setBounds(175, 120, 100, 50);
        currentOpponentText.setBounds(50, 270, 100, 50);
        currentRoundText.setBounds(250, 270, 100, 50);
        startGameButton.setBounds(165, 320, 75, 50);
        startGameButton.setFocusPainted(false);
        startGameButton.setBorderPainted(false);
        startGameButton.setBackground(Color.GREEN);
        startGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backToLobbyButton.setBounds(370, 0, 30, 30);
        backToLobbyButton.setBorderPainted(false);
        backToLobbyButton.setFocusPainted(false);
        backToLobbyButton.setBackground(Color.RED);
        backToLobbyButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        playerOpponentButton.setBounds(50, 50, 100, 75);
        playerOpponentButton.setBorderPainted(false);
        playerOpponentButton.setFocusPainted(false);
        playerOpponentButton.setBackground(Color.GRAY);
        playerOpponentButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botOpponentButton.setBounds(250, 50, 100, 75);
        botOpponentButton.setBorderPainted(false);
        botOpponentButton.setFocusPainted(false);
        botOpponentButton.setBackground(Color.GRAY);
        botOpponentButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        roundButton[0].setBounds(50, 170, 70, 75);
        roundButton[1].setBounds(127, 170, 70, 75);
        roundButton[2].setBounds(203, 170, 70, 75);
        roundButton[3].setBounds(280, 170, 70, 75);

        for(JButton button : roundButton) {
            button.setBorderPainted(false);
            button.setFocusPainted(false);
            button.setBackground(Color.GRAY);
            button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }

        // modify objects of gamePanel
        gameButton[0].setBounds(0, 0, 190, 190);
        gameButton[1].setBounds(210, 0, 180, 190);
        gameButton[2].setBounds(410, 0, 190, 190);
        gameButton[3].setBounds(0, 210, 190, 180);
        gameButton[4].setBounds(210, 210, 180, 180);
        gameButton[5].setBounds(410, 210, 190, 180);
        gameButton[6].setBounds(0, 410, 190, 190);
        gameButton[7].setBounds(210, 410, 180, 190);
        gameButton[8].setBounds(410, 410, 190, 190);

        for(JButton button : gameButton) {
            button.setFont(new Font("gameFont", Font.BOLD, 150));
            button.setBorderPainted(false);
            button.setFocusPainted(false);
        }

        line[0].setBounds(190, 0, 20, 600);
        line[1].setBounds(390, 0, 20, 600);
        line[2].setBounds(0, 190, 600, 20);
        line[3].setBounds(0, 390, 600, 20);

        for(JLabel modifyLine : line) {
            modifyLine.setOpaque(true);
            modifyLine.setBackground(Color.BLACK);
        }

        // Modify objects of endPanel
        playerPoints[0].setForeground(Color.BLUE);
        playerPoints[0].setBounds(50, 100, 200, 100);
        playerPoints[1].setForeground(Color.RED);
        playerPoints[1].setBounds(50, 200, 200, 100);

        for(int i = 0; i < 2; i++) {
            playerPoints[i].setFont(new Font("pointsFont", Font.ITALIC, 30));
        }

        exitGameButton.setBounds(300, 0, 100, 50);
        exitGameButton.setFocusPainted(false);
        exitGameButton.setBorderPainted(false);
        exitGameButton.setText("Back");
        exitGameButton.setFont(new Font("exitFont", Font.BOLD, 20));
        exitGameButton.setBackground(Color.RED);

    }

    private void addObjects() {
        // Add to lobbyPanel
        lobbyPanel.add(gameTitle);
        lobbyPanel.add(playButton);
        // Add to configGamePanel
        configGamePanel.add(gameOpponentText);
        configGamePanel.add(gameRoundText);
        configGamePanel.add(currentOpponentText);
        configGamePanel.add(currentRoundText);
        configGamePanel.add(startGameButton);
        configGamePanel.add(backToLobbyButton);
        configGamePanel.add(playerOpponentButton);
        configGamePanel.add(botOpponentButton);

        for(int i = 0; i < 4; i++) {
            configGamePanel.add(roundButton[i]);
        }

        // Add to gamePanel
        for(int i = 0; i < 9; i++) {
            gamePanel.add(gameButton[i]);
        }

        for(int i = 0; i < 4; i++) {
            gamePanel.add(line[i]);
        }

        // Add to endPanel
        endPanel.add(playerPoints[0]);
        endPanel.add(playerPoints[1]);
        endPanel.add(exitGameButton);
    }

    private void initPanels() {
        initObjects();

        lobbyPanel = new JPanel(null);

        configGamePanel = new JPanel(null);

        gamePanel = new JPanel(null);

        endPanel = new JPanel(null);
    }

    private void modifyPanels() {
        modifyObjects();

        lobbyPanel.setBounds(0,0, 700, 700);
        lobbyPanel.setOpaque(false);

        configGamePanel.setBounds(150, 150, 400, 400);
        configGamePanel.setEnabled(false);
        configGamePanel.setVisible(false);

        gamePanel.setBounds(45, 30, 600, 600);
        gamePanel.setEnabled(false);
        gamePanel.setVisible(false);

        endPanel.setBounds(150, 150, 400, 400);
        endPanel.setEnabled(false);
        endPanel.setVisible(false);
    }

    private void addPanels() {
        addObjects();

        add(lobbyPanel);
        add(configGamePanel);
        add(gamePanel);
        add(endPanel);
    }

    private void addButtonEvents() {
        playButton.addActionListener(e -> playButtonClicked());
        startGameButton.addActionListener(e -> startGameButtonClicked());
        backToLobbyButton.addActionListener((e -> backToLobbyButtonClicked()));
        playerOpponentButton.addActionListener(e -> playerOpponentButtonClicked());
        botOpponentButton.addActionListener(e -> botOpponentButtonClicked());

        for(int i = 0; i < 4; i++) {
            int index = i;
            roundButton[i].addActionListener(e -> roundButtonClicked(index));
        }

        for(int i = 0; i < 9; i++) {
            int index = i;
            int X = i / 3;
            int Y = i % 3;
            System.out.println(X + " " + Y);
            gameButton[i].addActionListener(e -> gameButtonClicked(index, X, Y));
        }
    }

    private void playButtonClicked() {
        lobbyPanel.setEnabled(false);
        lobbyPanel.setVisible(false);

        configGamePanel.setEnabled(true);
        configGamePanel.setVisible(true);
    }

    private void startGameButtonClicked() {
        game = new Game(gameRounds, gameMode);

        configGamePanel.setEnabled(false);
        configGamePanel.setVisible(false);

        gamePanel.setEnabled(true);
        gamePanel.setVisible(true);
    }

    private void backToLobbyButtonClicked() {
        configGamePanel.setEnabled(false);
        configGamePanel.setVisible(false);

        lobbyPanel.setEnabled(true);
        lobbyPanel.setVisible(true);

        playerOpponentButton.setBackground(Color.GRAY);
        playerOpponentButton.setBackground(Color.GRAY);

        for(int i = 0; i < 4; i++) {
            roundButton[i].setBackground(Color.GRAY);
        }
        gameRounds = 1;
        gameMode = GameMode.PLAYER_VS_PLAYER;
    }

    private void playerOpponentButtonClicked() {
        playerOpponentButton.setBackground(Color.RED);
        botOpponentButton.setBackground(Color.GRAY);
        currentOpponentText.setText("Opponent: player");

        gameMode = GameMode.PLAYER_VS_PLAYER;
    }

    private void botOpponentButtonClicked() {
        botOpponentButton.setBackground(Color.RED);
        playerOpponentButton.setBackground(Color.GRAY);
        currentOpponentText.setText("Opponent: bot");

        gameMode = GameMode.PLAYER_VS_BOT;
    }

    private void roundButtonClicked(int index) {
        for(int i = 0; i < 4; i++) {
            roundButton[i].setBackground(Color.GRAY);
        }

        roundButton[index].setBackground(Color.RED);
        int rounds = index + 1;
        currentRoundText.setText("Rounds: " + rounds);
        gameRounds = rounds;
    }

    private void verifyCurrentGame() {
        if(game.isGameEnded()) {
            showEndPanel();
        }
        else if(game.isRoundEnded()) {
            newRound();
        }
    }

    private void newRound() {
        game.setRoundEnded(false);

        for(int i = 0; i < 9; i++) {
            gameButton[i].setText("");
            gameButton[i].setBackground(Color.WHITE);
            gameButton[i].setEnabled(true);
        }
    }

    private void showEndPanel() {
        gamePanel.setEnabled(false);
        gamePanel.setVisible(false);

        endPanel.setEnabled(true);
        endPanel.setVisible(true);

        playerPoints[0].setText("Player one: " + game.getPlayerOne().getPoints());
        playerPoints[1].setText("Player two: " + game.getPlayerTwo().getPoints());
        game = null;
    }

    private void gameButtonClicked(int index, int X, int Y) {
        if(game.getPlayerTime() == game.getPlayerOne()) {
            gameButton[index].setText("O");
            gameButton[index].setForeground(Color.BLUE);
            gameButton[index].setBackground(Color.BLUE);
            gameButton[index].setEnabled(false);
        }
        else {
            gameButton[index].setText("X");
            gameButton[index].setForeground(Color.RED);
            gameButton[index].setBackground(Color.RED);
            gameButton[index].setEnabled(false);
        }

        game.updateGame(X, Y);
        verifyCurrentGame();
    }
}
