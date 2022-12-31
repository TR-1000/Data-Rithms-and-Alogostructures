import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestDemo {

	@Test
	void test() {
//		List<String> expected = Arrays.asList("Love", "I", "Java");
//		List<String> result = Arrays.asList("I", "Love", "Java");
//		assertThat(expected,is(result));
		
		double value = (double) 10.f;
		double otherValue = (double) 10.f;
		assertSame(otherValue, value);
	}

}
