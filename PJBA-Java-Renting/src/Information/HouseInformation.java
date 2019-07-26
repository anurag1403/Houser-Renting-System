package Information;

import java.io.Serializable;

public class HouseInformation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String houseName;
	private String houseAddress;
	private boolean rentOrSell ;
	private boolean isBroker;
	private boolean AppartmentOrHouse;
	private String roomType;
	private int cost;
	private Amenities amenities;
	private boolean familyOrBachelors;
	private OwnerInformation owner;
	private int ownerId;

	public HouseInformation() {
	}
	
	public HouseInformation(String houseName, String houseAddress, boolean rentOrSell, boolean isBroker,
			boolean appartmentOrHouse, String roomType, int cost, boolean familyOrBachelors) {
		super();
		this.houseName = houseName;
		this.houseAddress = houseAddress;
		this.rentOrSell = rentOrSell;
		this.isBroker = isBroker;
		AppartmentOrHouse = appartmentOrHouse;
		this.roomType = roomType;
		this.cost = cost;
		//this.amenities = amenities;
		this.familyOrBachelors = familyOrBachelors;
		//this.owner = owner;
		//this.ownerId = ownerId; 
	}

	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public boolean isRentOrSell() {
		return rentOrSell;
	}
	public void setRentOrSell(boolean rentOrSell) {
		this.rentOrSell = rentOrSell;
	}
	public boolean isBroker() {
		return isBroker;
	}
	public void setBroker(boolean isBroker) {
		this.isBroker = isBroker;
	}
	public boolean isAppartmentOrHouse() {
		return AppartmentOrHouse;
	}
	public void setAppartmentOrHouse(boolean appartmentOrHouse) {
		AppartmentOrHouse = appartmentOrHouse;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Amenities getAmenities() {
		return amenities;
	}
	public void setAmenities(Amenities amenities) {
		this.amenities = amenities;
	}
	public boolean isFamilyOrBachelors() {
		return familyOrBachelors;
	}
	public void setFamilyOrBachelors(boolean familyOrBachelors) {
		this.familyOrBachelors = familyOrBachelors;
	}
	
	
}
