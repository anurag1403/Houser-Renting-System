package Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DatabaseConnection.CredentialsDAO;
import Information.OwnerInformation;

/**
 * Servlet implementation class Owner
 */
@WebServlet("/Owner")
public class Owner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String name=request.getParameter("name");
		String emailId=request.getParameter("emailId");
		String address=request.getParameter("address");
		String phone_no=request.getParameter("phone_no");
		String bankBranch=request.getParameter("bankBranch");
		String bankAccountNo=request.getParameter("bankAccountNo");
		OwnerInformation o=new OwnerInformation(name, emailId, address, phone_no, bankBranch, bankAccountNo);
		CredentialsDAO c=new CredentialsDAO();
		System.out.println(uname);
		boolean k=c.insertOwnerDetails(o, uname);
		if(k)
		{
			request.setAttribute("uname",uname);
			request.setAttribute("phone_no", phone_no);
			request.getRequestDispatcher("House.jsp").forward(request, response); 
			
		}
	}

	

}
