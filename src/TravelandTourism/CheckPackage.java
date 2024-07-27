package TravelandTourism;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {

    CheckPackage(){
        setBounds(350,100,850,550);
        String[] package1 = new String[]{"package1.jpg","GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only", "package1.jpg"};
        String[] package2 = new String[]{"package2.jpg","SILVER PACKAGE","4 days and 3 Nights", "Toll Free & Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only", "package2.jpg"};
        String[] package3 = new String[]{"package3.jpg","BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing & Horse Riding", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only", "package3.jpg"};

        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1",null,p1);

        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2",null,p2);

        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3",null,p3);
        add(tab);

        setVisible(true);
    }

public JPanel createPackage(String[] pack){
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBackground(new Color(255, 230, 230));


    JLabel l1 = new JLabel(pack[1]);
    l1.setBounds(50,5,300,30);
    l1.setForeground(new Color(255,207,64));
    l1.setFont(new Font("Times New Roman",Font.BOLD,30));
    p1.add(l1);

    JLabel l2 = new JLabel(pack[2]);
    l2.setBounds(30,60,300,30);
    l2.setForeground(Color.BLACK);
    l2.setFont(new Font("Times New Roman",Font.BOLD,25));
    p1.add(l2);

    JLabel l3 = new JLabel(pack[3]);
    l3.setBounds(30,110,400,30);
    l3.setForeground(Color.BLUE);
    l3.setFont(new Font("Times New Roman",Font.BOLD,25));
    p1.add(l3);

    JLabel l4 = new JLabel(pack[4]);
    l4.setBounds(30,160,400,30);
    l4.setForeground(Color.BLACK);
    l4.setFont(new Font("Times New Roman",Font.BOLD,25));
    p1.add(l4);

    JLabel l5 = new JLabel(pack[5]);
    l5.setBounds(30,210,400,30);
    l5.setForeground(Color.BLUE);
    l5.setFont(new Font("Times New Roman",Font.BOLD,25));
    p1.add(l5);

    JLabel l6 = new JLabel(pack[6]);
    l6.setBounds(30,260,400,30);
    l6.setForeground(Color.BLACK);
    l6.setFont(new Font("Times New Roman",Font.BOLD,25));
    p1.add(l6);

    JLabel l7 = new JLabel(pack[7]);
    l7.setBounds(30,310,400,30);
    l7.setForeground(Color.BLUE);
    l7.setFont(new Font("Times New Roman",Font.BOLD,25));
    p1.add(l7);

    JLabel l8 = new JLabel(pack[8]);
    l8.setBounds(30,360,400,30);
    l8.setForeground(Color.BLACK);
    l8.setFont(new Font("Times New Roman",Font.BOLD,25));
    p1.add(l8);

    JLabel l9 = new JLabel(pack[9]);
    l9.setBounds(30,430,400,30);
    l9.setForeground(Color.GRAY);
    l9.setFont(new Font("Times New Roman",Font.BOLD,25));
    p1.add(l9);

//    JLabel l10 = new JLabel(pack[10]);
//    l10.setBounds(180,480,300,30);
//    l10.setForeground(Color.MAGENTA);
//    l10.setFont(new Font("Times New Roman",Font.BOLD,25));
//    add(l10);

    JLabel l10 = new JLabel(pack[10]);
    l10.setBounds(500, 400, 300, 30);
    l10.setForeground(Color.MAGENTA);
    l10.setFont(new Font("Times New Roman", Font.BOLD, 25));
    p1.add(l10);

    JLabel l11 = new JLabel(pack[11]);
    l11.setBounds(500,360,300,30);
    l11.setForeground(Color.RED);
    l11.setFont(new Font("Times New Roman",Font.BOLD,25));
    p1.add(l11);



    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[0]));
    Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(400,20,400,300);
    p1.add(image);

    return p1;
}

    public static void main(String[] args) {
        new CheckPackage();
    }
}
