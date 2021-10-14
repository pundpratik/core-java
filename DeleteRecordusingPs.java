package oct13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecordusingPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter id which you want to delete the record ");
			
			int id=Integer.parseInt(br.readLine());
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost/yogesh","root","root");
			
			PreparedStatement ps =con.prepareStatement("delete from Employee where id =?");
			ps.setInt(1, id);
		
			int i= ps.executeUpdate();
			if(i==1)
				System.out.println("Record delete sucesfully");
			else
				System.out.println("try agian");
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
