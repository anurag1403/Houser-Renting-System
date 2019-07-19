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
	private RoomType roomType;
	private double cost;
	private Amenities amenities;
	private boolean familyOrBachelors;
	private OwnerInformation owner;
	private String ownerId;

	public HouseInformation(String houseName, String houseAddress, boolean rentOrSell, boolean isBroker,
			boolean appartmentOrHouse, RoomType roomType, double cost, Amenities amenities, boolean familyOrBachelors,
			OwnerInformation owner, String ownerId) {
		super();
		this.houseName = houseName;
		this.houseAddress = houseAddress;
		this.rentOrSell = rentOrSell;
		this.isBroker = isBroker;
		AppartmentOrHouse = appartmentOrHouse;
		this.roomType = roomType;
		this.cost = cost;
		this.amenities = amenities;
		this.familyOrBachelors = familyOrBachelors;
		this.owner = owner;
		this.ownerId = ownerId;
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
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
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
