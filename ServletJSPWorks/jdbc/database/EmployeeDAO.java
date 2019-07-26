package database;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import training.servlets.beans.EmployeeBean;

public class EmployeeDAO implements IEmployeeDAO{
	public List<EmployeeBean> getAllEmployee() {
		List<EmployeeBean> emps = new ArrayList<EmployeeBean>();
		String sql = "select emp_id ,emp_name ,emp_email, emp_dob, department_id , salary from employee";
		GetConnection gc = null;
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();
			while(gc.rs.next()) {
				EmployeeBean employee = new EmployeeBean();
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