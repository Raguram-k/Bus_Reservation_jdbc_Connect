package Busres;

import java.sql.*;

public class DbConnection {

	
		// TODO Auto-generated method stub
private static final String url="jdbc:mysql://localhost:3306/busresv";
private static final String username="root";
private static final String pass="";

  public static Connection getConnection() throws SQLException{
	   return DriverManager.getConnection(url,username,pass);
   }
		

	}


