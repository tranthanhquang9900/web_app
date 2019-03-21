package vn.edu.vnuk.contacts.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sql5250InsertIntoContacts {
	
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql5250InsertIntoContacts(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "INSERT INTO contacts (name, email, address, date_of_register) "
				+ 	"values "
				
				+ 	"('Diamond', 'asd', 'asd', '2019-11-2'), "
				+ 	"('Diamond', 'asd', 'asd', '2019-11-2') "
				+ ";"
			;
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql5250InsertIntoContacts started");
		
		try {
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.execute();
			statement.close();
	        System.out.println("   DATA successfully loaded in \'contacts\'");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql5250InsertIntoContacts ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
