package graphic_interface;

import javax.swing.*;
import java.awt.*;

public class GameInterface extends JFrame {

    private ImageIcon gameIcon;
    private JLabel gameTitle;
    private JButton playButton;
    private JPanel lobbyPanel;

    private JLabel gameOpponentText, gameRoundText;
    private JButton backToLobbyButton;
    private JButton playerOpponentButton, botOpponentButton;
    private JButton oneRoundButton, twoRoundButton, threeRoundButton, fourRoundButton;
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

        getContentPane().setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        initPanels();
        modifyPanels();
        addPanels();
        addButtonEvents();
    }

    private void initObjects() {
        // Instance objects of lobbyPanel
        gameTitle = new JLabel("TicTacToe");
        playButton = new JButton("Play");
        // Instance objects of configGamePanel
        gameOpponentText = new JLabel("Opponent");
        backToLobbyButton = new JButton("Back");
        playerOpponentButton = new JButton("Player");
        botOpponentButton = new JButton("Bot");
        oneRoundButton = new JButton("One");
        twoRoundButton = new JButton("Two");
        threeRoundButton = new JButton("Three");
        fourRoundButton = new JButton("Four");
    }

    private void modifyObjects() {
        // Modify objects of lobbyPanel
        gameTitle.setBounds(320, 325, 300, 150);
        playButton.setBounds(300, 450, 100, 50);
        // Modify objects of configGamePanel
        gameOpponentText.setBounds(170, 0, 100, 50);
        backToLobbyButton.setBounds(165, 300, 75, 50);
        playerOpponentButton.setBounds(50, 50, 100, 75);
        botOpponentButton.setBounds(250, 50, 100, 75);
        oneRoundButton.setBounds(50, 150, 75, 75);
        twoRoundButton.setBounds(125, 150, 75, 75);
        threeRoundButton.setBounds(200, 150, 75, 75);
        fourRoundButton.setBounds(275, 150, 75, 75);
    }

    private void addObjects() {
        // Add to lobbyPanel
        lobbyPanel.add(gameTitle);
        lobbyPanel.add(playButton);
        // Add to configGamePanel
        configGamePanel.add(gameOpponentText);
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
        backToLobbyButton.addActionListener((e -> backToLobbyButtonClicked()));
    }

    private void playButtonClicked() {
        lobbyPanel.setEnabled(false);
        lobbyPanel.setVisible(false);

        configGamePanel.setEnabled(true);
        configGamePanel.setVisible(true);
    }

    private void backToLobbyButtonClicked() {
        configGamePanel.setEnabled(false);
        configGamePanel.setVisible(false);

        lobbyPanel.setEnabled(true);
        lobbyPanel.setVisible(true);
    }

    private void playerOpponentButtonClicked() {

    }

    private void botOpponentButtonClicked() {

    }

    private void oneRoundButtonClicked() {

    }

    private void twoRoundButtonClicked() {

    }

    private void threeRoundButtonClicked() {

    }

    private void fourRoundButtonClicked() {

    }
}
