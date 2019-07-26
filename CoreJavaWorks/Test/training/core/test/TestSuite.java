package training.core.test;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;

public class TestSuite {
	public static void main(String[] args) {
		org.junit.runner.Result result = JUnitCore.runClasses(AllTests.class);
		for (org.junit.runner.notification.Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
