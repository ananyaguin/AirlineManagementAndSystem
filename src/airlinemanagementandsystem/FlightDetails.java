
package airlinemanagementandsystem;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FlightDetails extends JFrame {

    public FlightDetails() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JTable table = new JTable();

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from flight");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        

        
        
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);

       
        table.setRowHeight(30);

        
        table.setShowGrid(true);
        table.setGridColor(Color.BLACK);

       
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.WHITE);
        header.setForeground(Color.BLACK);
        header.setFont(new Font("SansSerif", Font.BOLD, 14));
        header.setBorder(new LineBorder(Color.BLACK, 2)); 

        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER); 
        renderer.setBackground(Color.WHITE);
        renderer.setForeground(Color.BLACK);
        renderer.setBorder(new LineBorder(Color.BLACK, 2)); 

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(20, 20, 900, 500);
        add(jsp);

        setSize(950, 600);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlightDetails();
    }
}
