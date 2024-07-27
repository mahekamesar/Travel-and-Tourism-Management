package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {

    JButton create,back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 233, 200));
        p1.setBounds(0,0,450,400);
        p1.setLayout(null);
        add(p1);

        JLabel lblusername = new JLabel("Username :");
        lblusername.setFont((new Font("Times New Roman",Font.BOLD,15)));
        lblusername.setBounds(50,20,125,25);
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(190,20,180,25);
        p1.add(tfusername);

        JLabel lblname = new JLabel("Name :");
        lblname.setFont((new Font("Times New Roman",Font.BOLD,15)));
        lblname.setBounds(50,60,125,25);
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(190,60,180,25);
        p1.add(tfname);

        JLabel lblpassword = new JLabel("Password :");
        lblpassword.setFont((new Font("Times New Roman",Font.BOLD,15)));
        lblpassword.setBounds(50,100,125,25);
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(190,100,180,25);
        p1.add(tfpassword);

        JLabel lblsecurity = new JLabel("Security Question :");
        lblsecurity.setFont((new Font("Times New Roman",Font.BOLD,14)));
        lblsecurity.setBounds(50,140,125,25);
        p1.add(lblsecurity);

        security = new Choice();
        security.add("Favourite Movie Character");
        security.add("Your Childhood Superhero");
        security.add("Your Favourite Number : ");
        security.add("Your Favourite Colour : ");
        security.setBounds(190,140,180,25);
        p1.add(security);

        JLabel lblanswer = new JLabel("Enter Answer :");
        lblanswer.setFont((new Font("Times New Roman",Font.BOLD,15)));
        lblanswer.setBounds(50,180,125,25);
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(190,180,180,25);
        p1.add(tfanswer);

        create = new JButton("Create");
        create.setBounds(80,250,100,30);
        create.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setBounds(220,250,100,30);
        back.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550,50,250,250);
        add(image);

        setVisible(true);

    }
    public static void main(String[] args) {
        new Signup();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //on click trigger krne ke liye
        if(ae.getSource()==create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password =  tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();

            String query = "insert into account values('"+username+"', '"+name+"', '"+password+"', '"+question+"' , '"+answer+"')";
            try{
                    Conn c = new Conn();
                    c.s.executeUpdate(query); // s is statement & c is connection ka object

                    JOptionPane.showMessageDialog(null,"Account Created Successfully");

                    setVisible(false);
                    new Login();
            }catch (Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource()==back) {
            setVisible(false);
            new Login();
        }
    }
}
