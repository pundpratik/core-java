package oct13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Deleteecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//driver load
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("enter the emloyee which you want to delete");
			int id=Integer.parseInt(br.readLine());
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/yogesh","root","root");
			
			Statement stmt=con.createStatement();
			String sql="delete from Employee where id="+id+"";
			
			int i=stmt.executeUpdate(sql);
			if(i==1)
				System.out.println("record deleted");
			else
				System.out.println("try again");
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
