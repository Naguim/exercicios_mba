package exe1;

import static org.junit.Assert.*;

import org.junit.Test;

import exe1.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSoma() {
		//Arrange
		float numero1 = 5.4F;
		float numero2 = 6;
		
		//Act
		Calculadora calc = new Calculadora();
		
		//Assert	
		assertEquals(calc.somar(numero1, numero2), 11.4, 0.1);
	}
	
	@Test
	public void testSubtracao() {
		//Arrange
		float numero1 = 5.4F;
		float numero2 = 6;
		
		//Act
		Calculadora calc = new Calculadora();
		
		//Assert	
		assertEquals(calc.subtrair(numero1, numero2), -0.6, 0.1);
	}
	
	@Test
	public void testMultiplicacao() {
		//Arrange
		float numero1 = 5.4F;
		float numero2 = 6;
		
		//Act
		Calculadora calc = new Calculadora();
		
		//Assert	
		assertEquals(calc.multiplicar(numero1, numero2), 32.4, 0.1);
	}
	
	@Test
	public void testDivisao() {
		//Arrange
		float numero1 = 5.4F;
		float numero2 = 6;
		
		//Act
		Calculadora calc = new Calculadora();
		
		//Assert	
		assertEquals(calc.dividir(numero1, numero2), 0.9, 0.1);
	}
}
