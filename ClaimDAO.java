package Assignments.Day4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ClaimDAO {
    public void saveClaim(Claim claim,LocalDate submissionDate)throws SQLException{
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","rps@123");
    	String insert="INSERT INTO Claims (id,amount,type,SubmissionDate)VALUES(?,?,?,?)";
    	PreparedStatement stmt=con.prepareStatement(insert);
    	stmt.setInt(1, claim.getId());
    	stmt.setDouble(2, claim.getAmount());
    	stmt.setString(3, claim.getType());
    	stmt.setDate(4, Date.valueOf(submissionDate));
    	stmt.executeUpdate();
    }
    
     public Claim getClaim(int id) throws SQLException{
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","rps@123");
	     String select="Select * from Claims where id=?";
	     PreparedStatement stmt=con.prepareStatement(select);
	     stmt.setInt(1, id);
	     ResultSet rs=stmt.executeQuery();
	     if(rs.next()) {
	    	 int claimId=rs.getInt("id");
	    	 double amount=rs.getDouble("amount");
	    	 String type=rs.getString("type");
	    	 return new HealthClaim(claimId,amount);
	     }
         return null;
     }
}
