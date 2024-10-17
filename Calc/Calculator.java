import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator extends JFrame{
    private static JTextField textFieldScreen;
    private String firstNum;
    private String secondNum;
    private String operation;

    public static void addDigit(char digit){
        textFieldScreen.setText(textFieldScreen.getText() + digit);
    }

    public void add(){
        firstNum = String.valueOf(Integer.parseInt(firstNum) + Integer.parseInt(secondNum));
        secondNum = "";
    }

    public void subtract(){
        firstNum = String.valueOf(Integer.parseInt(firstNum) - Integer.parseInt(secondNum));
        secondNum = "";
    }

    public void multiply(){
        firstNum = String.valueOf(Integer.parseInt(firstNum) * Integer.parseInt(secondNum));
        secondNum = "";
    }

    public void divide(){
        try {
            firstNum = String.valueOf(Integer.parseInt(firstNum) / Integer.parseInt(secondNum));
            secondNum = "";
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }

    public void calculate(){
        switch (operation) {
            case "+":
                add();
                break;
            case "-":
                subtract();
                break;
            case "*":
                multiply();
                break;
            case "/":
                divide();
                break;
        
            default:
                break;
        }
    }

    public void clear(){
        textFieldScreen.setText("");
        firstNum = "";
        secondNum = "";
        operation = "";
    }

    public int backspace(){
        return 0;
    }
}
