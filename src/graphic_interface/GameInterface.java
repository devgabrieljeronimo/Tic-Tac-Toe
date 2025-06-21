package graphic_interface;

import javax.swing.*;
import java.awt.*;

import game.*;

public class GameInterface extends JFrame {
    // Game
    private Game game;
    // Game config
    private int gameRounds;
    private GameModel gameModel;

    private ImageIcon gameIcon;
    private JLabel gameTitle;
    private JButton playButton;
    private JPanel lobbyPanel;

    private JLabel gameOpponentText, gameRoundText, currentOpponentText, currentRoundText;
    private JButton startGameButton, backToLobbyButton, playerOpponentButton, botOpponentButton,
            oneRoundButton, twoRoundButton, threeRoundButton, fourRoundButton;
    private JPanel configGamePanel;

    private JLabel lineOne, lineTwo, lineThree, lineFour;
    private JButton gameButtonOne, gameButtonTwo, gameButtonThree, gameButtonFour,
            gameButtonFive, gameButtonSix, gameButtonSeven, gameButtonEight, gameButtonNine;
    private JPanel gamePanel;

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
        gameModel = GameModel.PLAYER_VS_PLAYER;
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
        oneRoundButton = new JButton("One");
        twoRoundButton = new JButton("Two");
        threeRoundButton = new JButton("Three");
        fourRoundButton = new JButton("Four");
        // Instance  objects of gamePanel
        gameButtonOne = new JButton();
        gameButtonTwo = new JButton();
        gameButtonThree = new JButton();
        gameButtonFour = new JButton();
        gameButtonFive = new JButton();
        gameButtonSix = new JButton();
        gameButtonSeven = new JButton();
        gameButtonEight = new JButton();
        gameButtonNine = new JButton();
        lineOne = new JLabel();
        lineTwo = new JLabel();
        lineThree = new JLabel();
        lineFour = new JLabel();
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
        oneRoundButton.setBounds(50, 170, 70, 75);
        oneRoundButton.setBorderPainted(false);
        oneRoundButton.setFocusPainted(false);
        oneRoundButton.setBackground(Color.GRAY);
        oneRoundButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        twoRoundButton.setBounds(127, 170, 70, 75);
        twoRoundButton.setBorderPainted(false);
        twoRoundButton.setFocusPainted(false);
        twoRoundButton.setBackground(Color.GRAY);
        twoRoundButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        threeRoundButton.setBounds(203, 170, 70, 75);
        threeRoundButton.setBorderPainted(false);
        threeRoundButton.setFocusPainted(false);
        threeRoundButton.setBackground(Color.GRAY);
        threeRoundButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fourRoundButton.setBounds(280, 170, 70, 75);
        fourRoundButton.setBorderPainted(false);
        fourRoundButton.setFocusPainted(false);
        fourRoundButton.setBackground(Color.GRAY);
        fourRoundButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // modify objects of gamePanel
        gameButtonOne.setBounds(0, 0, 190, 190);
        gameButtonOne.setFont(new Font("gameFont", Font.BOLD, 150));
        gameButtonOne.setBorderPainted(false);
        gameButtonOne.setFocusPainted(false);
        gameButtonTwo.setBounds(210, 0, 180, 190);
        gameButtonTwo.setFont(new Font("gameFont", Font.BOLD, 150));
        gameButtonTwo.setBorderPainted(false);
        gameButtonTwo.setFocusPainted(false);
        gameButtonThree.setBounds(410, 0, 190, 190);
        gameButtonThree.setFont(new Font("gameFont", Font.BOLD, 150));
        gameButtonThree.setBorderPainted(false);
        gameButtonThree.setFocusPainted(false);
        gameButtonFour.setBounds(0, 210, 190, 180);
        gameButtonFour.setFont(new Font("gameFont", Font.BOLD, 150));
        gameButtonFour.setBorderPainted(false);
        gameButtonFour.setFocusPainted(false);
        gameButtonFive.setBounds(210, 210, 180, 180);
        gameButtonFive.setFont(new Font("gameFont", Font.BOLD, 150));
        gameButtonFive.setBorderPainted(false);
        gameButtonFive.setFocusPainted(false);
        gameButtonSix.setBounds(410, 210, 190, 180);
        gameButtonSix.setFont(new Font("gameFont", Font.BOLD, 150));
        gameButtonSix.setBorderPainted(false);
        gameButtonSix.setFocusPainted(false);
        gameButtonSeven.setBounds(0, 410, 190, 190);
        gameButtonSeven.setFont(new Font("gameFont", Font.BOLD, 150));
        gameButtonSeven.setBorderPainted(false);
        gameButtonSeven.setFocusPainted(false);
        gameButtonEight.setBounds(210, 410, 180, 190);
        gameButtonEight.setFont(new Font("gameFont", Font.BOLD, 150));
        gameButtonEight.setBorderPainted(false);
        gameButtonEight.setFocusPainted(false);
        gameButtonNine.setBounds(410, 410, 190, 190);
        gameButtonNine.setFont(new Font("gameFont", Font.BOLD, 150));
        gameButtonNine.setBorderPainted(false);
        gameButtonNine.setFocusPainted(false);
        lineOne.setBounds(190, 0, 20, 600);
        lineOne.setOpaque(true);
        lineOne.setBackground(Color.BLACK);
        lineTwo.setBounds(390, 0, 20, 600);
        lineTwo.setOpaque(true);
        lineTwo.setBackground(Color.BLACK);
        lineThree.setBounds(0, 190, 600, 20);
        lineThree.setOpaque(true);
        lineThree.setBackground(Color.BLACK);
        lineFour.setBounds(0, 390, 600, 20);
        lineFour.setOpaque(true);
        lineFour.setBackground(Color.BLACK);
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
        configGamePanel.add(oneRoundButton);
        configGamePanel.add(twoRoundButton);
        configGamePanel.add(threeRoundButton);
        configGamePanel.add(fourRoundButton);
        // Add to gamePanel
        gamePanel.add(gameButtonOne);
        gamePanel.add(gameButtonTwo);
        gamePanel.add(gameButtonThree);
        gamePanel.add(gameButtonFour);
        gamePanel.add(gameButtonFive);
        gamePanel.add(gameButtonSix);
        gamePanel.add(gameButtonSeven);
        gamePanel.add(gameButtonEight);
        gamePanel.add(gameButtonNine);
        gamePanel.add(lineOne);
        gamePanel.add(lineTwo);
        gamePanel.add(lineThree);
        gamePanel.add(lineFour);
    }

    private void initPanels() {
        initObjects();

        lobbyPanel = new JPanel(null);

        configGamePanel = new JPanel(null);

        gamePanel = new JPanel(null);
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
    }

    private void addPanels() {
        addObjects();

        add(lobbyPanel);
        add(configGamePanel);
        add(gamePanel);
    }

    private void addButtonEvents() {
        playButton.addActionListener(e -> playButtonClicked());
        startGameButton.addActionListener(e -> startGameButtonClicked());
        backToLobbyButton.addActionListener((e -> backToLobbyButtonClicked()));
        playerOpponentButton.addActionListener(e -> playerOpponentButtonClicked());
        botOpponentButton.addActionListener(e -> botOpponentButtonClicked());
        oneRoundButton.addActionListener(e -> oneRoundButtonClicked());
        twoRoundButton.addActionListener(e -> twoRoundButtonClicked());
        threeRoundButton.addActionListener(e -> threeRoundButtonClicked());
        fourRoundButton.addActionListener(e -> fourRoundButtonClicked());
        gameButtonOne.addActionListener(e -> gameButtonOneClicked());
        gameButtonTwo.addActionListener(e -> gameButtonTwoClicked());
        gameButtonThree.addActionListener(e -> gameButtonThreeClicked());
        gameButtonFour.addActionListener(e -> gameButtonFourClicked());
        gameButtonFive.addActionListener(e -> gameButtonFiveClicked());
        gameButtonSix.addActionListener(e -> gameButtonSixClicked());
        gameButtonSeven.addActionListener(e -> gameButtonSevenClicked());
        gameButtonEight.addActionListener(e -> gameButtonEightClicked());
        gameButtonNine.addActionListener(e -> gameButtonNineClicked());
    }

    private void playButtonClicked() {
        lobbyPanel.setEnabled(false);
        lobbyPanel.setVisible(false);

        configGamePanel.setEnabled(true);
        configGamePanel.setVisible(true);
    }

    private void startGameButtonClicked() {
        game = new Game(gameRounds, gameModel);

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

        gameRounds = 1;
        gameModel = GameModel.PLAYER_VS_PLAYER;
    }

    private void playerOpponentButtonClicked() {
        playerOpponentButton.setBackground(Color.RED);
        botOpponentButton.setBackground(Color.GRAY);
        currentOpponentText.setText("Opponent: player");

        gameModel = GameModel.PLAYER_VS_PLAYER;
    }

    private void botOpponentButtonClicked() {
        botOpponentButton.setBackground(Color.RED);
        playerOpponentButton.setBackground(Color.GRAY);
        currentOpponentText.setText("Opponent: bot");

        gameModel = GameModel.PLAYER_VS_BOT;
    }

    private void oneRoundButtonClicked() {
        oneRoundButton.setBackground(Color.RED);
        twoRoundButton.setBackground(Color.GRAY);
        threeRoundButton.setBackground(Color.GRAY);
        fourRoundButton.setBackground(Color.GRAY);
        currentRoundText.setText("Rounds: 1");

        gameRounds = 1;
    }

    private void twoRoundButtonClicked() {
        twoRoundButton.setBackground(Color.RED);
        oneRoundButton.setBackground(Color.GRAY);
        threeRoundButton.setBackground(Color.GRAY);
        fourRoundButton.setBackground(Color.GRAY);
        currentRoundText.setText("Rounds: 2");

        gameRounds = 2;
    }

    private void threeRoundButtonClicked() {
        threeRoundButton.setBackground(Color.RED);
        oneRoundButton.setBackground(Color.GRAY);
        twoRoundButton.setBackground(Color.GRAY);
        fourRoundButton.setBackground(Color.GRAY);
        currentRoundText.setText("Rounds: 3");

        gameRounds = 3;
    }

    private void fourRoundButtonClicked() {
        fourRoundButton.setBackground(Color.RED);
        oneRoundButton.setBackground(Color.GRAY);
        twoRoundButton.setBackground(Color.GRAY);
        threeRoundButton.setBackground(Color.GRAY);
        currentRoundText.setText("Rounds: 4");

        gameRounds = 4;
    }

    private void drawSymbolOne(JButton gameButton) {
        gameButton.setText("O");
        gameButton.setForeground(Color.BLUE);
    }

    private void drawSymbolTwo(JButton gameButton) {
        gameButton.setText("X");
        gameButton.setForeground(Color.RED);
    }

    private void gameButtonOneClicked() {
        gameButtonOne.setEnabled(false);

        if(game.getPlayerTime() == game.getPlayerOne()) {
            drawSymbolOne(gameButtonOne);
        }
        else {
            drawSymbolTwo(gameButtonOne);
        }
    }

    private void gameButtonTwoClicked() {
        gameButtonTwo.setEnabled(false);

        if(game.getPlayerTime() == game.getPlayerOne()) {
            drawSymbolOne(gameButtonTwo);
        }
        else {
            drawSymbolTwo(gameButtonTwo);
        }
    }

    private void gameButtonThreeClicked() {

    }

    private void gameButtonFourClicked() {

    }

    private void gameButtonFiveClicked() {

    }

    private void gameButtonSixClicked() {

    }

    private void gameButtonSevenClicked() {

    }

    private void gameButtonEightClicked() {

    }

    private void gameButtonNineClicked() {

    }
}
