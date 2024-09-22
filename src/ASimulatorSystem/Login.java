package ASimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login(){
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, DO_NOTHING_ON_CLOSE);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 240, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(180, 220, 400, 40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 240, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        login = new JButton("Sign In");
        login.setBounds(300, 300, 100, 30);
        login.setForeground(Color.white);
        login.setBackground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(440,300, 100, 30);
        clear.setForeground(Color.white);
        clear.setBackground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("Sign Up");
        signup.setBounds(300,350,240,30);
        signup.setForeground(Color.white);
        signup.setBackground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setLocation(350, 200);
        setSize(800, 480);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
            
        }
        else if(ae.getSource() == login){

        }
        else if(ae.getSource() == signup){
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
