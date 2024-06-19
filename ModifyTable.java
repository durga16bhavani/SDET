package JDBCPrograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModifyTable {

	public static void main(String[] args)  throws SQLException{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","rps@123");
        Statement stmt=con.createStatement();
        
        String modify="alter table registration add column city varchar(20);";
        
        stmt.executeUpdate(modify);
        
		

	}

}
