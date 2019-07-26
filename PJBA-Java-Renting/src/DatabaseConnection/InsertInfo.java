package DatabaseConnection;

public class InsertInfo {
	public static void main(String[] args) {
		Credentials credentials = new Credentials("anurag", "password");
		ICredentialsDAO dao = new CredentialsDAO();
		//System.out.println(dao.insertCredentials(credentials)?"Inserted":"Not inserted");
		//Credentials credentials2 = new Credentials();
		//credentials2 = dao.getCredentials("anurag");
		//System.out.println(credentials2.getPassword());
	}
}
