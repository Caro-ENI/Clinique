package fr.eni.cach.clinique.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.eni.cach.clinique.configuration.Configuration;



public abstract class ConnectionDAO {

	public static Connection getConnection() throws SQLException
	{
		//obtention des id de connection :
		String url=Configuration.getValue("url"); 
		String user=Configuration.getValue("user"); 
		String pwd=Configuration.getValue("password");
		
		//obtention d'une connection
		Connection cnx = DriverManager.getConnection(url, user, pwd);
		return cnx;
	}
	
}
