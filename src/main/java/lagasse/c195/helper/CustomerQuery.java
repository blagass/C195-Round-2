package lagasse.c195.helper;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class CustomerQuery {
    public static int insert(String customerName,int divisionId) throws SQLException {
        String sql = "INSERT INTO CUSTOMERS(Customer_Name,Division_ID) VALUES(?,?)";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ps.setString(1,customerName);
        ps.setInt(2,divisionId);
        int rowsAffected = ps.executeUpdate();
        return rowsAffected;
    }



}
