package TravelandTourism;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn(){
        //5 steps to connect jdbc:
        //1 ) registering  the driver
        //2)Creating the connection string
        //3) creating the statement
        //4) execute mysql queries
        //5) Closing connections - optional


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem","root","123456789"); //database details
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
