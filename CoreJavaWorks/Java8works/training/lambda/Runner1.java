package training.lambda;

public class Runner1 {
	public void execute(WorkerInterface worker) {
		System.out.println("Hi I am in Execute function ");
		worker.doSomeWork();
	}
}
