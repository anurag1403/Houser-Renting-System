package training.servlets.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HelloWorld() {
        super();
        System.out.println("Hello world, in constructor");
    }
    public void init() {
    	System.out.println("Hi I am in init, Helloworld");
    }
    public void destroy() {
    	System.out.println("I am in going out(Destroy), from Hello world");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//processed
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		//send html content
		out.print("<html>");
		out.print("<head><title>Hello world in Servlet </title></head>");
		out.print("<body><h1>Welcome to Servlets in Sapient , by Anu </h1></body");
		out.print("</html>");
		
	}

}
