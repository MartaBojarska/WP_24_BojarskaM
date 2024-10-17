import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class CalculatorApp extends JFrame {
    
        private JButton button_0 = new JButton("0");
        private JButton button_1 = new JButton("1");
        private JButton button_2 = new JButton("2");
        private JButton button_3 = new JButton("3");
        private JButton button_4 = new JButton("4");
        private JButton button_5 = new JButton("5");
        private JButton button_6 = new JButton("6");
        private JButton button_7 = new JButton("7");
        private JButton button_8 = new JButton("8");
        private JButton button_9 = new JButton("9");
        private JButton button_C = new JButton("C");
        private JButton button_Backspace = new JButton("<-");
        private JButton button_Plus = new JButton("+");
        private JButton button_Minus = new JButton("-");
        private JButton button_Multiply = new JButton("*");
        private JButton button_Divide = new JButton("/");
        private JButton button_Equal = new JButton("=");
        private JTextField textScreen;

        
    public CalculatorApp(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new BorderLayout());
        textScreen = new JTextField("");
        mainPanel.add("North", textScreen);

        JPanel buttonPanel = new JPanel(new GridLayout(5,4));

        button_9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('9');
            }
        });
        button_8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('8');
            }
        });
        button_7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('7');
            }
        });
        button_6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('6');
            }
        });
        button_5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('5');
            }
        });
        button_4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('4');
            }
        });
        button_3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('3');
            }
        });
        button_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('2');
            }
        });
        button_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('1');
            }
        });
        button_0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Calculator.addDigit('0');
            }
        });
        button_C.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textScreen.setText("");
                first=0;
                second=0;
                operation="";
            }
        });
        button_Plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textScreen.getText().equals("")) {
                    return;
                }
                first = Integer.parseInt(textScreen.getText());
                textScreen.setText("");
                operation = "+";
            }
        });
        button_Minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textScreen.getText().equals("")) {
                    return;
                }
                first = Integer.parseInt(textScreen.getText());
                textScreen.setText("");
                operation = "-";
            }
        });
        button_Multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textScreen.getText().equals("")) {
                    return;
                }
                first = Integer.parseInt(textScreen.getText());
                textScreen.setText("");
                operation = "*";
            }
        });
        button_Divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textScreen.getText().equals("")) {
                    return;
                }
                first = Integer.parseInt(textScreen.getText());
                textScreen.setText("");
                operation = "/";
            }
        });
        button_Equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textScreen.getText().equals("")) {
                    return;
                }
                second = Integer.parseInt(textScreen.getText());
                switch (operation) {
                    case "+":
                        int result = first + second;
                        textScreen.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = first - second;
                        textScreen.setText(String.valueOf(result));
                        break;
                    case "*":
                        result = first * second;
                        textScreen.setText(String.valueOf(result));
                        break;
                    case "/":
                        try {
                            result = first / second;
                            textScreen.setText(String.valueOf(result));
                        } catch (Exception ex) {
                            System.out.println(ex);
                        }
                        
                        break;
                
                    default:
                        break;
                }
            }
        });
        button_Backspace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
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
    }

    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();
        app.pack();
        app.setVisible(true);
    }
}