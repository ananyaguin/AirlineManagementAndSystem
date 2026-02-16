
package airlinemanagementandsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class CustomerDetails extends JFrame {

    public CustomerDetails() {

        setLayout(null);

        JLabel heading = new JLabel("CUSTOMER DETAILS");
        heading.setBounds(250,20,400,30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        add(heading);

        String[] column = {"Name", "Phone", "Aadhar", "Nationality"};
        String[][] data = new String[20][4];

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");

            int i = 0;
            while(rs.next()) {
                data[i][0] = rs.getString("name");
                data[i][1] = rs.getString("phone");
                data[i][2] = rs.getString("aadhar");
                data[i][3] = rs.getString("nationality");
                i++;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        JTable table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(50,80,600,200);
        add(sp);

        setSize(700,400);
        setLocation(300,200);
        setVisible(true);
    }
}
