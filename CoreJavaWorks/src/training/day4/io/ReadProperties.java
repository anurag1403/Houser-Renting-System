package training.day4.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("db.properties"));
		System.out.println("username is : " + prop.getProperty("username"));
		System.out.println("password is : " + prop.getProperty("password"));
		System.out.println("database is : " + prop.getProperty("db"));
	}
}
