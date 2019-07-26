package training.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.EmployeeDAO;
import database.IEmployeeDAO;
import training.servlets.beans.EmployeeBean;

@WebServlet("/EmployeeLogic")
public class EmployeeLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//without sql
		/*List<EmployeeBean> employees = Arrays.asList(
				new EmployeeBean(1, "a", 1000),
				new EmployeeBean(2, "b", 2000),
				new EmployeeBean(3, "c", 3000)
				);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Employee details</title>");
		out.print("<body>");
		out.print("<table border = 3>");
		out.print("<tr><th>id</th><th>name</th><th>salary</th></tr>");
		for(EmployeeBean temp:employees) {
			out.print("<tr>");
			out.print("<td>" + temp.getEmpId() + "</td>");
			out.print("<td>" + temp.getEmpName() + "</td>");
			out.print("<td>" + temp.getSalary() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body>");		
		out.print("</head>");		
		out.print("</html>");*/
		
		//with sql
		
		IEmployeeDAO dao = new EmployeeDAO();
		List<EmployeeBean> employees = dao.getAllEmployee();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Employee details</title>");
		out.print("<body>");
		out.print("<table border = 3>");
		out.print("<tr><th>id</th><th>name</th><th>salary</th></tr>");
		for(EmployeeBean temp:employees) {
			out.print("<tr>");
			out.print("<td>" + temp.getEmpId() + "</td>");
			out.print("<td>" + temp.getEmpName() + "</td>");
			out.print("<td>" + temp.getEmpSalary() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body>");		
		out.print("</head>");		
		out.print("</html>");
		
		
	}

}
