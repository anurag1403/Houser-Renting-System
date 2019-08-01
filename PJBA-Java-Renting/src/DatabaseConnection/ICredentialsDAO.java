package DatabaseConnection;

import java.util.List;

import Information.Credentials;
import Information.HouseInformation;
import Information.OwnerInformation;

public interface ICredentialsDAO {
	public void insertCredentials(Credentials credentials);
	public String getCredentials(String username);
	public void insertOwnerDetails(OwnerInformation ownerInformation);
	public OwnerInformation getOwnerDetails(String username);
	public void insertHouseDetails(HouseInformation house);
	public HouseInformation getHouseDetails(String address);
	public List<HouseInformation> getAllHouseDetailsOfParticulaOwner(int owner_id);
	public int getOnwerIDFromHouse(String username);
}
