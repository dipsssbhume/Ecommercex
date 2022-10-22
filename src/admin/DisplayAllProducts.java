package admin;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;


	
	public class DisplayAllProducts {
		
		public void getProductList() throws SQLException
		{     Scanner sc=new Scanner(System.in);
			System.out.println("        ======================================All Categories======================================");
		
			//mobiles list
			List<Products> mobiles=new ArrayList<>();
			Connection con=null;
			PreparedStatement ps=null;
			try {
				Db_connection db_Connection=new Db_connection();
			   	con=db_Connection.getConnection();
				ps=con.prepareStatement("select * from product where  categories=?");
				ps.setString(1, "mobiles");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					mobiles.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5)));
				}
				System.out.println("\n\t\t\t\t             ****Mobiles****");
				System.out.print("\t\t\t\t             ---------------");
				System.out.println("\t\t\t\t"+mobiles );
			}
			catch (Exception e) {
			System.out.println(e.getMessage());	
			}
			
			
			//sports lists
			List<Products> sports=new ArrayList<>();
			
			try {
				Db_connection db_Connection=new Db_connection();
				con=db_Connection.getConnection();
				ps=con.prepareStatement("select * from product where  categories=? ");
				ps.setString(1, "sports");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					sports.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5)));
				}
				System.out.println("\n\t\t\t\t             ****Sports****");
				System.out.print("\t\t\t\t             ---------------");
				System.out.println("\t\t\t\t"+sports );
			}
			catch (Exception e) {
			System.out.println(e.getMessage());	
			}
			//Electronics list
			List<Products> electronics=new ArrayList<>();
			Connection con1=null;
			PreparedStatement ps1=null;
			try {
				Db_connection db_Connection=new Db_connection();
			   	con1=db_Connection.getConnection();
				ps1=con.prepareStatement("select * from product where  categories=?");
				ps1.setString(1, "mobiles");
				ResultSet rs=ps1.executeQuery();
				while(rs.next())
				{
					electronics.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5)));
				}
				System.out.println("\n\t\t\t\t             ****Electronics****");
				System.out.print("\t\t\t\t             ---------------");
				System.out.println("\t\t\t\t"+mobiles );
			}
			catch (Exception e) {
			System.out.println(e.getMessage());	
			}
			
			
			//grocery list
			List<Products> grocery=new ArrayList<>();
			Connection con2=null;
			PreparedStatement ps2=null;
			try {
				Db_connection db_Connection=new Db_connection();
			   	con2=db_Connection.getConnection();
				ps2=con.prepareStatement("select * from product where  categories=?");
				ps2.setString(1, "grocery");
				ResultSet rs=ps2.executeQuery();
				while(rs.next())
				{
					electronics.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5)));
				}
				System.out.println("\n\t\t\t\t             ****grocery****");
				System.out.print("\t\t\t\t             ---------------");
				System.out.println("\t\t\t\t"+mobiles );
			}
			catch (Exception e) {
			System.out.println(e.getMessage());	
			}
			
			
			
			
			//furniture list
			List<Products> furniture=new ArrayList<>();
			try {
				Db_connection db_Connection=new Db_connection();
				con=db_Connection.getConnection();
				ps=con.prepareStatement("select * from product where  categories=?");
				ps.setString(1, "furniture");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					furniture.add(new Products(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4),rs.getInt(5)));
				}
				System.out.println("\n\t\t\t\t             ****Furnitures****");
				System.out.print("\t\t\t\t             ------------------");
				System.out.println("\t\t\t\t"+furniture );
			}
			
			catch (Exception e) {
			System.out.println(e.getMessage());	
			}

			System.out.println("\n        ==========================================================================================");

				
		}
		
	}



