package ATM;

import java.sql.*;

public class login_db {
private static String url = "jdbc:mysql://localhost:3306/BANK";
private static String uname = "root";
private static String pass = "password";
private static String query;

public int auth(String accno, String passwd) {
	try {
	
		query = "SELECT PASS FROM USER WHERE ACC_NO = " + accno; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		
		String  p = "";
		while (result.next())
		{
		
			for(int i = 1; i <= 1; i++)
			{
				p = result.getString(i);
				
			}
		}
		System.out.println(p);
		if (p.equals(passwd))
		{
			return 1;
			
		}
		else 
		{
			
			return 0;
	}
	}
	
	catch(Exception e) {
		e.printStackTrace();
		return 0;
	}
}
}
