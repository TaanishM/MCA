package jdbcconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemo{
   public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/patient","root","system");
		
		if(con==null) {
			System.out.println("not coonected");
		}
		else {
			System.out.println("connected");
		}
		
		PreparedStatement st=con.prepareStatement
				("insert into patient_record(name,age) values(?,?)");
		st.setString(1, "sangam");
		st.setInt(2, 25);
		
		int affect=st.executeUpdate();
		System.out.println("affected rows are:"+affect);
		
	}
   }