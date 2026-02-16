package airlinemanagementandsystem;

import javax.swing.*;
import java.awt.*;

public class BookFlight extends JFrame {

    public BookFlight() {

        setLayout(null);

        JLabel heading = new JLabel("BOOK FLIGHT");
        heading.setBounds(250,20,400,30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        add(heading);

        JLabel name = new JLabel("Customer Name");
        name.setBounds(100,80,150,25);
        add(name);

        JTextField tfname = new JTextField();
        tfname.setBounds(250,80,150,25);
        add(tfname);

        JButton book = new JButton("Book Ticket");
        book.setBounds(250,150,120,30);
        add(book);

        setSize(600,350);
        setLocation(350,200);
        setVisible(true);
    }
}

