package training.day4.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//to read the data from the user and keep the same in file
public class ReadWriteData {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Id: " );
		int empId = Integer.parseInt(br.readLine());
		System.out.println("Enter your name: ");
		String empName = br.readLine();
		System.out.println("Enter your salary: ");
		Double salary = Double.parseDouble(br.readLine());
		
		display(empId, empName, salary);
		writeData(empId, empName, salary);
		readFromFile();
	}

	public static void readFromFile() throws FileNotFoundException, IOException {
		BufferedReader brFile = new BufferedReader(new FileReader("Emp.txt"));
		String line = null;
		System.out.println("File contents");
		System.out.println("----------------------");
		while(((line = brFile.readLine()) != null)) {
			System.out.println(line);
		}
		brFile.close();
	}

	public static void writeData(int empId, String empName, Double salary) throws IOException {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("Emp.txt", true));
			
			bw.write("Empid: " + empId);
			bw.newLine();
			bw.write("Emp name: " + empName);
			bw.newLine();
			bw.write("Emp salary: " + salary);
			bw.newLine();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			bw.close();			
		}
		System.out.println("Data Written...");
	}

	public static void display(int empId, String empName, Double salary) {
		System.out.println("Emp Id : " + empId);
		System.out.println("Emp Name : " + empName);
		System.out.println("Emp salary : " + salary);
	}
	
}
