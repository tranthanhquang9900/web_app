package vn.edu.vnuk.contacts.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class Sql1010CreateDatabase {
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql1010CreateDatabase(Connection connection) {
		this.connection = connection;
		this.sqlQuery = "CREATE DATABASE IF NOT EXISTS vnuk_contacts;";
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql1010CreateDatabase started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DB \'vnuk_contacts\' successfully created");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql1010CreateDatabase ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
