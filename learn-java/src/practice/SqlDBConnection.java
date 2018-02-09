package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 Connection conn=null;

		   String url="jdbc:oracle:thin:@db-omsq:1521/omsq";
		   String driver="oracle.jdbc.driver.OracleDriver";
		    // Step 1: Load the JDBC driver.
		   Class.forName(driver);
		    // Step 2: Establish the connection to the database.
		   conn= DriverManager.getConnection(url,"strl_user","anf1892");
		   System.out.println("Connection Succesfull");
	}
}
