	package vn.edu.vnuk.contacts.sql;

import java.sql.Connection;
import java.sql.SQLException;

import vn.edu.vnuk.contacts.ConnectionFactory;

public class Sql0000RunAllQueries {

	public static void main(String[] args) throws SQLException {
		
		Connection connectionDb = new ConnectionFactory()
				.getConnection("jdbc:mysql://localhost/");
		
		// Create database
		
		new Sql1000DropDatabase(connectionDb).run();
		new Sql1010CreateDatabase(connectionDb).run();

		connectionDb.close();
		
		//Create tables 
		
		Connection connectionTable = new ConnectionFactory()
				.getConnection("jdbc:mysql://localhost/vnuk_contacts");
		
	
		new Sql2050CreateContacts(connectionTable).run();
		
		//Insert data into tables
		
		new Sql5250InsertIntoContacts(connectionTable).run();
		connectionTable.close();
		
	}

}
