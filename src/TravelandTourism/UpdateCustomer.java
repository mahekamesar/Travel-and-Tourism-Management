package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener {

    JLabel labelusername , labelname;
    JComboBox comboid;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphone, tfid, tfgender, tfname;
    JRadioButton rmale, rfemale;
    JButton add, back;
    UpdateCustomer(String username){
        setBounds(450,200,850,550);
        setLayout(null);

        JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,0,500,25);
        text.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,30));
        add(text);

        JLabel lblusername = new JLabel("Username : ");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername); //uneditable field

        JLabel lblid = new JLabel("Select ID : ");
        lblid.setBounds(30,90,150,25);
        lblid.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add(lblid);

        tfid = new JTextField();
        tfid.setBounds(220,90,150,25);
        add(tfid);

        JLabel lblnumber = new JLabel("ID Number : ");
        lblnumber.setBounds(30,130,150,25);
        lblnumber.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);

        JLabel lblname = new JLabel("Name :");
        lblname.setBounds(30,170,150,25);
        lblname.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add(lblname);


        tfname = new JTextField();
        tfname.setBounds(220,170,150,25);
        add(tfname);

        JLabel lblgender = new JLabel("Gender : ");
        lblgender.setBounds(30,210,150,25);
        lblgender.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add(lblgender);

        tfgender = new JTextField();
        tfgender.setBounds(220,210,150,25);
        add(tfgender);

        JLabel lblcountry = new JLabel("Country : ");
        lblcountry.setBounds(30,250,150,25);
        lblcountry.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);

        JLabel lbladdress = new JLabel("Address : ");
        lbladdress.setBounds(30,290,150,25);
        lbladdress.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);

        JLabel lblphone = new JLabel("phone No. : ");
        lblphone.setBounds(30,330,150,25);
        lblphone.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(220,330,150,25);
        add(tfphone);

        JLabel lblemail = new JLabel("Email : ");
        lblemail.setBounds(30,370,150,25);
        lblemail.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(220,370,150,25);
        add(tfemail);

        add = new JButton("Update");
        add.setBounds(70,430,100,25);
        add.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        add.addActionListener(this);
        add(add);


        back = new JButton("Go Back");
        back.setBounds(200,430,150,25);
        back.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(300,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,40,450,420);
        add(image);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while (rs.next()){
                labelusername.setText(rs.getString("username"));
                tfname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new UpdateCustomer("mahek_amesar");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add){
            String username = labelusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            String name = tfname.getText();
            String gender = tfgender.getText();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();


            try{
                Conn c = new Conn();
                String query = "update customer set id = '"+id+"', number = '"+number+"', name = '"+name+"', gender = '"+gender+"', country = '"+country+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"' where username = '"+username+"'";
                c.s.executeUpdate(query);


                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            setVisible(false);
        }
    }
}
