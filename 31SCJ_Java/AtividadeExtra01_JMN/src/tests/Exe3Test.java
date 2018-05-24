package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import exes.Exe3;

public class Exe3Test {
	
	@Test
	void testFuncaoMedia() {
		//Arrange
		ArrayList<Double> arrayTest = new ArrayList<Double>();
		arrayTest.add(1200.0);
		arrayTest.add(2000.0);
		arrayTest.add(3000.0);
		arrayTest.add(5200.0);
		
		//Act
		Exe3 exe = new Exe3();
		
		//Assert	
		assertEquals(exe.media(arrayTest), 2850.0);
	}
}
