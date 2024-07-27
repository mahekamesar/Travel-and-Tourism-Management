package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
JButton login,signup,password;
JTextField tfusername, tfpassword;
    Login(){
        setSize(900,400);
        setLocation(300,200);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE); //overall background ka color will change

        JPanel p1 = new JPanel(); //by default border layout
        p1.setBackground(Color.pink); //to set background of the panel
        //border layout --> border deta hai
        p1.setBounds(0,0,450,350); //used to create custom layout
        p1.setLayout(null); //jab yeh null hoga tab hi setbounds function kaam aayega
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,0,200,400);
        p1.add(image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);

        JLabel lblusername = new JLabel("Username : ");
        lblusername.setBounds(80,20,100,25);
        lblusername.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        p2.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(80,70,200,30); // x is left se kitni space chahiye y is upper se kitni space chahaiye width is kitna bada textbox chahiye height is height of text box
        p2.add(tfusername);

        JLabel lblpassword = new JLabel("Password : ");
        lblpassword.setBounds(80,130,100,25);
        lblpassword.setFont(new Font("TIMES NEW ROMAN",Font.ITALIC,20));
        p2.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(80,170,200,30);
        p2.add(tfpassword);

        login = new JButton("Login");
        login.setBounds(80,220,80,30);
        login.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        login.addActionListener(this);
        p2.add(login);

        signup = new JButton("SignUp");
        signup.setBounds(180,220,100,30);
        signup.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        signup.addActionListener(this);
        p2.add(signup);

        password = new JButton("Forget Password");
        password.setBounds(80,260,180,30);
        password.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        password.addActionListener(this);
        p2.add(password);

        JLabel text = new JLabel("Trouble in Login ");
        text.setBounds(280,260,100,30);
        text.setForeground(Color.RED);
        p2.add(text);


        setVisible(true);

    }
    public static void main(String[] args) {
        Login l = new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                if (e.getSource()==login){

                    try{
                        String username = tfusername.getText();
                        String password = tfpassword.getText();

                        String query = "select * from account where username = '"+username+"' and password = '"+password+"'";
                        Conn c = new Conn();
                        ResultSet rs;
                        rs =  c.s.executeQuery(query);
                        if(rs.next()) {
                            setVisible(false);
                            new Loading(username);
                        } else{
                        JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                        }
                    }catch (Exception ee){
                        ee.printStackTrace();
                    }

                }else if (e.getSource()==signup){
                    setVisible(false);
                    new Signup();
                }else {
                    new ForgetPassword();
                }
        }
    }

