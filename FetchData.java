package oct13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/yogesh","root","root");
			
			Statement stmt=con.createStatement();
			String sql="select * from Employee";
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+"\t"+
								rs.getString("name")+"\t"+
								rs.getFloat("salary"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
