package DatabaseConnection;
import org.apache.log4j.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class GetConnection {
	static Connection connection;
	public ResultSet rs, rs1, rs2;
	public PreparedStatement ps, ps1, ps2;
	public GetConnection() {
	}
	
	public static Connection getMysqlConnection() {
		Logger log = null;
		log = Logger.getLogger(CredentialsDAO.class.getName());		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/house_renting", "root", "mysql");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("Class not found", e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			log.error("Sql exception error", e);			
		}
		return null;
	}
}
