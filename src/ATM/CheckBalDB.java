package ATM;

import java.sql.*;

public class CheckBalDB {

private static String url = "jdbc:mysql://localhost:3306/ATM";
private static String uname = "root";
private static String pass = "password";
private static String query;

public String savbal() {
	try {
		
		query = "SELECT SAVINGSBAL FROM ACCOUNT WHERE ACC_NO = " + login.accno; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		
		String  bal = "";
		while (result.next())
		
			for(int i = 1; i <= 1; i++)
				bal = result.getString(i);
			return bal;
	}
	catch(Exception e) {
		e.printStackTrace();
		return null;
	}
}

public String curbal() {
	try {
		
		query = "SELECT CURRENTBAL FROM ACCOUNT WHERE ACC_NO = " + login.accno; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		
		String  p = "";
		while (result.next())
		
			for(int i = 1; i <= 1; i++)
				p = result.getString(i);
			return p;
	}
	catch(Exception e) {
		e.printStackTrace();
		return null;
	}
  }
}


