import graphic_interface.GameInterface;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameInterface::new);
    }
}