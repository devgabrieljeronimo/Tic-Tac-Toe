package graphic_interface;

import javax.swing.*;
import java.awt.*;

public class GameInterface extends JFrame {

    JLabel gameTitle;
    JButton playButton;

    public GameInterface() {
        setTitle("TicTacToe");
        ImageIcon gameIcon = new ImageIcon(getClass().getResource("ChatGPTImage06-18-2025,16_51_27.png"));
        setIconImage(gameIcon.getImage());
        //setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        setBounds(0, 0, 700, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        //setBackground();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initObjects();
        addObjects();
        addConfigEvents();
    }

    private void initObjects() {
        gameTitle = new JLabel("TicTacToe");
        playButton = new JButton("Play");
    }

    private void addObjects() {
        setLayout(null);

        gameTitle.setBounds(0, 0, 500, 250);
        playButton.setBounds(300, 325, 100, 50);

        add(gameTitle);
        add(playButton);
    }

    private void addConfigEvents() {
        playButton.addActionListener(e -> playButtonClicked());
    }

    private void playButtonClicked() {
        System.out.println("Fui clicado =)");
    }
}
