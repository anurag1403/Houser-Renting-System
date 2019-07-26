package training.core.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import training.basics.SampleBL;

class BasicTest {
	SampleBL sbl = null;
	
	@BeforeAll
	public static void setUpBeforeAll() {
		System.out.println("Hi I'm in before all");
	}
	
	@AfterAll
	public static void tearAllDown() {
		System.out.println("After all are called....");
	}
	
	@BeforeEach
	public void setUp() {
		sbl = new SampleBL();
	}

	@AfterEach
	public void tearDown() {
		System.out.println("After each called....");
	}
	
	@Test
	void checkTest() {
		assertEquals(true, sbl.check());
	}
	
	@Disabled
	@Test
	void checkFailTest() {
		assertEquals(false, sbl.check());
	}
	
	@Test
	public void checkString() {
		String name = "Naveen";
		assertEquals("Hi " + name, sbl.sayHi(name));
	}
	
	@DisplayName(value = "MytimeOutCase")
	@Test
	public void checkTimeOutTest() {
		assertTimeout(Duration.ofMillis(1000), () -> sbl.throwException());
	}
	
	@DisplayName(value = "My Exception Test case")
	@Test
	public void checkExceptionTest() {
		assertThrows(RuntimeException.class, () -> sbl.throwException());
	}
	
	@DisplayName(value = "My Exception Test failed case")
	@Test
	public void checkExceptionFailedTest() {
		sbl.throwException();
	}

}
