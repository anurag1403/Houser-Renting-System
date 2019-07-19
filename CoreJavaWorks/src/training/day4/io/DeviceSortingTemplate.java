package training.day4.io;

import java.util.Comparator;
import java.util.Set;

public class DeviceSortingTemplate implements Comparator<Device>{
	public static Comparator<Device> sortByName() {
		return new Comparator<Device>() {

			@Override
			public int compare(Device o1, Device o2) {
				// TODO Auto-generated method stub
				return o1.getdName().compareTo(o2.getdName());
			}
			
		};
	}

	@Override
	public int compare(Device o1, Device o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
