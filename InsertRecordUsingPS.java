package oct13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecordUsingPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driverloaded");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the name and salary of employee");
		String n=br.readLine();
		float sal=Float.parseFloat(br.readLine());
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/yogesh","root","root");
		
		Statement stmt=con.createStatement();
		String sql="insert into Employee values(2,'"+n+"',"+sal+")";
		
		int i=stmt.executeUpdate(sql);
		if(i==1)
			System.out.println("record is inserted");
		else
			System.out.println("try again");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
