package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_connection {
	
	public Connection getConnection() throws SQLException , ClassNotFoundException{
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","DipakZ123@mnk");
		 
		
		
		
		}catch(Exception e){
			System.out.println(e);
			
		}return con;
		
		
		
		
	}

}
