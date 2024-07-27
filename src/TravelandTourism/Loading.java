package TravelandTourism;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {
Thread t;
JProgressBar bar;
    String username;

public void run(){

    try{
        for(int i=1;i<=101;i++){
            int max= bar.getMaximum(); //100
            int value = bar.getValue();

            if(value <max){
                bar.setValue(bar.getValue() + 1);
            }else{
                setVisible(false);
                //new class object
                new Dashboard(username);
            }
            Thread.sleep(50);
        }
    }catch (Exception e){
        e.printStackTrace();
    }

}
    Loading(String username){
    this.username=username;
    t = new Thread(this);
        setBounds(500,200,650,400);
        setLocation(450,200);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Travel and Tourism Application ");
        text.setBounds(10,20,700,40);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Algerian",Font.BOLD,35));
        add(text);

        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading = new JLabel("Loading Please Wait .. ");
        loading.setBounds(210,130,700,40);
        loading.setForeground(Color.RED);
        loading.setFont(new Font("Times New Roman",Font.ITALIC,15));
        add(loading);

        JLabel lblusername = new JLabel("Welcome "+username);
        lblusername.setBounds(20,300,700,40);
        lblusername.setForeground(Color.BLACK);
        lblusername.setFont(new Font("Times New Roman",Font.ITALIC,30));
        add(lblusername);




        t.start();
        setVisible(true);

    }
    public static void main(String[] args) {
       new Loading(" ");

    }
}
