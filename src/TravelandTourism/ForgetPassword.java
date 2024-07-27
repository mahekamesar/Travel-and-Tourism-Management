package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForgetPassword extends JFrame implements ActionListener {

    JButton search, retrieve,back;
    JTextField tfname,tfusername,tfpassword,tfanswer, tfquestion;

    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);

        JLabel lblusername = new JLabel("Username : ");
        lblusername.setBounds(40,20,120,25);
        lblusername.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
        p1.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(190,20,170,25); // x is left se kitni space chahiye y is upper se kitni space chahaiye width is kitna bada textbox chahiye height is height of text box
        p1.add(tfusername);

        search = new JButton("Search");
        search.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        search.setBounds(370,20,125,25);
        search.addActionListener(this);
        p1.add(search);

        JLabel lblname = new JLabel("Name : ");
        lblname.setBounds(40,60,120,25);
        lblname.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
        p1.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(190,60,170,25); // x is left se kitni space chahiye y is upper se kitni space chahaiye width is kitna bada textbox chahiye height is height of text box
        p1.add(tfname);

        JLabel lblquestion = new JLabel("Security Question:");
        lblquestion.setBounds(40,100,150,25);
        lblquestion.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,17));
        p1.add(lblquestion);

        tfquestion = new JTextField();
        tfquestion.setBounds(190,100,170,25); // x is left se kitni space chahiye y is upper se kitni space chahaiye width is kitna bada textbox chahiye height is height of text box
        p1.add(tfquestion);

        JLabel lblanswer = new JLabel("Security Answer:");
        lblanswer.setBounds(40,140,150,25);
        lblanswer.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,19));
        p1.add(lblanswer);

        tfanswer = new JTextField();
        tfanswer.setBounds(190,140,170,25); // x is left se kitni space chahiye y is upper se kitni space chahaiye width is kitna bada textbox chahiye height is height of text box
        p1.add(tfanswer);

        retrieve = new JButton("Retrieve :");
        retrieve.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        retrieve.setBounds(370,140,125,25);
        retrieve.addActionListener(this);
        p1.add(retrieve);

        JLabel lblpassword = new JLabel("Your Password is :");
        lblpassword.setBounds(40,180,150,25);
        lblpassword.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
        p1.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(190,180,170,25); // x is left se kitni space chahiye y is upper se kitni space chahaiye width is kitna bada textbox chahiye height is height of text box
        p1.add(tfpassword);

        back = new JButton("Back");
        back.setBounds(200,220,100,30);
        back.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        back.addActionListener(this);
        p1.add(back);



        setVisible(true);

    }
    public static void main(String[] args) {
        new ForgetPassword();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()==search){
            try{
                String query = "select * from account where username = '"+tfusername.getText()+"'";
                Conn c = new Conn();
                ResultSet rs;
               rs =  c.s.executeQuery(query);
               while(rs.next()){
                   tfname.setText(rs.getString("name"));
                  tfquestion.setText(rs.getString("security"));
               }
            }catch(Exception e){
                System.out.println(e);
            }
        } else if (ae.getSource()==retrieve) {

            try{
                String query = "select * from account where answer = '"+tfanswer.getText()+"' and username = '"+tfusername.getText()+"'";
                Conn c = new Conn();
                ResultSet rs;
                rs =  c.s.executeQuery(query);
                while(rs.next()){
                    tfpassword.setText(rs.getString("password"));
                }
            }catch(Exception e){
                System.out.println(e);
            }

        }else{
            setVisible(false);
            new Login();
        }

    }
}
