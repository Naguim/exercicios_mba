package tests;
import exes.Exe4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exe4Test {

	@Test
	void testSomaInt() {
		//Arrange
		int numero1 = 5;
		int numero2 = 6;
		
		//Act
		Exe4 exe = new Exe4();
		
		//Assert	
		assert(exe.soma(numero1, numero2) == 11);
	}
	
	@Test
	void testSomaDouble() {
		//Arrange
		double numero1 = 5.4;
		double numero2 = 6;
		
		//Act
		Exe4 exe = new Exe4();
		
		//Assert	
		assertEquals(exe.soma(numero1, numero2), 11.4, 0.1);
	}
	
	@Test
	void testSubtracaoInt() {
		//Arrange
		int numero1 = 5;
		int numero2 = 6;
		
		//Act
		Exe4 exe = new Exe4();
		
		//Assert	
		assert(exe.subtracao(numero1, numero2) == -1);
	}
	
	@Test
	void testSubtracaoDouble() {
		//Arrange
		double numero1 = 5.4;
		double numero2 = 6;
		
		//Act
		Exe4 exe = new Exe4();
		
		//Assert	
		assertEquals(exe.subtracao(numero1, numero2), -0.6, 0.1);
	}
	
	@Test
	void testMultiplicacaoInt() {
		//Arrange
		int numero1 = 5;
		int numero2 = 6;
		
		//Act
		Exe4 exe = new Exe4();
		
		//Assert	
		assert(exe.multiplicacao(numero1, numero2) == 30);
	}
	
	@Test
	void testMultiplicacaoDouble() {
		//Arrange
		double numero1 = 5.4;
		double numero2 = 6;
		
		//Act
		Exe4 exe = new Exe4();
		
		//Assert	
		assertEquals(exe.multiplicacao(numero1, numero2), 32.4, 0.1);
	}
	
	@Test
	void testDivisaoInt() {
		//Arrange
		int numero1 = 10;
		int numero2 = 2;
		
		//Act
		Exe4 exe = new Exe4();
		
		//Assert	
		assert(exe.divisao(numero1, numero2) == 5);
	}
	
	@Test
	void testDivisaoDouble() {
		//Arrange
		double numero1 = 5.4;
		double numero2 = 6;
		
		//Act
		Exe4 exe = new Exe4();
		
		//Assert	
		assertEquals(exe.divisao(numero1, numero2), 0.9, 0.1);
	}

}
