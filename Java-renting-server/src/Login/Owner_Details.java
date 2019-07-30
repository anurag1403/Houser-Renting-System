package Login;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DatabaseConnection.CredentialsDAO;
import Information.OwnerInformation;

/**
 * Servlet implementation class Owner_Details
 */
@WebServlet("/Owner_Details")
public class Owner_Details extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");	
		CredentialsDAO c=new CredentialsDAO();
		System.out.println(c.getOwnerDetails(uname));
	}


}
