package JDBCPrograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatementDemo  {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","rps@123");
        Statement stmt=con.createStatement();
        
        String sel="Select * from employee where empno=? and empname=?";
        String update="Update employee set empname=? where empno=?";
        //Prepared statement
        /*
        PreparedStatement pstmt=con.prepareStatement(sel);
        pstmt.setString(2,"bhavya");
        pstmt.setInt(1, 2);*/
        
        PreparedStatement pstmt=con.prepareStatement(update);
        pstmt.setString(1,"Raju");
        pstmt.setInt(2, 5);
        
        int rs=pstmt.executeUpdate();
        
        System.out.println(rs+"record updated");
        
        /*
        while(rs.next()) {
        	int id=rs.getInt("empno");
        	String name=rs.getString("empname");
        	String city=rs.getString("address");
        	
        	System.out.println(id+"    "+name+"    "+city);
        }*/
	}
}