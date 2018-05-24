package tests;
import exes.Exe5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exe5Test {

	@Test
	void testFatorialde5() {
		//Arrange
		int numero = 5;
		
		//Act
		Exe5 exe = new Exe5();
		
		//Assert	
		assert(exe.fatorial(numero) == 120);
	}
	
	@Test
	void testFatorialde11() {
		//Arrange
		int numero = 11;
		
		//Act
		Exe5 exe = new Exe5();
		
		//Assert	
		assert(exe.fatorial(numero) == 39916800);
	}

}
