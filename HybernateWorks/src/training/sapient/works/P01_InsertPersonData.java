package training.sapient.works;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import training.sapient.beans.Person;
import training.sapient.util.HibernateUtil;

public class P01_InsertPersonData {
	
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		p.setId(101);
		p.setName("anurag");
		p.setHeight(5.9);
		p.setAge(22);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		p.setBirthDate(sdf.parse("20-04-2010"));
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(p);
		transaction.commit();
		session.close();
		System.out.println("Data stored successfully...");
	}

}
