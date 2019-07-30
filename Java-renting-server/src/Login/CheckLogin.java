package Login;

import java.sql.SQLException;
import java.util.List;

import DatabaseConnection.GetConnection;
import DatabaseConnection.ICredentialsDAO;
import Information.Credentials;
import Information.HouseInformation;
import Information.OwnerInformation;

public class CheckLogin  implements ICredentialsDAO
{ 

	
	public boolean check(String uname,String pass)
	{
		
		try {
	String sql = "select * from  credentials where username = ? and password=?";
	GetConnection gc = new GetConnection();
	gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
	gc.ps.setString(1, uname);
	gc.ps.setString(2, pass);
	gc.rs = gc.ps.executeQuery();
	if(gc.rs.next())
	{
		return true;
	}
	
	
} catch (SQLException e) { 
	e.printStackTrace();

}
		return false;
	}

	@Override
	public boolean insertCredentials(Credentials credentials) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCredentials(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertOwnerDetails(OwnerInformation ownerInformation, String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OwnerInformation getOwnerDetails(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public HouseInformation getHouseDetails(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<HouseInformation> getAllHouseDetailsOfParticulaOwner( String name,String phone_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertHouseDetails(HouseInformation house, String name, String phno_no) {
		// TODO Auto-generated method stub
		return false;
	}
*/
	@Override
	public boolean insertHouseDetails(HouseInformation house, int owner_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HouseInformation> getAllHouseDetailsOfParticulaOwner(int owner_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOnwerIDFromHouse(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}