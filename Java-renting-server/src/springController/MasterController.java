package springController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DatabaseConnection.CredentialsDAO;
import DatabaseConnection.ICredentialsDAO;
import Information.Credentials;
import Information.HouseInformation;
import Information.OwnerInformation;

@Controller
public class MasterController {
	@RequestMapping("/")
	public String entryPoint() {
		System.out.println("hello");
		return "NewFile";
	}
	@RequestMapping("/loginvalidate")
	public ModelAndView loginvalidate(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("uname");
		String password = request.getParameter("pass");
		ICredentialsDAO dao = new CredentialsDAO();
		if(dao.getCredentials(name).equals(password)) {
			System.out.println("success");
			return new ModelAndView("Owner", "message", name);
		}
		else {
			System.out.println("failure");
			return new ModelAndView("NewFile", "message", "Sorry Invalid Credentials");
		}
	}
	@RequestMapping("/owner")
	public ModelAndView ownerDetails(HttpServletRequest request, HttpServletResponse response) {
		ICredentialsDAO dao = new CredentialsDAO();
		String username = request.getParameter("uname");
		String password = dao.getCredentials(username);
		Credentials credentials = new Credentials(username, password);
		String name = request.getParameter("name");
		String emailId = request.getParameter("emailId");
		String address = request.getParameter("address");
		String phoneNo = request.getParameter("phone_no");
		String bankBranch = request.getParameter("bankBranch");
		String bankAccountNo = request.getParameter("bankAccountNo");
		OwnerInformation owner = new OwnerInformation();
		owner.setName(name);
		owner.setEmailId(emailId);
		owner.setAddress(address);
		owner.setPhoneNo(phoneNo);
		owner.setBankBranch(bankBranch);
		owner.setBankAccountNo(bankAccountNo);
		owner.setCredentials(credentials);
		dao.insertOwnerDetails(owner);
		
		return new ModelAndView("House", "owner", username);
	}
	@RequestMapping("/house")
	public ModelAndView houseDetails(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String phone_no=request.getParameter("phone_no");	
		String Hname=request.getParameter("Hname");	
		String address=request.getParameter("address");
		String cost1=request.getParameter("cost");
		int cost=Integer.parseInt(cost1);
		OwnerInformation owner = new OwnerInformation();
		ICredentialsDAO dao = new CredentialsDAO();
		owner = dao.getOwnerDetails(username);
	
		String broker = null;
		if(request.getParameter("broker") != null)
		{
			broker=request.getParameter("broker");
		}
		String s=null,a = null,f = null,b = null ;
		if(request.getParameter("s")!=null)
		{
			s=request.getParameter("s");
		}
		
		if(request.getParameter("a")!=null)
		{
			a=request.getParameter("a");
		}
		
		if(request.getParameter("f")!=null)
		{
			f=request.getParameter("f");
		}
		
		if(request.getParameter("b")!=null)
		{
			b=request.getParameter("b");
		}
		
		boolean rentOrSell = true,isBroker = false,appartmentOrHouse = false,familyOrBachelors = false;
		if(s.equals("sell"))
		{
			rentOrSell=false;
		}
		if(a.equals("appartment"))
		{
			appartmentOrHouse=true;
		}
		if(broker.equals("broker"))
		{
			isBroker=true;
		}
		if(f.equals("f"))
		{
			familyOrBachelors=true;
		}
		HouseInformation house = new HouseInformation();
		house.setName(Hname);
		house.setAddress(address);
		house.setRentOrSell(rentOrSell);
		house.setBroker(isBroker);
		house.setAppartmentOrHouse(appartmentOrHouse);
		house.setHouseType(b);
		house.setCost(cost);
		house.setFamilyOrBachelors(familyOrBachelors);
		house.setOwner(owner);
		return new ModelAndView("print.jsp");
	}
}
