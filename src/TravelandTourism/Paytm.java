package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener{
    JButton pay, back;
    public Paytm() {
        setTitle("Paytm Redirect");
        setBounds(200,100,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm1.png"));
        Image i8 = i7.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(100, 100, 300, 300);
        add(l4);


        pay = new JButton("Click Here to Pay");
        pay.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        pay.setBounds(50, 50, 300, 40);
        pay.addActionListener(this);

        back=new JButton("Back");
        back.addActionListener(this);
        back.setBounds(200, 410, 80, 40);
        back.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        back.addActionListener(this);
        add(back);


        JPanel panel = new JPanel();
        panel.add(pay);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Paytm();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pay){
            String url = "https://paytm.com";
            try {
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            } catch (java.io.IOException ae) {
                JOptionPane.showMessageDialog(this, "Error opening web browser: " + ae.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            setVisible(false);
        }else {
            new Payment();
            setVisible(false);
        }
    }
}
