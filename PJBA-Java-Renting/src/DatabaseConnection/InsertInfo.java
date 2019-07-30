package DatabaseConnection;

//import java.util.ArrayList;
//import java.util.List;

import Information.Credentials;
//import Information.HouseInformation;
//import Information.OwnerInformation;
//import Information.RoomType;

public class InsertInfo {
	public static void main(String[] args) {
		Credentials credentials = new Credentials("anurag", "password");
		ICredentialsDAO dao = new CredentialsDAO();
		//System.out.println(dao.insertCredentials(credentials)?"Inserted":"Not inserted");
		//System.out.println(dao.getCredentials("anurag"));
		//OwnerInformation owner = new OwnerInformation("anuragkol", "anu@gmail.com", "Brookefield", "7894561237", "Marathalli", "1234546789");
		//System.out.println(dao.insertOwnerDetails(owner, credentials.getUsername())?"Inserted":"Not inserted");
		//OwnerInformation owner = new OwnerInformation();
		//System.out.println(dao.getOwnerDetails("anurag").getAddress());
		//HouseInformation house = new HouseInformation("Heritage", "Marathalli", true, true, false, "BHK2", 30000, false);
		//System.out.println(dao.insertHouseDetails(house, 1)?"Inserted":"Not inserted");
		//HouseInformation house2 = new HouseInformation();
		//System.out.println(dao.getHouseDetails("Marathalli").isBroker());
		//System.out.println(dao.getAllHouseDetailsOfParticulaOwner(1).get(1).getHouseName());
		//System.out.println(dao.getOnwerIDFromHouse("anurag"));
		
	}
}
