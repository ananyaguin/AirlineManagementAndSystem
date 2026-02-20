
package airlinemanagementandsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Home extends JFrame implements ActionListener {

    public Home() {

        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

       
        UIManager.put("Menu.selectionBackground", new Color(173, 216, 230));
        UIManager.put("MenuItem.selectionBackground", new Color(200, 230, 255));

     
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        URL url = ClassLoader.getSystemResource("airlinemanagementandsystem/icons/front.jpg");

        if (url != null) {
            ImageIcon i1 = new ImageIcon(url);
            Image i2 = i1.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon i3 = new ImageIcon(i2);

            JLabel image = new JLabel(i3);
            image.setBounds(0, 0, width, height);
            image.setLayout(null);
            add(image);

            
            JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
            heading.setBounds(width / 3, 40, 1000, 50);
            heading.setForeground(new Color(0, 0, 200));
            heading.setFont(new Font("Tahoma", Font.BOLD, 40));
            image.add(heading);
        }

    
        JMenuBar menubar = new JMenuBar();
        menubar.setBackground(Color.WHITE);
        setJMenuBar(menubar);

      
        JMenu details = new JMenu("Details");
        details.setFont(new Font("Tahoma", Font.BOLD, 14));
        menubar.add(details);

        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);

        JMenuItem customerDetails = new JMenuItem("Add Customer");
        customerDetails.addActionListener(this);
        details.add(customerDetails);

        
        JMenu booking = new JMenu("Booking");
        booking.setFont(new Font("Tahoma", Font.BOLD, 14));
        menubar.add(booking);

        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        booking.add(bookFlight);

        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        booking.add(journeyDetails);

        JMenu ticket = new JMenu("Ticket");
        ticket.setFont(new Font("Tahoma", Font.BOLD, 14));
        menubar.add(ticket);

        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);

        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        ticket.add(ticketCancellation);

        
        JMenu help = new JMenu("Help");
        help.setFont(new Font("Tahoma", Font.BOLD, 14));
        menubar.add(help);

        JMenuItem about = new JMenuItem("About");
        about.addActionListener(this);
        help.add(about);

        JMenuItem logout = new JMenuItem("Logout");
        logout.addActionListener(this);
        help.add(logout);

        setVisible(true);
    }

    
    
    public void actionPerformed(ActionEvent ae) {

        String text = ae.getActionCommand();

        if (text.equals("Add Customer")) {
            new AddCustomer();
        } 
        else if (text.equals("Flight Details")) {
            new FlightDetails();
        } 
        else if (text.equals("Book Flight")) {
            new BookFlight();
        } 
        else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } 
        else if (text.equals("Cancel Ticket")) {
            new Cancel();
        } 
        else if (text.equals("Boarding Pass")) {
            new BoardingPass();
        } 
        else if (text.equals("Logout")) {
            setVisible(false);
            new Login();
        } 
        else if (text.equals("About")) {
            JOptionPane.showMessageDialog(null,
                    "Airline Management System\nDeveloped by Ananya ✈️",
                    "About",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
