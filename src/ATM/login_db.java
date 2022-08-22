package ATM;

import java.sql.*;

public class login_db {
private static String url = "jdbc:mysql://localhost:3306/BANK";
private static String uname = " ";
private static String pass = "password";

public static void check() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement statement = con.createStatement();
		Resultset result = statement.executeQuery(query);
		
		while (result.next())
		{
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
