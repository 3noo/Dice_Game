import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class opGUI extends JFrame {
    private JPanel JLabel;
    private JLabel main;
    private JLabel guess;
    private JTextField f1;
    private JButton rez;
    private JButton fit;
    private JButton ws;
    private JLabel po;
    public int counter = 0;
    public int puty;
    public int zari;

    /*
    @author:Xhelion Brakaj
     */


    private opGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JLabel);
        this.pack();

        rez.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (f1.getText().length() == 0) {
                    fit.setText("Invalid input :/");
                }

                puty = (int) (Integer.parseInt(f1.getText()));

                zari = (int) (Math.random() * 6 + 1);

                if (puty == zari) {
                    fit.setText("Won :)");
                    counter++;
                } else if (puty != zari) {
                    fit.setText("Try again :(");
                    counter = 0;
                }

                System.out.println(zari);
                rez.setText(String.valueOf("Result: " + zari + "         Click to roll !"));
                ws.setText(String.valueOf("Winning Streak: " + counter));
                f1.requestFocus();
            }
        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new opGUI("My App");
        frame.setSize(450, 250);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Dice game");
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\dice4.png");
        frame.setIconImage(icon.getImage());



    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}

