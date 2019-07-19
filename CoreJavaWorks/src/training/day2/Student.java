package training.day2;

public class Student implements Comparable<Student>{
	private int sId;
	private String sname;
	private double sMarks;
	
	
	public Student(int sId, String sname, double sMarks) {
		super();
		this.sId = sId;
		this.sname = sname;
		this.sMarks = sMarks;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sname=" + sname + ", sMarks=" + sMarks + "]";
	}

	protected int getsId() {
		return sId;
	}
	protected void setsId(int sId) {
		this.sId = sId;
	}
	protected String getName() {
		return sname;
	}
	protected void setName(String sname) {
		this.sname = sname;
	}
	protected double getsMarks() {
		return sMarks;
	}
	protected void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}

	@Override
	public int compareTo(Student o) {
		return this.sname.compareTo(o.sname);
	}
	
}
