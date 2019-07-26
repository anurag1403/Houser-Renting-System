package training.servlets.basics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import training.servlets.beans.LoginBean;
import training.servlets.service.UserBL;

@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserBL userBl;
	public void init() {
		userBl = new UserBL();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		response.setContentType("text/html");
		LoginBean loginBean = new LoginBean(username, password);
		//invoke business logic
		if(userBl.validateUser(loginBean)) {
			//send it to success
			//or dispatch
			RequestDispatcher rd = request.getRequestDispatcher("Success");
			rd.forward(request, response);
			//no statements
		}
		else {
			//send it to failure
			request.getRequestDispatcher("Failure").include(request, response);
			request.getRequestDispatcher("/Login.html").include(request, response);
		}
	}

}
