package ATM;

import java.sql.*;

public class UpdateDB {

private static String url = "jdbc:mysql://localhost:3306/ATM";
private static String uname = "root";
private static String pass = "password";
private static String query;
private static String query2;

public void deposit(int amt) {
	try {
		
		query = "SELECT CURRENTBAL FROM ACCOUNT WHERE ACC_NO = " + login.accno; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		
		String  res = "";
		while (result.next())
		
			for(int i = 1; i <= 1; i++)
				res = result.getString(i);
		int bal = Integer.parseInt(res);
		bal +=amt;
		query2 = "UPDATE ACCOUNT SET CURRENTBAL = " + bal + " WHERE ACC_NO = " + login.accno;
		statement.execute(query2);
}
	catch(Exception e) {

		e.printStackTrace();
	}
}


public void withdraw(int amt) {
	try {
		
		
		query = "SELECT CURRENTBAL FROM ACCOUNT WHERE ACC_NO = " + login.accno; 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		
		String  res = "";
		while (result.next())
		
			for(int i = 1; i <= 1; i++)
				res = result.getString(i);
		int bal = Integer.parseInt(res);
		bal -=amt;
		query2 = "UPDATE ACCOUNT SET CURRENTBAL = " + bal + " WHERE ACC_NO = " + login.accno;
		statement.execute(query2);
}
	catch(Exception e) {

		e.printStackTrace();
	}
}
}

