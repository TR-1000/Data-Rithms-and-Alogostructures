package calculator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MethodSourceTest {

	@ParameterizedTest
	@MethodSource
	void test(Integer a) {
		assertEquals(60, a.intValue());
	}

	static Stream<Arguments> test() {
		return Stream.of(Arguments.of(60, 50));
	}

}
