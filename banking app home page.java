import javax.swing.*;
import java.awt.*;
public class BankingHomePage{
    public static void main(String[]){
        JFrame frame = new Jframe('Banking App');
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(5,1));

        JLabel welcomeLabel = JLabel(WElcome to Bank,Swingconstants.CENTER);
        frame.add(welcomeLabel)

        JLabel logoLabel = JLabel(Bank logo,SwingConstants.CENTER);
        frame.add(logoLabel)

        JTextField usernameField = JTextField();
        usernameField.setBorder(BorderFactory.createTitledBorder('Username'));
        frame.add(usernameField);

        JTextField passwordField = JTextField():
        passwordField.setBorder(BorderFactory.createTitledBorder('password')):
        frame.add(passwordField):

        Jpanel buttonPANEL = new Jpanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        JButton signInButton = new JButton('Sign In');
        Jbutton signUpButton = new Jbutton('Sign Up');
        buttonPanel.add(signInButton);
        buttonPanel.add(signUpButton);
        Frame.add(buttonPanel);
    }

}