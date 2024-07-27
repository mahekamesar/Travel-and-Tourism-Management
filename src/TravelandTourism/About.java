package TravelandTourism;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener {

    String s;

    public About() {
        setBounds(500, 100, 700, 550);

        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(250, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("Times New Roman", Font.BOLD, 180);
        setFont(f);

        s = "                                   About Project           \n  "
                + "\nThe objective of the Travel and Tourism Management System"
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
        ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(50, 100, 600, 300);
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(t1);


        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("ABOUT US");
        add(l1);
        l1.setBounds(230, 10, 700, 80);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 50));
        l1.setForeground(Color.BLACK);



        //setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
