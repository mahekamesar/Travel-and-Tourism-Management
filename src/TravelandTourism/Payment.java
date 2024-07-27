package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener{
    JButton pay, back;

    public Payment(){

        setLayout(null);
        setBounds(300, 100, 800, 600);

        JLabel label=new JLabel("Pay using Paytm");
        label.setFont(new Font("Times New Roman", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i8 = i7.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0, 150, 800, 600);
        add(l4);

        pay = new JButton("Pay");
        pay.addActionListener(this);
        pay.setBounds(420, 20, 80, 40);
        add(pay);

        back=new JButton("Back");
        back.addActionListener(this);
        back.setBounds(510, 20, 80, 40);
        add(back);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }

    public static void main(String[] args){
        new Payment();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pay){
            new Paytm();
            setVisible(false);

        }else{
            setVisible(false);
        }

    }
}