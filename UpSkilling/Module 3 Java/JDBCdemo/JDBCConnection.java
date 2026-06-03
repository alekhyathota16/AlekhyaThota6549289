package JDBCdemo;

import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

           Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:33061/test",
            "root",
            "Ammu@1611"
        );

            System.out.println("Connected Successfully");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}