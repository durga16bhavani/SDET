package JDBCPrograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoTable {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","rps@123");
        Statement stmt=con.createStatement();
        
       /*
		String insert="insert into registration values(3,'Meena',22,'Chennai'),"
				+ "(4,'Radha',21,'Hyderabad');";
        stmt.execute(insert);*/
        
        /*
        String update="Update registration set id=2 where name='Sravya'; ";
        stmt.execute(update);*/
        
        /*
        String delete="delete from registration where id=4;";
        stmt.execute(delete);*/
        
        /*
        String rename="alter table registration rename column id to empId;";
        stmt.execute(rename);*/
        
        /*
        ResultSet rs=stmt.executeQuery("show tables");
        while(rs.next()) {
        	
        	String tableName=rs.getString(1);
            System.out.println(tableName);
        }*/
        
        //join
        
        String join="select e.empno,e.empname,d.dept_name from employee e join departments d on e.dept_id=d.dept_id";
        ResultSet rs=stmt.executeQuery(join);
        while (rs.next()) {
        	int empid=rs.getInt("empno");
        	String empname=rs.getString("empname");
        	String deptname=rs.getString("dept_name");
        	System.out.println(empid+"   "+empname+"   "+deptname);
        }
	}

}
