package training.basics;

public class DatedDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 1, month = 2, year = 2018;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int leap = 0, sum = 0;
		if(year % 4 == 0) {
			if (year % 100 == 0) {
				if(year % 400 == 0) {
					leap = 1;
				}
			}
			else {
				leap = 1;
			}
		}
		for(int i = 0; i < month - 1; i++) {
			sum += months[i];
		}
		sum += day;
		if(leap == 1 && month >= 2 && day < 29) {
			sum += 1;
		}
		System.out.println("Total days from the start of the year are:" + sum);
	}

}
