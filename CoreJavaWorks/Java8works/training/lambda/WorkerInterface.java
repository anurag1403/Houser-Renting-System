package training.lambda;

@FunctionalInterface
public interface WorkerInterface {
	public void doSomeWork();
	
	public default void imConcrete() {
		System.out.println("Hi i am from concrete");
	}
	
	public static void imStatic() {
		System.out.println("Hi i am from static");
	}
}
