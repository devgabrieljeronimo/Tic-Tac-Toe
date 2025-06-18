package graphic_interface;

import javax.swing.*;
import java.awt.*;

public class GameInterface extends JFrame {

    public GameInterface() {
        setTitle("TicTacToe");
        ImageIcon gameIcon = new ImageIcon(getClass().getResource("ChatGPTImage06-18-2025,16_51_27.png"));
        setIconImage(gameIcon.getImage());
        //setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        setBounds(0, 0, 500, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        //setBackground();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addImage(Image image) {

    }


}
