package JDBCPrograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try(
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","rps@123");
	        Statement stmt=con.createStatement();
			){
			String createtable="create table registration (id int primary key not null,name varchar(25),age int);";
			stmt.executeUpdate(createtable);
			System.out.println("Created table successfully.");
		    String desc="select * from registration;";
		    stmt.execute(desc);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	       	
		
	}

}
