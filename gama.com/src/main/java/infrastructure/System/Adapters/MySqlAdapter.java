package infrastructure.System.Adapters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import common.System.configuration.AppPropertiesConfig;

import java.io.IOException;
import java.sql.*;

public class MySqlAdapter {
	 public static Connection connectDatabase() throws IOException {
	        String url = null;
	        Connection connection = null;
	        try {
	        	AppPropertiesConfig AppPropertiesConfig= new AppPropertiesConfig();
	        	String host=AppPropertiesConfig.getPropValues("host");
	        	String port=AppPropertiesConfig.getPropValues("port");
	        	String database=AppPropertiesConfig.getPropValues("database");
	        	String user=AppPropertiesConfig.getPropValues("user");
	        	String password=AppPropertiesConfig.getPropValues("password");
	        	
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	            } catch (ClassNotFoundException ex) {
	                System.out.println("Error al registrar el driver de MySQL: " + ex);
	            }
	          
	            url ="jdbc:mysql://" + host + ":" + port + "/" + database;
	            // Database connect
	            // Conectamos con la base de datos
	            connection = DriverManager.getConnection(
	                    url,
	                    user, password);           
	            boolean valid = connection.isValid(50000);
	            System.out.println(valid ? "TEST OK" : "TEST FAIL");
	        } catch (java.sql.SQLException sqle) {
	            System.out.println("Error al conectar con la base de datos de MySQL (" + url + "): " + sqle);
	        }
			return connection;
	    }       
	}


