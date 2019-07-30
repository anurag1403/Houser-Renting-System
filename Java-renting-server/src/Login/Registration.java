package Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DatabaseConnection.CredentialsDAO;
import Information.Credentials;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String password=request.getParameter("pass");
		
		Credentials cd=new Credentials(uname, password);
		CredentialsDAO c=new CredentialsDAO();
		CheckLogin ch=new CheckLogin();
		if(ch.check(uname, password))
		{
			response.sendRedirect("Register.jsp");
		}
		else
		{
			if(c.insertCredentials(cd))
			{
			System.out.println("success");
			}
			response.sendRedirect("NewFile.jsp");
		}
		
	}

}
