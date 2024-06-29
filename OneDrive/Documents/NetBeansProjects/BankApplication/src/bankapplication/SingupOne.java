package bankapplication;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.*;
import java.awt.event.*;

public class SingupOne extends JFrame implements ActionListener{
    
    long random;
    JLabel personalDetails,name,fname,dob,gender,email,marital,address,city,state,pincode;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JDateChooser datechooser;
    JRadioButton male,female,married,unmarried,other;
    ButtonGroup grpButton,MgrpButton;
    JButton next;
    
    SingupOne(){
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L)+ 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,60,400,30);
        add(personalDetails);
        
        
        name = new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,22));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        
        fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,180,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,22));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        dob = new JLabel("Date 0f Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,180,30);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setFont(new Font("Raleway",Font.BOLD,22));
        datechooser.setBounds(300,240,400,30);
        add(datechooser);
        
        
        
        gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway",Font.BOLD,16));
        male.setBackground(Color.white);
        male.setBounds(300,290,100,30);
        add(male);
        
        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway",Font.BOLD,16));
        female.setBackground(Color.white);
        female.setBounds(440,290,100,30);
        add(female);
        
          grpButton = new ButtonGroup();

        grpButton.add(male);
        grpButton.add(female);
        
        
        email = new JLabel("Email :");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,340,200,30);
        add(email);
        
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,22));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        
        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway",Font.BOLD,16));
        married.setBackground(Color.white);
        married.setBounds(300,390,100,30);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway",Font.BOLD,16));
        unmarried.setBackground(Color.white);
        unmarried.setBounds(420,390,120,30);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway",Font.BOLD,16));
        other.setBackground(Color.white);
        other.setBounds(560,390,100,30);
        add(other);
        
        MgrpButton = new ButtonGroup();

        MgrpButton.add(married);
        MgrpButton.add(unmarried);
        MgrpButton.add(other);
        
        
        address = new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,22));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        
        city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,22));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        state = new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,22));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        pincode = new JLabel("Pincode :");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,22));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,22));
        next.setBounds(560,640,140,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = ""+ random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        
            
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else{
                Conn c = new Conn();
                String query = "INSERT INTO SINGUP VALUES('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.s.executeUpdate(query);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        new SingupOne();
        
    }
    
}
