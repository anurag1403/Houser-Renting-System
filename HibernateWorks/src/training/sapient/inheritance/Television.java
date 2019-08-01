package training.sapient.inheritance;

import javax.persistence.Entity;

@Entity
public class Television extends Product{
	private String screenType;
	private int size;
	private String resolution;
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	@Override
	public String toString() {
		return "Television [screenType=" + screenType + ", size=" + size + ", resolution=" + resolution + "]";
	}
	public Television(int pId, String pName, String pDesc, double pPrice,String screenType, int size, String resolution) {
		super(pId, pName, pDesc, pPrice);
		this.screenType = screenType;
		this.size = size;
		this.resolution = resolution;
	}
	

}
