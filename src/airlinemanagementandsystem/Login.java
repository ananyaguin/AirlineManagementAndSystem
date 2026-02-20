package airlinemanagementandsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton submit,reset,close;
    JTextField tfusername;
    JPasswordField tfpassword;
    public Login(){
        
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    JLabel lblusername=new JLabel("Username");
    lblusername.setBounds(20,20,100,20);
    add(lblusername);
    
   
    JLabel lblpassword=new JLabel("Password");
    lblpassword.setBounds(20,60,100,20);
    add(lblpassword);
    
    
    tfusername=new JTextField();
    tfusername.setBounds(130,20,200,30);
    add(tfusername);
    
    tfpassword=new JPasswordField();
    tfpassword.setBounds(130,60,200,30);
    add(tfpassword);
    
    
    reset=new JButton("Reset");
    reset.setBounds(30,120,120,30);
    reset.addActionListener(this);
    add(reset);
    
    submit=new JButton("Submit");
    submit.setBounds(145,120,120,30);
    submit.addActionListener(this);
    add(submit);
    
    
    close=new JButton("Close");
    close.setBounds(260,120,120,30);
    close.addActionListener(this);
    add(close);
    
    
    setSize(400,250);
    setLocation(600,250);   
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    }
    
    
    
    public void actionPerformed(ActionEvent ae){
    
    if(ae.getSource()==submit){
        String username=tfusername.getText();
        String password=tfpassword.getText();
        
        try{
            Conn c=new Conn();
            
            String query="select * from login where username='"+username+"' and password='"+password+"'";
            
            ResultSet rs=c.s.executeQuery(query);
            
            if (rs.next()){
                new Home();
                setVisible(false);
            }
            else{
                  JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                setVisible(false);
               
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    else if(ae.getSource()==close){
        setVisible(false);
    }
    else if(ae.getSource()==reset){
        tfusername.setText("");
        tfpassword.setText("");
    }
    
    }
    
    public static void main(String[]args){
    
    new Login();
    
    }
}
