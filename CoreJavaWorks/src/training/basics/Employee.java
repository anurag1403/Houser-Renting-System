package training.basics;
	

class Employee {
	private int empId;
	private String empName;
	private double empSal;

	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	void display() {
		System.out.println("Emp ID " + this.empId);
		System.out.println("Emp Name " + this.empName);
		System.out.println("Emp salary " + this.empSal);
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setEmpName(String empName) {
		if(empName.length() < 3){
			System.out.println("Sorry name is too short. ");
			empName = "No Name";
		}
		else {
			this.empName= empName;
		}
	}
}
