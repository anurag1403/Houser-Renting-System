package training.servlets.beans;

public class EmployeeBean {
	private int empId;
	private String empName;
	private String empEmail;
	private String empDob;
	private int deptId;
	private double empSalary;
	
	 public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeBean(int empId, String empName, String empEmail, String empDob, int deptId, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empDob = empDob;
		this.deptId = deptId;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpDob() {
		return empDob;
	}

	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", date=" + empDob
				+ ", deptId=" + deptId + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
