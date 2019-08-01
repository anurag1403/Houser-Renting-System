package Login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DatabaseConnection.CredentialsDAO;
import Information.HouseInformation;

/**
 * Servlet implementation class AllHouses
 */
@WebServlet("/AllHouses")
public class AllHouses extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");	
		String phone_no=request.getParameter("phone_no");	
		
		
		CredentialsDAO c=new CredentialsDAO();
		//System.out.println(c.getAllHouseDetailsOfParticulaOwner(uname));
	}

	
}
