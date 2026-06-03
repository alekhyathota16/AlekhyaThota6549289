package JDBCdemo;

import java.sql.*;

public class TransactionDemo {

    public static void main(String[] args) throws Exception {

        Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:33061/test",
            "root",
            "Ammu@1611"
        );
        con.setAutoCommit(false);
        try {
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE accounts SET balance = balance - 500 WHERE id=1");
            st.executeUpdate("UPDATE accounts SET balance = balance + 500 WHERE id=2");
            con.commit();
            System.out.println("Transfer Success");
        }
        catch(Exception e) {
            con.rollback();
        }
    }
}

