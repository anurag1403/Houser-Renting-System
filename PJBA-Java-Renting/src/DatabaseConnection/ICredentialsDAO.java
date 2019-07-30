package DatabaseConnection;

import java.util.List;

import Information.Credentials;
import Information.HouseInformation;
import Information.OwnerInformation;

public interface ICredentialsDAO {
	public boolean insertCredentials(Credentials credentials);
	public String getCredentials(String username);
	public boolean insertOwnerDetails(OwnerInformation ownerInformation, String username);
	public OwnerInformation getOwnerDetails(String username);
	public boolean insertHouseDetails(HouseInformation house, int owner_id);
	public HouseInformation getHouseDetails(String address);
	public List<HouseInformation> getAllHouseDetailsOfParticulaOwner(int owner_id);
	public int getOnwerIDFromHouse(String username);
}
