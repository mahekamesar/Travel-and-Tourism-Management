package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener {

    Choice cpackage;
    JTextField tfpersons;
    String username;
    JLabel labelusername, labelid, labelnumber, labelprice, labelphone;
    JButton checkprice, bookpackage, back;

    BookPackage(String username){
        this.username = username;

        setBounds(350,200,900,500);
        setLayout(null);
        getContentPane().setBackground(Color.pink);

        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100,10,500,30);
        text.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(text);

        JLabel lblusername = new JLabel("Username :");
        lblusername.setBounds(40,70,100,20);
        lblusername.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setBounds(250,70,100,20);
        add(labelusername);

        JLabel lblpackage = new JLabel("Select Package :");
        lblpackage.setBounds(40,110,150,20);
        lblpackage.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblpackage);

        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250,110,150,20);
        cpackage.setBackground(Color.black);
        cpackage.setForeground(Color.WHITE);
        add(cpackage);



        JLabel lblpersons = new JLabel("Total Persons :");
        lblpersons.setBounds(40,150,150,20);
        lblpersons.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblpersons);

        tfpersons = new JTextField("1");
        tfpersons.setBounds(250,150,150,25);
        add(tfpersons);


        JLabel lblid = new JLabel("Id :");
        lblid.setBounds(40,190,150,20);
        lblid.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblid);

        labelid = new JLabel();
        labelid.setBounds(250,190,150,20);
        add(labelid);

        JLabel lblnumber = new JLabel("ID Number :");
        lblnumber.setBounds(40,230,150,20);
        lblnumber.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblnumber);

        labelnumber = new JLabel();
        labelnumber.setBounds(250,230,150,20);
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone No.:");
        lblphone.setBounds(40,270,150,25);
        lblphone.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblphone);

        labelphone = new JLabel();
        labelphone.setBounds(250,270,150,25);
        add(labelphone);

        JLabel lblprice = new JLabel("Total Price:");
        lblprice.setBounds(40,310,150,20);
        lblprice.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(lblprice);

        labelprice = new JLabel();
        labelprice.setBounds(250,310,150,20);
        add(labelprice);

        try{
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        checkprice = new JButton("Check Price");
        checkprice.setBounds(40,380,120,25);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(200,380,120,25);
        bookpackage.addActionListener(this);
        add(bookpackage);

        back = new JButton("Back");
        back.setBounds(360,380,120,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,20,400,300);
        add(image);


        setVisible(true);
    }

    public static void main(String[] args) {
        new BookPackage("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==checkprice){
            String pack = cpackage.getSelectedItem();
            int cost=0;
            if(pack.equalsIgnoreCase("Gold Package")){
                cost=12000;
            } else if(pack.equalsIgnoreCase("Silver Package")){
                cost = 25000;
            }else if(pack.equalsIgnoreCase("Bronze Package")){
                cost = 32000;
            }

            int persons = Integer.parseInt(tfpersons.getText());
            cost = cost * persons;
            labelprice.setText("RS = "+cost);

        }else if(ae.getSource()==bookpackage){

            try{
                Conn c = new Conn();
                c.s.executeUpdate( "insert into bookPackage values('"+labelusername.getText()+"', '"+cpackage.getSelectedItem()+"', '"+tfpersons.getText()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelprice.getText()+"')");

                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);

            }catch (Exception e){
                e.printStackTrace();
            }

        }else{
            setVisible(false);
        }
    }
}
