import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TicTacToe");
        JLabel label = new JLabel("Hello");
        JButton button = new JButton("Click me!");


        label.setBounds(0, 0, 100, 50);
        button.setBounds(0, 50, 100, 50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!");
            }
        });

        frame.add(label);
        frame.add(button);

        // Windows config
        frame.setLayout(null);
        frame.setBounds(700, 350, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}