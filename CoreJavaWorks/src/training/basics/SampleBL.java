package training.basics;

import java.util.Arrays;
import java.util.List;

public class SampleBL {
	public boolean check() {
		return true;
	}
	public String sayHi(String name) {
		return "Hi " + name;
	}
	public List<String> getList(){
		return Arrays.asList("hello", "how", "are", "you");
	}
	public void throwException() {
		throw new RuntimeException("This is custom exception");
	}
}
