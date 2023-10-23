import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class druha extends JFrame {
    private JButton clickButton;
    private JLabel answerLabel;

    public druha() {
        setTitle("Magic 8-Ball");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        clickButton = new JButton("Klikni na guličku");
        answerLabel = new JLabel("");

        setLayout(new BorderLayout());
        add(clickButton, BorderLayout.NORTH);
        add(answerLabel, BorderLayout.CENTER);

        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Náhodné rozhodnutie "áno" alebo "nie"
                String[] responses = {"Áno", "Nie"};
                int randomIndex = (int) (Math.random() * responses.length);
                String response = responses[randomIndex];
                answerLabel.setText(response);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                druha magicBallApp = new druha();
                magicBallApp.setVisible(true);
            }
        });
    }
}
