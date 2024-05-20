package dbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class update {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver Loaded");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/college","root","Vaishnavi18@soni");
	System.out.println("Driver Connected");
	
	String EmpName  = " CHIN YEN";                       
	String  Designation = "LAB ASSISTANT";
	
	PreparedStatement ps = con.prepareStatement("update EmpName=? where  Designation =?");
	ps.setString(1, EmpName);
	ps.setString(2,  Designation);
	
	int count = ps.executeUpdate();
	
	if(count>0) {
		System.out.println("Record Updated Successfully !");
	}
	else {
		System.out.println("Record Updation Failed !");
	}

}

}