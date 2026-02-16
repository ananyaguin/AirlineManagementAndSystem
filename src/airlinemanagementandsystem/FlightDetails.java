
package airlinemanagementandsystem;


import javax.swing.*;
import java.awt.*;

public class FlightDetails extends JFrame {

    public FlightDetails() {

        setLayout(null);

        JLabel heading = new JLabel("FLIGHT DETAILS");
        heading.setBounds(250,20,400,30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        add(heading);

        String[] column = {"Flight No", "Source", "Destination", "Price"};
        String[][] data = {
                {"AI101", "Kolkata", "Delhi", "5500"},
                {"AI202", "Mumbai", "Chennai", "5000"},
                {"AI303", "Delhi", "Bangalore", "6000"}
        };

        JTable table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(50,80,600,200);
        add(sp);

        setSize(700,400);
        setLocation(300,200);
        setVisible(true);
    }
}
