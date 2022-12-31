package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Executable;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


//@DisplayName("Test CalculatorTest for testing 1")
class CalculatorTest {
	private Calculator cobj = new Calculator();
	private Calculator cobj2 = cobj;
	
	@Test
	void divisionValidTest() {
		int quotient = cobj.division(10, 5);
		assertNotSame(cobj.getClass(), cobj2.getClass());
		
	}
	
	@Test
	void divisionInValidTest() {
		Exception exception = assertThrows(ArithmeticException.class, () -> cobj.division(10, 0));
		assertEquals("/ by zero", exception.getMessage());
	}
	
	//Option 1 using @Timeout annotation
		@Timeout(3) // Timeout after 3 seconds
		@Test
		void annotationDelayValidTest() throws InterruptedException {
			cobj.delay(2); // Delay for 2 seconds
		}
		@Timeout(value = 3, unit = TimeUnit.NANOSECONDS) // Timeout after 3 nanoseconds
		@Test
		void annotationDelayInValidTest() throws InterruptedException {
			cobj.delay(2); // Delay for 2 seconds
		}
		
//		//Option 2 using assertTimeout() method
//		@Test
//		void assertDelayValidTest() {
//			Executable execution = () -> cobj.delay(2); // Delay for 2 seconds
//			assertTimeout(Duration.of(3, ChronoUnit.SECONDS), execution); // Timeout after 3 seconds
//		}
//		@Test
//		void assertDelayInValidTest() {
//			Executable execution = () -> cobj.delay(2); // Delay for 2 seconds
//			assertTimeout(Duration.ofNanos(3), execution); // Timeout after 3 nanoseconds
//		}
//		
//		//Option 3 using assertTimeoutPreemptively() method
//		@Test
//		void preemptiveAssertDelayValidTest() {
//			Executable execution = () -> cobj.delay(2); // Delay for 2 seconds
//			assertTimeoutPreemptively(Duration.ofSeconds(3), execution); // Timeout after 3 seconds
//		}
//		@Test
//		void preemptiveAssertDelayInValidTest() {
//			Executable execution = () -> cobj.delay(2); // Delay for 2 seconds
//			assertTimeoutPreemptively(Duration.of(3, ChronoUnit.NANOS), execution); // Timeout after 3 nanoseconds
//		}
}