package training.lambda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWorksEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//oldWay();
		//in java 8 with reader, you don't have the finally block
		//java8FileVersion01();
		try(Stream st = Files.lines(Paths.get("Emp.txt"))){
			st.forEach(System.out::println);
		}
	}

	public static void java8FileVersion01() throws IOException, FileNotFoundException {
		try(
				BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
			){
			br.lines().forEach(System.out::println);
		}
	}

	public static void oldWay() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("Emp.txt"));
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
