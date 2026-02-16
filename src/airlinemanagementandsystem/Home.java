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
    
    JMenuItem flightDetails =new JMenu("Flight Details");
    details.add(flightDetails);
    
    flightDetails.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        new FlightDetails();
    }
});


    
    JMenuItem customerDetails=new JMenu("Add Customer Details");
    details.add(customerDetails);
    
    customerDetails.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        new CustomerDetails();
    }
});


    
    JMenuItem journeyDetails=new JMenu(" Journey Details");
    details.add(journeyDetails);
    
    

    
    JMenuItem addCustomer = new JMenuItem("Add Customer");
    details.add(addCustomer);

    addCustomer.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        new AddCustomer();
    }
     });

    
    
    
    JMenu ticket=new JMenu("Ticket");
    menubar.add(ticket);
    
    JMenuItem bookflight=new JMenu(" Book flight");
    ticket.add(bookflight);
    
    bookflight.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae) {
        new BookFlight();
    }
});

    
    JMenuItem ticketCancelation=new JMenu(" Cancel Ticket");
    ticket.add(ticketCancelation);
    
    JMenuItem boardingpass=new JMenu(" Boardingpass");
    ticket.add(boardingpass);
    
    
    

    

    
    
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
