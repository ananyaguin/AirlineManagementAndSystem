/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinemanagementandsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java. sql.*;

public class Home extends JFrame implements ActionListener {
    
    public Home(){
        
    
    setLayout(null);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("airlinemanagementandsystem/icons/front.jpg"));
    JLabel image=new JLabel(i1);
    image.setBounds(0,0,1600,800);
    add(image);
    
    JLabel heading=new JLabel("AIR INDIA WELCOMES YOU ");
    heading.setBounds(440,40,1000,40);
    heading.setForeground(Color.BLUE);
    heading.setFont(new Font("Tahoma",Font.CENTER_BASELINE,46));
    image.add(heading);
    
    
    JMenuBar menubar=new JMenuBar();
    setJMenuBar(menubar);
    
    JMenu details=new JMenu("Details");
    menubar.add(details);
    
    JMenu Booking=new JMenu("Booking");
    menubar.add(Booking);
    
    
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setLocation(600,250);   
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
    
        
    }
    
    public static void main(String[]args){
    
    new Home();
    
    }
}
