import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class Calc extends JFrame {

        final JButton button_0 = new JButton("0");
        final JButton button_1 = new JButton("1");
        final JButton button_2 = new JButton("2");
        final JButton button_3 = new JButton("3");
        final JButton button_4 = new JButton("4");
        final JButton button_5 = new JButton("5");
        final JButton button_6 = new JButton("6");
        final JButton button_7 = new JButton("7");
        final JButton button_8 = new JButton("8");
        final JButton button_9 = new JButton("9");
        final JButton button_C = new JButton("C");
        final JButton button_Backspace = new JButton("<-");
        final JButton button_Plus = new JButton("+");
        final JButton button_Minus = new JButton("-");
        final JButton button_Multiply = new JButton("*");
        final JButton button_Divide = new JButton("/");
        final JButton button_Equal = new JButton("=");
        final JTextField textScreen;

        
    public Calc(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout());
        textScreen = new JTextField("Witaj świecie");
        mainPanel.add("North", textScreen);

        JPanel buttonPanel = new JPanel(new GridLayout(5,4));

        button_9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 9);
            }
        });
        button_8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 8);
            }
        });
        button_7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 7);
            }
        });
        button_6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 6);
            }
        });
        button_5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 5);
            }
        });
        button_4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 4);
            }
        });
        button_3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 3);
            }
        });
        button_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 2);
            }
        });
        button_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 1);
            }
        });
        button_0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText(textScreen.getText() + 0);
            }
        });
        button_C.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText("");
            }
        });

        buttonPanel.add(button_Plus);
        buttonPanel.add(button_Minus);
        buttonPanel.add(button_Multiply);
        buttonPanel.add(button_Divide);
        buttonPanel.add(button_7);
        buttonPanel.add(button_8);
        buttonPanel.add(button_9);
        buttonPanel.add(button_C);
        buttonPanel.add(button_4);
        buttonPanel.add(button_5);
        buttonPanel.add(button_6);
        buttonPanel.add(button_Backspace);
        buttonPanel.add(button_1);
        buttonPanel.add(button_2);
        buttonPanel.add(button_3);
        buttonPanel.add(button_Equal);
        buttonPanel.add(new JLabel());
        buttonPanel.add(button_0);
        buttonPanel.add(new JLabel());
        buttonPanel.add(new JLabel());

        mainPanel.add("Center", buttonPanel);

        setContentPane(mainPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        Calc app = new Calc();
    }
}