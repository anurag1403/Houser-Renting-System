package database;

import java.util.List;

import training.servlets.beans.EmployeeBean;

public interface IEmployeeDAO {
	public List<EmployeeBean> getAllEmployee();

}
