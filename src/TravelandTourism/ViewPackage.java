package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewPackage extends JFrame implements ActionListener {

    JButton back;
    ViewPackage(String username){
        setBounds(450,200,900,450);
        getContentPane().setBackground(new Color(255,142,143));
        setLayout(null);

        JLabel text = new JLabel("VIEW PACKAGE DETAILS");
        text.setBounds(60,0,400,30);
        text.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(text);

        JLabel lblusername = new JLabel("Username :");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblusername);

        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);

        JLabel lblpackage = new JLabel("Package Selected:");
        lblpackage.setBounds(30,90,150,25);
        lblpackage.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblpackage);

        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220,90,150,25);
        add(labelpackage);

        JLabel lblnumber = new JLabel("Total Persons:");
        lblnumber.setBounds(30,130,150,25);
        lblnumber.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblnumber);

        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220,130,150,25);
        add(labelpersons);

        JLabel lblname = new JLabel("ID :");
        lblname.setBounds(30,170,150,25);
        lblname.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblname);

        JLabel labelid = new JLabel();
        labelid.setBounds(220,170,150,25);
        add(labelid);

        JLabel lblgender = new JLabel("ID Number:");
        lblgender.setBounds(30,210,150,25);
        lblgender.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblgender);

        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,210,150,25);
        add(labelnumber);

        JLabel lblcountry = new JLabel("Phone No.:");
        lblcountry.setBounds(30,250,150,25);
        lblcountry.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblcountry);

        JLabel labelphone = new JLabel();
        labelphone.setBounds(220,250,150,25);
        add(labelphone);

        JLabel lbladdress = new JLabel("Total Price:");
        lbladdress.setBounds(30,290,150,25);
        lbladdress.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lbladdress);

        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,290,150,25);
        add(labelprice);


        back = new JButton("Back");
        back.setBounds(250,350,100,25);
        back.setFont(new Font("Times New Roman",Font.BOLD,20));
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,350,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,20,400,350);
        add(image);

        try{
            Conn c = new Conn();
            String query = "select * from bookpackage where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
                labelpackage.setText(rs.getString("package"));
                labelpersons.setText(rs.getString("persons"));
                labelprice.setText(rs.getString("price"));

            }

        }catch (Exception e){
            e.printStackTrace();
        }



        setVisible(true);
    }

    public static void main(String[] args) {
        new ViewPackage("mahek");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
        }
    }
}
