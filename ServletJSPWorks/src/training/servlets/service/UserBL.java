package training.servlets.service;

import training.servlets.beans.LoginBean;

public class UserBL {
	public boolean validateUser(LoginBean lb) {
		return lb.getUsername().equals("india") && lb.getPassword().equals("sapient");
	}
}
