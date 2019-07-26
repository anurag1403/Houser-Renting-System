package training.service;

import java.util.List;

import training.jdbc.beans.Employee;

public class EmployeeDAO {
	public List<Employee> getAllEmployee(){
		return new training.jdbc.dao.EmployeeDAO().getAllEmployee();
	}
}
