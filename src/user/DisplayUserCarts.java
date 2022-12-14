package user;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import admin.*;

public class DisplayUserCarts {

	public void getcartList() throws SQLException
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Your UserName:");
		String userName=scanner.next();

		System.out.println("        ======================================Your Carts======================================");

		//orders list
		List<Carts> carts=new ArrayList<>();
		Connection con=null;
		PreparedStatement ps=null;
		try {
		
			Db_connection db_Connection=new Db_connection();
		   	con=db_Connection.getConnection();
			ps=con.prepareStatement("select cid,pid,userName,productName,price,categories from cart where userName=?");
			ps.setString(1, userName);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				carts.add(new Carts(rs.getInt(1),rs.getInt(2),rs.getString(3), rs.getString(4),rs.getInt(5),rs.getString(6)));
			}
			System.out.println(carts);
		}
		catch (Exception e) {
		System.out.println(e.getMessage());	
		}
		
			System.out.println("\n        ==========================================================================================");

}
}

