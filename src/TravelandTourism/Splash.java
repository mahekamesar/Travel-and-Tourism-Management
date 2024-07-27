package TravelandTourism;

import javax.swing.*; //jframe class is in swing package
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    //multiple inheritance is not allowed in java so we have implemented runnable interface
    Splash(){



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT); //kaisi dikhni chahiye frame mei like scaled image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //Image class ke object ko directly hum JLabel mei nhi daal skte So we have create object of Image icon class

        add(image);

        setVisible(true); //by default it will open from left top
        Thread thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {
        try{
            System.out.println("hello");
            Thread.sleep(7000);
          //  new Login();
            setVisible(false);
        }catch(Exception e){

        }
    }

    public static void main(String[] args) {
        Splash frame = new Splash(); //constructor will be called automatically

        int x=1;
        for(int i=1;i<=500;i++,x+=7){ // zoom in hone ke liye
        frame.setLocation(250,150); //from left side kitni space & from right side too
            //4 sides se open hona chahiye in the middle
            frame.setSize(i*2,i); //takes 2 params length & breadth
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e);
            }

        }
    }
}



