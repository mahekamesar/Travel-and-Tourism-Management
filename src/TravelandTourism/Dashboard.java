package TravelandTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetails,about,deletePersonalDetails, viewbookedHotel, ratings, bookHotels, payment, notepad, calculator, destinations, viewHotels,  viewPackage, viewPersonalDetails, updatePersonalDetails, checkPackages, bookPackage;

    Dashboard(String username) {
        this.username = username;
        // setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH); //full screen pr open hoga
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.cyan);
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("DashBoard");
        heading.setBounds(80, 20, 300, 40);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 30));
        p1.add(heading);

        JLabel text = new JLabel("Travel and Tourism Application By Mahek");
        text.setBounds(400, 0, 1000, 50);
        text.setFont(new Font("Times New Roman", Font.BOLD, 50));
        p1.add(text);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.lightGray);
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 40);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 40, 300, 40);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 80, 300, 40);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 120, 300, 40);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

        checkPackages = new JButton("Check Packages");
        checkPackages.setBounds(0, 160, 300, 40);
        checkPackages.setBackground(new Color(0, 0, 102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        checkPackages.setMargin(new Insets(0, 0, 0, 100));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);

        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(0, 200, 300, 40);
        bookPackage.setBackground(new Color(0, 0, 102));
        bookPackage.setForeground(Color.WHITE);
        bookPackage.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        bookPackage.setMargin(new Insets(0, 0, 0, 115));
        bookPackage.addActionListener(this);
        p2.add(bookPackage);

        viewPackage = new JButton("View Package");
        viewPackage.setBounds(0, 240, 300, 40);
        viewPackage.setBackground(new Color(0, 0, 102));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        viewPackage.setMargin(new Insets(0, 0, 0, 115));
        viewPackage.addActionListener(this);
        p2.add(viewPackage);

        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 280, 300, 40);
        viewHotels.setBackground(new Color(0, 0, 102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        viewHotels.setMargin(new Insets(0, 0, 0, 125));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);

        bookHotels = new JButton("Book Hotel");
        bookHotels.setBounds(0, 320, 300, 40);
        bookHotels.setBackground(new Color(0, 0, 102));
        bookHotels.setForeground(Color.WHITE);
        bookHotels.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        bookHotels.setMargin(new Insets(0, 0, 0, 125));
        bookHotels.addActionListener(this);
        p2.add(bookHotels);

        viewbookedHotel = new JButton("View Booked Hotel");
        viewbookedHotel.setBounds(0, 360, 300, 40);
        viewbookedHotel.setBackground(new Color(0, 0, 102));
        viewbookedHotel.setForeground(Color.WHITE);
        viewbookedHotel.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        viewbookedHotel.setMargin(new Insets(0, 0, 0, 70));
        viewbookedHotel.addActionListener(this);
        p2.add(viewbookedHotel);

        destinations = new JButton("Destinations");
        destinations.setBounds(0, 400, 300, 40);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        destinations.addActionListener(this);
        p2.add(destinations);

        payment = new JButton("Payment");
        payment.setBounds(0, 440, 300, 40);
        payment.setBackground(new Color(0, 0, 102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        payment.setMargin(new Insets(0, 0, 0, 150));
        payment.addActionListener(this);
        p2.add(payment);

        calculator = new JButton("Calculator");
        calculator.setBounds(0, 480, 300, 40);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        calculator.setMargin(new Insets(0, 0, 0, 135));
        calculator.addActionListener(this);
        p2.add(calculator);

        notepad = new JButton("Notepad");
        notepad.setBounds(0, 520, 300, 40);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        notepad.setMargin(new Insets(0, 0, 0, 150));
        notepad.addActionListener(this);
        p2.add(notepad);

        ratings = new JButton("Ratings & Reviews");
        ratings.setBounds(0, 560, 300, 40);
        ratings.setBackground(new Color(0, 0, 102));
        ratings.setForeground(Color.WHITE);
        ratings.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        ratings.setMargin(new Insets(0, 0, 0, 70));
        ratings.addActionListener(this);
        p2.add(ratings);

        about = new JButton("About");
        about.setBounds(0, 600, 300, 40);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        about.setMargin(new Insets(0, 0, 0, 170));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1500, 1000);
        add(image);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource()==checkPackages) {
            new CheckPackage();
        } else if (ae.getSource()==bookPackage) {
            new BookPackage(username);
        } else if (ae.getSource()==viewPackage) {
            new ViewPackage(username);
        } else if (ae.getSource()==viewHotels) {
            new CheckHotels();
        } else if (ae.getSource()==destinations) {
            new Destination();
        } else if (ae.getSource()==calculator) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
            
        } else if (ae.getSource() == payment) {
            new Payment();
        } else if (ae.getSource()==notepad) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource()==ratings) {
            new Ratings_Reviews();
        } else if (ae.getSource()==bookHotels) {
            new BookHotel(username);
        } else if (ae.getSource()==about) {
            new About();
        } else if (ae.getSource()==viewbookedHotel) {
            System.out.println("Opening ViewBookedHotel for user: " + username);
            try {
                new ViewBookedHotel(username);
                System.out.println("ViewBookedHotel opened successfully.");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Failed to open ViewBookedHotel.");
            }
        } else if (ae.getSource()==deletePersonalDetails) {
            new DeleteDetails(username);
        }
    }
}
