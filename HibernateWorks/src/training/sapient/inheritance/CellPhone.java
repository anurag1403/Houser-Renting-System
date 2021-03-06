package training.sapient.inheritance;

import javax.persistence.Entity;

@Entity
public class CellPhone extends Product {
	private String type;
	private String os;
	private String connectivity;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getConnectivity() {
		return connectivity;
	}
	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}
	@Override
	public String toString() {
		return "CellPhone [type=" + type + ", os=" + os + ", connectivity=" + connectivity + "]";
	}
	public CellPhone(int pId, String pName, String pDesc, double pPrice,String type, String os, String connectivity) {
		super(pId, pName, pDesc, pPrice);
		this.type = type;
		this.os = os;
		this.connectivity = connectivity;
	}
	
	
	
}
