package training.day3;

class BusinessLogic extends Thread {
	public void run() {
		System.out.println("The Thread name in run function is " + Thread.currentThread().getName());
		
		//simulating to kill some time
		for(int i = 0; i < 1000; i++) {
			System.out.println("Value of i is : " + i + " in Thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting : " + Thread.currentThread().getName());
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		//new BusinessLogic().run();
		BusinessLogic businessLogic = new BusinessLogic();
		businessLogic.setName("Desktop");
		businessLogic.start();
		
		BusinessLogic businessLogic2 = new BusinessLogic();
		//businessLogic2.setPriority(Thread.NORM_PRIORITY + 1);
		businessLogic2.setPriority(businessLogic.getPriority() + 1);
		businessLogic2.setName("Laptop");
		businessLogic2.start();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("Value of i is : " + i + " in Thread " + Thread.currentThread().getName());
			
		}
		
		try {
			businessLogic.join();
			businessLogic2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread is exiting...");
	}
}
