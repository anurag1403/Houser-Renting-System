package training.sapient.inheritance;

import org.hibernate.Session;

import training.sapient.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		Product products[] = {
			new Television(101, "TV", "some tv", 20000, "LCD", 21, "1024*1024"),	
			new Television(102, "TV", "new tv", 30000, "LED", 36, "2048*1786"),	
			new CellPhone(333, "mobile", "one plus", 40000, "smart", "Ios", "GSM")
		};
		Session session = HibernateUtil.getSessionFactory().openSession();
		for(Product temp: products) {
			session.save(temp);
		}
		session.beginTransaction().commit();
	}
}
