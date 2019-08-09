package Hibernate;


import DatabaseConnection.CredentialsDAO;
import DatabaseConnection.ICredentialsDAO;
import Information.Credentials;
import Information.HouseInformation;
import Information.OwnerInformation;

public class InsertData {
	public static void main(String[] args) {
		/*ICredentials credentials = new Credentials();
		credentials.setUsername("anurag");
		credentials.setPassword("abcd");
		ICredentialsDAO dao = new CredentialsDAO();
		dao.insertCredentials(credentials);
		OwnerInformation owner = new OwnerInformation();
		owner.setName("udit");
		owner.setEmailId("udit@gmail.com");
		owner.setAddress("Chinnapanna Halli");
		owner.setPhoneNo("123654789");
		owner.setBankAccountNo("12345678912");
		owner.setBankBranch("Brookefield");
		owner.setCredentials(credentials);
		dao.insertOwnerDetails(owner);
		HouseInformation house = new HouseInformation();
		house.setName("oyo2");
		house.setAddress("laxmi narayanpura");
		house.setRentOrSell(false);
		house.setBroker(true);
		house.setAppartmentOrHouse(false);
		house.setHouseType("3BHK");
		house.setCost(45000);
		house.setFamilyOrBachelors(true);
		house.setOwner(owner);
		dao.insertHouseDetails(house);
		System.out.println("hello");*/
		//dao.getCredentials("udit1");
		ICredentialsDAO dao = new CredentialsDAO();
		System.out.println(dao.getOwnerDetails("udit1").getName());	
	}
}
