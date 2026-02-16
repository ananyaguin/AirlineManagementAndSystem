
package airlinemanagementandsystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener {

    JTextField tfname, tfphone, tfaadhar, tfnationality;
    JButton save;

    public AddCustomer() {

        setLayout(null);

        JLabel heading = new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(200,20,400,30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50,80,100,25);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(150,80,150,25);
        add(tfname);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(50,120,100,25);
        add(phone);

        tfphone = new JTextField();
        tfphone.setBounds(150,120,150,25);
        add(tfphone);

        JLabel aadhar = new JLabel("Aadhar");
        aadhar.setBounds(50,160,100,25);
        add(aadhar);

        tfaadhar = new JTextField();
        tfaadhar.setBounds(150,160,150,25);
        add(tfaadhar);

        JLabel nationality = new JLabel("Nationality");
        nationality.setBounds(50,200,100,25);
        add(nationality);

        tfnationality = new JTextField();
        tfnationality.setBounds(150,200,150,25);
        add(tfnationality);

        save = new JButton("Save");
        save.setBounds(150,250,100,30);
        save.addActionListener(this);
        add(save);

        setSize(500,400);
        setLocation(400,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String name = tfname.getText();
        String phone = tfphone.getText();
        String aadhar = tfaadhar.getText();
        String nationality = tfnationality.getText();

        try {
            Conn c = new Conn();
            String query = "insert into customer values('"+name+"','"+phone+"','"+aadhar+"','"+nationality+"')";
            c.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Customer Added Successfully");
            setVisible(false);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

