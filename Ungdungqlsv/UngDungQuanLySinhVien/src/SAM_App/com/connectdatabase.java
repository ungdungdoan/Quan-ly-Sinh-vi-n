package SAM_App.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectdatabase {
	
	public static Connection Connect() {
		
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1234;databasename = QLSV";
			con = DriverManager.getConnection(url,"sa","thinhbum");
			System.out.println("Database connection was successful");
			return con; 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void disconnect(Connection con) {
				
		try {
			if(con!=null)
				con.close();
			System.out.println("Database connection was cloesed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	public Connection getconnect() {
		Connect();
		return con;
	}*/
	
	
	
}
