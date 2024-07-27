package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewCustomer extends JFrame implements ActionListener {

    JButton back;
    ViewCustomer(String username){
        setBounds(350,100,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username :");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblusername);

        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);

        JLabel lblid = new JLabel("ID :");
        lblid.setBounds(30,110,150,25);
        lblid.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblid);

        JLabel labelid = new JLabel();
        labelid.setBounds(220,110,150,25);
        add(labelid);

        JLabel lblnumber = new JLabel("ID Number :");
        lblnumber.setBounds(30,170,150,25);
        lblnumber.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblnumber);

        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,170,150,25);
        add(labelnumber);

        JLabel lblname = new JLabel("Name :");
        lblname.setBounds(30,230,150,25);
        lblname.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(220,230,150,25);
        add(labelname);

        JLabel lblgender = new JLabel("Gender :");
        lblgender.setBounds(30,290,150,25);
        lblgender.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblgender);

        JLabel labelgender = new JLabel();
        labelgender.setBounds(220,290,150,25);
        add(labelgender);

        JLabel lblcountry = new JLabel("Country :");
        lblcountry.setBounds(500,50,150,25);
        lblcountry.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblcountry);

        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(700,50,150,25);
        add(labelcountry);

        JLabel lbladdress = new JLabel("Address :");
        lbladdress.setBounds(500,110,150,25);
        lbladdress.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lbladdress);

        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(700,110,150,25);
        add(labeladdress);

        JLabel lblphone = new JLabel("Phone No.:");
        lblphone.setBounds(500,170,150,25);
        lblphone.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblphone);

        JLabel labelphone = new JLabel();
        labelphone.setBounds(700,170,150,25);
        add(labelphone);

        JLabel lblemail = new JLabel("Email:");
        lblemail.setBounds(500,230,150,25);
        lblemail.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblemail);

        JLabel labelemail = new JLabel();
        labelemail.setBounds(700,230,150,25);
        add(labelemail);

        back = new JButton("Back");
        back.setBounds(350,350,100,25);
        back.setFont(new Font("Times New Roman",Font.BOLD,20));
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(130,400,600,200);
        add(image);

        try{
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelgender.setText(rs.getString("gender"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
                labelcountry.setText(rs.getString("country"));

            }

        }catch (Exception e){
            e.printStackTrace();
        }



        setVisible(true);
    }

    public static void main(String[] args) {
        new ViewCustomer("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
        }
    }
}
