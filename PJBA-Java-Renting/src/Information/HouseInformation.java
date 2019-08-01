package Information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "house")
public class HouseInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int house_id;
	private String name;
	private String address;
	@Column(name = "rent_or_sell")
	private boolean rentOrSell ;
	@Column(name = "broker")
	private boolean isBroker;
	@Column(name = "apartment_or_house")
	private boolean ApartmentOrHouse;
	@Column(name = "house_type")
	private String houseType;
	private int cost;
	@Column(name = "family_or_bachelor")
	private boolean familyOrBachelors;
	@OneToOne
	@JoinColumn(name = "owner_id")
	private OwnerInformation owner;

	public HouseInformation() {
	}

	public HouseInformation(int id, String name, String address, boolean rentOrSell, boolean isBroker,
			boolean appartmentOrHouse, String roomType, int cost, boolean familyOrBachelors, OwnerInformation owner) {
		super();
		this.house_id = id;
		this.name = name;
		this.address = address;
		this.rentOrSell = rentOrSell;
		this.isBroker = isBroker;
		ApartmentOrHouse = appartmentOrHouse;
		this.houseType = roomType;
		this.cost = cost;
		this.familyOrBachelors = familyOrBachelors;
		this.owner = owner;
	}

	public int getId() {
		return house_id;
	}

	public void setId(int id) {
		this.house_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return ApartmentOrHouse;
	}

	public void setAppartmentOrHouse(boolean appartmentOrHouse) {
		ApartmentOrHouse = appartmentOrHouse;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String roomType) {
		this.houseType = roomType;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean isFamilyOrBachelors() {
		return familyOrBachelors;
	}

	public void setFamilyOrBachelors(boolean familyOrBachelors) {
		this.familyOrBachelors = familyOrBachelors;
	}

	public OwnerInformation getOwner() {
		return owner;
	}

	public void setOwner(OwnerInformation owner) {
		this.owner = owner;
	}
		
	
}
