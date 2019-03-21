package vn.edu.vnuk.contacts.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class Sql2050CreateContacts {
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql2050CreateContacts(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "CREATE TABLE IF NOT EXISTS contacts ("
				+ 	"id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
				+ 	"name VARCHAR(255) NOT NULL,"
				+ 	"email VARCHAR(255) NOT NULL,"
				+ 	"address VARCHAR(255) NOT NULL,"
				+ 	"date_of_register DATE NOT NULL"
				+ ");"
			;
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql2050CreateContacts started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   TABLE \'contacts\' successfully created");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql2050CreateContacts ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
