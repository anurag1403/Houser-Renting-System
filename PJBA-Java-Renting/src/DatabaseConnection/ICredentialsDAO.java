package DatabaseConnection;

public interface ICredentialsDAO {
	public boolean insertCredentials(Credentials credentials);
	public Credentials getCredentials(String username);
	
}
