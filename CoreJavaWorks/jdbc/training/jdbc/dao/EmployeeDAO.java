package training.jdbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import training.jdbc.beans.Employee;
import training.jdbc.connection.GetConnection;
import training.jdbc.standards.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO{

	@Override
	public boolean insertEmployee(Employee employee) {
		//? is called positional parameters, index starts from 1
		//for arrays = 0
		//for RS/iterators = -1
		try {
			String sql = "insert into employee values(?,?,?,?,?,?)";
			GetConnection gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, employee.getEmpId());
			gc.ps.setString(2, employee.getEmpName());
			gc.ps.setString(3, employee.getEmpEmail());
			gc.ps.setString(4, employee.getEmpDob());
			gc.ps.setInt(5, employee.getDeptId());
			gc.ps.setDouble(6, employee.getEmpSalary());
			return gc.ps.executeUpdate() > 0 ;
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		try {
			String sql = "delete from employee where emp_id = ?";
			GetConnection gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			return gc.ps.executeUpdate() > 0 ;
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(int empId, double newSalary) {
		try {
			String sql = "update employee set salary = ? where emp_id = ?";
			GetConnection gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setInt(2, empId);
			gc.ps.setDouble(1, newSalary);
			return gc.ps.executeUpdate() > 0 ;
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee getEmployee(int empId) {
		String sql = "select emp_id ,emp_name ,emp_email, emp_dob, department_id , salary from employee where emp_id = ?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			gc.rs = gc.ps.executeQuery();
			if(gc.rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(gc.rs.getInt("emp_id"));
				employee.setEmpName(gc.rs.getString("emp_name"));
				employee.setEmpEmail(gc.rs.getString("emp_email"));
				employee.setEmpDob(gc.rs.getString("emp_dob"));
				employee.setDeptId(gc.rs.getInt("department_id"));
				employee.setEmpSalary(gc.rs.getDouble("salary"));
				return employee;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emps = new ArrayList<Employee>();
		String sql = "select emp_id ,emp_name ,emp_email, emp_dob, department_id , salary from employee";
		GetConnection gc = null;
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();
			while(gc.rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(gc.rs.getInt("emp_id"));
				employee.setEmpName(gc.rs.getString("emp_name"));
				employee.setEmpEmail(gc.rs.getString("emp_email"));
				employee.setEmpDob(gc.rs.getString("emp_dob"));
				employee.setDeptId(gc.rs.getInt("department_id"));
				employee.setEmpSalary(gc.rs.getDouble("salary"));
				emps.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				gc.ps.close();
				gc.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return emps;
	}
	
}
