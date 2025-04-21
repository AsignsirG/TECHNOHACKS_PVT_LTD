import javax.swing.*;
import java.awt.event.*;

public class WelcomeGUI {

    public static void main(String[] args) {
        // Create the main frame (window)
        JFrame frame = new JFrame("Welcome App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click Me!");
        button.setBounds(90, 70, 120, 30);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Welcome to the Java GUI App!");
            }
        });

        // Add button to frame
        frame.setLayout(null); // Absolute positioning
        frame.add(button);

        // Make frame visible
        frame.setVisible(true);
    }
}
