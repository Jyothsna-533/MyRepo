package db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Dbcon {
        public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
		    con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens","root","root");  
			System.out.println("conn established");		
		     stmt=(Statement) con.createStatement();  
			System.out.println("statement created");
			String sql = "SELECT * from  cousins";
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		    	  
		         
		         System.out.printf(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		         System.out.println();
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
