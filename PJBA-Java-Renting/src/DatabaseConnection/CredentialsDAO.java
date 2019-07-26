package DatabaseConnection;

import java.sql.SQLException;


public class CredentialsDAO implements ICredentialsDAO{

	@Override
	public boolean insertCredentials(Credentials credentials) {
		try {
			String sql = "insert into credentials values(?,?)";
			GetConnection gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setString(1, credentials.getUsername());
			gc.ps.setString(2, credentials.getPassword());
			return gc.ps.executeUpdate() > 0 ;
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Credentials getCredentials(String username) {
		String sql = "select password from credentials where username = ?";
		GetConnection gc = null;
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setString(1, username);
			gc.rs = gc.ps.executeQuery();
			String password = gc.rs.getString("username");
			Credentials credentials = new Credentials();
			credentials.setUsername(username);
			credentials.setPassword(password);
			return credentials;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
