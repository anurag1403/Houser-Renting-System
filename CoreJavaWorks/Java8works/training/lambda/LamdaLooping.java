package training.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface IMyInterface{
	public void hi();
	public void bye();
}

public class LamdaLooping {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("-------------------------------");
		//java with consumer
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		});
		System.out.println("-------------------------------");
		numbers.forEach(t -> System.out.println("with lambda " + t));
		//method references
		System.out.println("----------------------------------");
		numbers.forEach(System.out::println);
	}
}
