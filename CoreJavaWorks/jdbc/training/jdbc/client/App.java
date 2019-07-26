package training.jdbc.client;

import training.jdbc.beans.Employee;
import training.jdbc.dao.EmployeeDAO;
import training.jdbc.standards.IEmployeeDAO;

public class App {
	public static void main(String[] args) {
		Employee employee = new Employee(106, "Atharva", "athu@gmail.com", "1997-01-15", 20, 8000);
		IEmployeeDAO dao = new EmployeeDAO();
		//System.out.println(dao.insertEmployee(employee)?"Inserted":"Not inserted");
		//System.out.println(dao.deleteEmployee(employee.getEmpId())?"Deleted":"Not deleted");
		//System.out.println(dao.updateEmployee(employee.getEmpId(), employee.getEmpSalary())?"Updated":"Not updated");
		System.out.println(dao.getEmployee(101));
		System.out.println(dao.getAllEmployee());
		
		
	}
}
