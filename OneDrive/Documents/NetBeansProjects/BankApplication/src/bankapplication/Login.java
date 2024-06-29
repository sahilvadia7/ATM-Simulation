package bankapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{

    
    JButton login,singup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

        Login(){
        setTitle("Automated Teller Machine");
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        getContentPane().setBackground(Color.white);
        
        JLabel Heading = new JLabel("Welcome to ATM");
        Heading.setFont(new Font("Osward",Font.BOLD,38));
        Heading.setBounds(200,40,400,40);
        add(Heading);
        
        JLabel cardNo = new JLabel("Card No: ");
        cardNo.setFont(new Font("Raieway",Font.BOLD,28));
        cardNo.setBounds(120,150,150,30);
        add(cardNo);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,16));
        add(cardTextField);
        
        JLabel Pin = new JLabel("Pin: ");
        Pin.setFont(new Font("Raieway",Font.BOLD,28));
        Pin.setBounds(120,220,150,30);
        add(Pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,16));
        add(pinTextField);
        
        login = new JButton();
        login.setBounds(300,300,100,30);
       login.setText("SING IN");
       login.setBackground(Color.black);
       login.setForeground(Color.white);
       login.addActionListener(this);
        add(login);
        
        
        clear = new JButton();
        clear.setBounds(430,300,100,30);
        clear.setText("CLEAR");
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        
        singup = new JButton();
        singup.setBounds(300,350,230,30);
        singup.setText("SING UP");
        singup.setBackground(Color.black);
        singup.setForeground(Color.white);
        singup.addActionListener(this);
        add(singup);
        
        
        setSize(800,480);
        setLocation(350,200);
        setVisible(true);
        }

        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == clear){
                  cardTextField.setText("");
                  pinTextField.setText("");
            }
            else if(ae.getSource() == login){
                
            }else if(ae.getSource() == singup){
                setVisible(false);
                new SingupOne().setVisible(true);
            }
            
        }
        public static void main(String[] args){
            new Login();
        }
    
}