package graphic_interface;

import javax.swing.*;
import java.awt.*;
import game.GameModel;

public class GameInterface extends JFrame {
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
    }

    private void modifyObjects() {
        // Modify objects of lobbyPanel
        gameTitle.setBounds(270, 250, 200, 200);
        gameTitle.setFont(new Font("Arial", Font.BOLD, 30));
        playButton.setBounds(300, 450, 100, 50);
        playButton.setBackground(Color.GREEN);
        playButton.setBorderPainted(false);
        playButton.setFocusPainted(false);
        playButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // Modify objects of configGamePanel
        gameOpponentText.setBounds(170, 0, 100, 50);
        gameRoundText.setBounds(175, 120, 100, 50);
        currentOpponentText.setBounds(50, 270, 100, 50);
        currentRoundText.setBounds(250, 270, 100, 50);
        startGameButton.setBounds(165, 320, 75, 50);
        startGameButton.setBackground(Color.GREEN);
        startGameButton.setFocusPainted(false);
        startGameButton.setBorderPainted(false);
        startGameButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backToLobbyButton.setBounds(370, 0, 30, 30);
        backToLobbyButton.setBackground(Color.RED);
        backToLobbyButton.setBorderPainted(false);
        backToLobbyButton.setFocusPainted(false);
        backToLobbyButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        playerOpponentButton.setBounds(50, 50, 100, 75);
        playerOpponentButton.setBackground(Color.GRAY);
        playerOpponentButton.setBorderPainted(false);
        playerOpponentButton.setFocusPainted(false);
        playerOpponentButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botOpponentButton.setBounds(250, 50, 100, 75);
        botOpponentButton.setBackground(Color.GRAY);
        botOpponentButton.setBorderPainted(false);
        botOpponentButton.setFocusPainted(false);
        botOpponentButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        oneRoundButton.setBounds(50, 170, 70, 75);
        oneRoundButton.setBackground(Color.GRAY);
        oneRoundButton.setBorderPainted(false);
        oneRoundButton.setFocusPainted(false);
        oneRoundButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        twoRoundButton.setBounds(127, 170, 70, 75);
        twoRoundButton.setBackground(Color.GRAY);
        twoRoundButton.setBorderPainted(false);
        twoRoundButton.setFocusPainted(false);
        twoRoundButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        threeRoundButton.setBounds(203, 170, 70, 75);
        threeRoundButton.setBackground(Color.GRAY);
        threeRoundButton.setBorderPainted(false);
        threeRoundButton.setFocusPainted(false);
        threeRoundButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        fourRoundButton.setBounds(280, 170, 70, 75);
        fourRoundButton.setBackground(Color.GRAY);
        fourRoundButton.setBorderPainted(false);
        fourRoundButton.setFocusPainted(false);
        fourRoundButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
    }

    private void initPanels() {
        initObjects();

        lobbyPanel = new JPanel(null);

        configGamePanel = new JPanel(null);
    }

    private void modifyPanels() {
        modifyObjects();

        lobbyPanel.setBounds(0,0, 700, 700);
        lobbyPanel.setOpaque(false);

        configGamePanel.setBounds(150, 150, 400, 400);
        configGamePanel.setEnabled(false);
        configGamePanel.setVisible(false);
    }

    private void addPanels() {
        addObjects();

        add(lobbyPanel);
        add(configGamePanel);
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
    }

    private void playButtonClicked() {
        lobbyPanel.setEnabled(false);
        lobbyPanel.setVisible(false);

        configGamePanel.setEnabled(true);
        configGamePanel.setVisible(true);
    }

    private void startGameButtonClicked() {

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
    }

    private void botOpponentButtonClicked() {
        botOpponentButton.setBackground(Color.RED);
        playerOpponentButton.setBackground(Color.GRAY);
        currentOpponentText.setText("Opponent: bot");
    }

    private void oneRoundButtonClicked() {
        oneRoundButton.setBackground(Color.RED);
        twoRoundButton.setBackground(Color.GRAY);
        threeRoundButton.setBackground(Color.GRAY);
        fourRoundButton.setBackground(Color.GRAY);
        currentRoundText.setText("Rounds: 1");
    }

    private void twoRoundButtonClicked() {
        twoRoundButton.setBackground(Color.RED);
        oneRoundButton.setBackground(Color.GRAY);
        threeRoundButton.setBackground(Color.GRAY);
        fourRoundButton.setBackground(Color.GRAY);
        currentRoundText.setText("Rounds: 2");
    }

    private void threeRoundButtonClicked() {
        threeRoundButton.setBackground(Color.RED);
        oneRoundButton.setBackground(Color.GRAY);
        twoRoundButton.setBackground(Color.GRAY);
        fourRoundButton.setBackground(Color.GRAY);
        currentRoundText.setText("Rounds: 3");
    }

    private void fourRoundButtonClicked() {
        fourRoundButton.setBackground(Color.RED);
        oneRoundButton.setBackground(Color.GRAY);
        twoRoundButton.setBackground(Color.GRAY);
        threeRoundButton.setBackground(Color.GRAY);
        currentRoundText.setText("Rounds: 4");
    }
}
