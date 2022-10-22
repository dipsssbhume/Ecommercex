package user;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import admin.*;


public class DisplayAllOrders {

	
	public void getOrderList() throws SQLException
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Your UserName:");
		String userName=scanner.next();
		
		System.out.println("        ======================================Your Orders======================================");
		
		//orders list
		List<Order> order=new ArrayList<>();
		Connection con=null;
		PreparedStatement ps=null;
		try {
		
			Db_connection db_Connection=new Db_connection();
		   	con=db_Connection.getConnection();
			ps=con.prepareStatement("select oid,pid,user.userName,quantity,price,totalPrice,cityName,phoneNo from ecommerce.user inner join ecommerce.order on ecommerce.user.userName = ecommerce.order.userName where user.userName=?");
			ps.setString(1, userName);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				order.add(new Order(rs.getInt(1),rs.getInt(2),rs.getString(3), rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8)));
			}
			System.out.println(order);
		}
		catch (Exception e) {
		System.out.println(e.getMessage());	
		}
		
			System.out.println("\n        ==========================================================================================");

}
}

