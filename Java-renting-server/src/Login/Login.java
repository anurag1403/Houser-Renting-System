package Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.DefaultEditorKit.InsertContentAction;

import DatabaseConnection.CredentialsDAO;
import DatabaseConnection.ICredentialsDAO;
import Information.Credentials;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String password=request.getParameter("pass");
		Credentials cd=new Credentials(uname, password);
		ICredentialsDAO c=new CredentialsDAO();
		CheckLogin ch=new CheckLogin();
		if(ch.check(uname, password))
		{
			request.setAttribute("uname",uname);
			request.getRequestDispatcher("Owner.jsp").forward(request, response); 
		}
		else
		{
			
			response.sendRedirect("Register.jsp");
		}
		
	}

	
	

}
