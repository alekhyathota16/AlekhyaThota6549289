package JDBCdemo;
import java.sql.*;
public class StudentDAO {
    Connection con;
    StudentDAO() throws Exception {
        con = DriverManager.getConnection(
           "jdbc:mysql://localhost:33061/test",
            "root",
            "Ammu@1611"
        );
    }
    void insertStudent(int id, String name) throws Exception {
        PreparedStatement ps =con.prepareStatement("INSERT INTO students VALUES (?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
    }
}
