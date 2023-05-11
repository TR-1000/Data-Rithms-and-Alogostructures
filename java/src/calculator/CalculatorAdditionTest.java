package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.*;

class CalculatorAddtionTest {
	private static final Logger logger = Logger.getLogger(CalculatorAddtionTest.class.getName());
	private Calculator cobj = new Calculator();
	private int a;
	private int b;
	@BeforeAll
	static void setUpBeforeClass(TestInfo test) {
		logger.info("Inside BeforeAll method: " + test.getDisplayName());
	}
	@BeforeEach
	void setUp(TestInfo test) {
		a = 20;
		b = 30;
		logger.info("Before Test:" + test.getDisplayName());
	}
	@Test
	@Tag("Success")
	void additionValidTest() {
		assertEquals(50, cobj.addition(a, b));
	}
	@Test
	@Tag("Failure")
	void additionInvalidTest() {
		assertEquals(40, cobj.addition(a, b));
	}
	@Test
	@Tag("Cloud")
	@Tag("Failure")
	void additionCloudTest() {
		assertNotEquals(50, cobj.addition(a, b));
	}
	@AfterEach
	void tearDown(TestInfo test) {
		a = 0;
		b = 0;
		logger.info("After Test:" + test.getDisplayName());
	}
	@AfterAll
	static void tearDownAfterClass(TestInfo test) {
		logger.info("Inside AfterAll method: " + test.getDisplayName());
	}
}
