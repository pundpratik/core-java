package oct13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class InsertRecoredusingps {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your id and name and salary");
			int id= Integer.parseInt(br.readLine());
			String n=br.readLine();
			float sal=Float.parseFloat(br.readLine());
			
		//	System.out.println("record entered3");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/yogesh","root","root");
			
			
			PreparedStatement ps=con.prepareStatement("insert into Employee values (?,?,?)");
			
			
			ps.setInt(1, id);
			ps.setString(2,n);
			ps.setFloat(3,sal);
			
			
			int i=ps.executeUpdate();
			
			if(i==1)
				System.out.println("Record Inserted");
			else
				System.out.println("try again");
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
