package JDBCPrograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlDemo {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","rps@123");
        Statement stmt=con.createStatement();
        
        String s="select empno,empname,salary from employee";
        
        ResultSet rs=stmt.executeQuery(s);
        while(rs.next()) {
        	int eno=rs.getInt("empno");
        	String ename=rs.getString("empname");
        	float salary=rs.getFloat("salary");
        	
        	System.out.println(eno+"    "+ename+"   "+salary);
        }
        
        
     /*  String insert="insert into employee values(7,'Sravya',56000,'Chennai');";
        stmt.execute(insert);
        
        String selectall="select ename from employee;";
        stmt.execute(selectall);
     */
	}

}
