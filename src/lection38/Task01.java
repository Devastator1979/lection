package lection38;

import static java.lang.System.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task01 {

    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/mycustomer?zeroDateTimeBehavior=convertToNull";
        //String url = "jdbc:derby://localhost:3306/mycustomer";
        String user = "root";
        String pwd = "admin";
        try {
            Connection conn = DriverManager.getConnection(url, user, pwd);
            String query = "SELECT * FROM customer WHERE FirstName = ?";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(query);
            stmt.setString(1, "Pavel");
//            String q = "INSERT INTO customer (CustomerID, FirstName, LastName, EMail,Phone) VALUES (4,'xxxx','yyyy' ,'zzzz','ttttt')";
//            int numRows = stmt.executeUpdate(q);
//            System.out.println(numRows);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                out.print(rs.getInt("CustomerID") + " ");
                out.print(rs.getString("FirstName") + " ");
                out.print(rs.getString("LastName") + " ");
                out.print(rs.getString("EMail") + " ");
                out.println(rs.getString("Phone"));
            }
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
}
