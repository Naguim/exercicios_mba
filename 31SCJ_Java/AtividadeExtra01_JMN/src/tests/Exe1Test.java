package tests;
import exes.Exe1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exe1Test {

	@Test
	void testArrayInvertido() {
		//Arrange
		int[] arrayTest = new int[] {1, 2, 3};
		
		//Act
		Exe1 exe = new Exe1();
		arrayTest = exe.inverteArray(arrayTest);
		
		//Assert
		int[] arrayAssert = new int[] {3, 2, 1};
		
		assert(arrayAssert.length == 3);
		assertArrayEquals(arrayTest, arrayAssert);
	}

}
