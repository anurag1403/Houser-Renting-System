package DatabaseConnection;

import java.security.acl.Owner;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Information.Credentials;
import Information.HouseInformation;
import Information.OwnerInformation;


public class CredentialsDAO implements ICredentialsDAO{

	private org.apache.log4j.Logger log = null;
	public CredentialsDAO() {
		 log = org.apache.log4j.Logger.getLogger(CredentialsDAO.class.getName());
	}
	
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
			//e.printStackTrace();
			log.error("Invalid sql query", e);
		}
		return false;
	}

	@Override
	public String getCredentials(String username) {
		String sql = "select password from credentials where username = ?";
		GetConnection gc = null;
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setString(1, username);
			gc.rs = gc.ps.executeQuery();
			String password = null;
			if(gc.rs.next()) {
				password = gc.rs.getString("password");
			}
			return password;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertOwnerDetails(OwnerInformation owner, String username) {
		String sql = "insert into owner(name,email,address,phone_no,bank_account_no,bank_branch,username) values(?,?,?,?,?,?,?)";
		GetConnection gc = null;
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setString(1, owner.getName());
			gc.ps.setString(2, owner.getEmailId());
			gc.ps.setString(3, owner.getAddress());
			gc.ps.setString(4, owner.getPhoneNo());
			gc.ps.setString(5, owner.getBankAccountNo());
			gc.ps.setString(6, owner.getBankBranch());
			gc.ps.setString(7, username);
			return gc.ps.executeUpdate() > 0 ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public OwnerInformation getOwnerDetails(String username) {
		String sql = "select name, email,address,phone_no,bank_account_no,bank_branch from owner where username = ?";
		GetConnection gc = null;
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setString(1, username);
			gc.rs = gc.ps.executeQuery();
			OwnerInformation owner = new OwnerInformation();
			if(gc.rs.next()) {
				owner.setName(gc.rs.getString("name"));
				owner.setEmailId(gc.rs.getString("email"));
				owner.setAddress(gc.rs.getString("address"));
				owner.setPhoneNo(gc.rs.getString("phone_no"));
				owner.setBankAccountNo(gc.rs.getString("bank_account_no"));
				owner.setBankBranch(gc.rs.getString("bank_branch"));
			}
			return owner;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertHouseDetails(HouseInformation house, int owner_id) {
		String sql = "insert into house (name,address,rent_or_sell,broker,apartment_or_house,house_type,cost,family_or_bachelor,owner_id) values(?,?,?,?,?,?,?,?,?)";
		GetConnection gc = null;
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setString(1, house.getHouseName());
			gc.ps.setString(2, house.getHouseAddress());
			gc.ps.setString(3, house.isRentOrSell()?"Rent":"Sell");
			gc.ps.setString(4, house.isBroker()?"Yes":"No");
			gc.ps.setString(5, house.isAppartmentOrHouse()?"Appartment":"House");
			gc.ps.setString(6, house.getRoomType());
			gc.ps.setInt(7, house.getCost());
			gc.ps.setString(8, house.isFamilyOrBachelors()?"Family":"Bachelor");
			gc.ps.setInt(9, owner_id);
			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public HouseInformation getHouseDetails(String address) {
		String sql = "select name, rent_or_sell,broker,apartment_or_house,house_type,cost,family_or_bachelor from house where address = ?";
		GetConnection gc = null;
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setString(1, address);
			gc.rs = gc.ps.executeQuery();
			HouseInformation house = new HouseInformation();
			if(gc.rs.next()) {
				house.setHouseName(gc.rs.getString("name"));
				house.setRentOrSell(gc.rs.getString("rent_or_sell").equals("Rent")?true:false);
				house.setBroker(gc.rs.getString("broker").equals("Yes")?true:false);
				house.setAppartmentOrHouse(gc.rs.getString("apartment_or_house").equals("Apartment")?true:false);
				house.setRoomType(gc.rs.getString("house_type"));
				house.setCost(gc.rs.getInt("cost"));
				house.setFamilyOrBachelors(gc.rs.getString("family_or_bachelor").equals("Family")?true:false);
			}
			return house;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}

	@Override
	public List<HouseInformation> getAllHouseDetailsOfParticulaOwner(int owner_id) {
		List<HouseInformation> houses = new ArrayList<HouseInformation>();
		String sql = "select name, address, rent_or_sell,broker,apartment_or_house,house_type,cost,family_or_bachelor from house where owner_id = ?";
		GetConnection gc;
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, owner_id);
			gc.rs = gc.ps.executeQuery();
			while(gc.rs.next()) {
				HouseInformation house = new HouseInformation();
				house.setHouseName(gc.rs.getString("name"));
				house.setHouseAddress(gc.rs.getString("address"));
				house.setRentOrSell(gc.rs.getString("rent_or_sell").equals("Rent")?true:false);
				house.setBroker(gc.rs.getString("broker").equals("Yes")?true:false);
				house.setAppartmentOrHouse(gc.rs.getString("apartment_or_house").equals("Apartment")?true:false);
				house.setRoomType(gc.rs.getString("house_type"));
				house.setCost(gc.rs.getInt("cost"));
				house.setFamilyOrBachelors(gc.rs.getString("family_or_bachelor").equals("Family")?true:false);
				houses.add(house);
			}
			return houses;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
