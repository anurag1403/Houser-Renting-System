package training.day4.io;

import java.util.Comparator;
import java.util.HashSet;

class Device implements Comparator<Device>{
	private int dId;
	private String dName;
	private double dPrice;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public double getdPrice() {
		return dPrice;
	}
	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}
	public Device(int dId, String dName, double dPrice) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}
	@Override
	public String toString() {
		return "Device [dId=" + dId + ", dName=" + dName + ", dPrice=" + dPrice + "]";
	}
	@Override
	public int hashCode() {
		return this.dName.charAt(0);
	}
	
	@Override
	public boolean equals(Object obj) {
		Device device = (Device) obj;
		if(this.dId == device.dId && this.dName.equals(device.dName) && this.dPrice == device.dPrice) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int compare(Device o1, Device o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

public class CollEx05 {
	public static void main(String[] args) {
		HashSet<Device> set = new HashSet<>();
		set.add(new Device(101, "Laptop", 500));
		set.add(new Device(102, "Keyboard", 35));
		set.add(new Device(103, "Presenter", 45));
		set.add(new Device(104, "Styluss", 67));
		set.add(new Device(104, "Styluss", 67));
		for (Device temp:set) {
			System.out.println(temp.hashCode() + "," + temp);
		}
	}
}
