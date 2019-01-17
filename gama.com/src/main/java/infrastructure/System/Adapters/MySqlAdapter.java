package infrastructure.System.Adapters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class MySqlAdapter {
	 public static void connectDatabase(String host, String port, String database,
	            String user, String password) {
	        String url = null;
	        try {
	          
	        	//JavaMySQLBasic javaMySQLBasic = new JavaMySQLBasic();
	            //javaMySQLBasic.connectDatabase();
	            //javaMySQLBasic.connectDatabase("localhost.localdomain", "3306", "Gamachicas","root", "1988deza");
	        	
	        	
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	            } catch (ClassNotFoundException ex) {
	                System.out.println("Error al registrar el driver de MySQL: " + ex);
	            }
	            Connection connection = null;
	            url ="jdbc:mysql://" + host + ":" + port + "/" + database;
	            // Database connect
	            // Conectamos con la base de datos
	            connection = DriverManager.getConnection(
	                    url,
	                    user, password);           
	            boolean valid = connection.isValid(50000);
	            //System.out.println(valid ? "TEST OK" : "TEST FAIL");
	        } catch (java.sql.SQLException sqle) {
	            System.out.println("Error al conectar con la base de datos de MySQL (" + url + "): " + sqle);
	        }
	    }       
	}


