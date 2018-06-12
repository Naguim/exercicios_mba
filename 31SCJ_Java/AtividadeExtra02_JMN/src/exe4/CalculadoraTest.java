package exe4;

import static org.junit.Assert.*;

import org.junit.Test;

import exe4.Calculadora;

public class CalculadoraTest {

	@Test
	public void testExceptionSoma() {
		//Arrange
		boolean disparouException = false;
		float numero1 = 6;
		float numero2 = 6;
		
		//Act
		Calculadora calc = new Calculadora();
		
		//Assert	
		try {
			calc.somar(numero1, numero2);
		} catch (Exception e) {
			disparouException = true;
		}
		assertTrue(disparouException);
	}
	
	@Test
	public void testExceptionSubtracao() {
		//Arrange
		boolean disparouException = false;
		float numero1 = 6;
		float numero2 = 6;
		
		//Act
		Calculadora calc = new Calculadora();
		
		//Assert	
		try {
			calc.subtrair(numero1, numero2);
		} catch (Exception e) {
			disparouException = true;
		} 
		assertTrue(disparouException);
	}
	
	@Test
	public void testExceptionMultiplicacao() {
		//Arrange
		boolean disparouException = false;
		float numero1 = 6;
		float numero2 = 6;
		
		//Act
		Calculadora calc = new Calculadora();
		
		//Assert	
		try {
			calc.multiplicar(numero1, numero2);
		} catch (Exception e) {
			disparouException = true;
		} 
		assertTrue(disparouException);
	}
	
	@Test
	public void testExceptionDivisao() {
		//Arrange
		boolean disparouException = false;
		float numero1 = 6;
		float numero2 = 6;
		
		//Act
		Calculadora calc = new Calculadora();
		
		//Assert	
		try {
			calc.dividir(numero1, numero2);
		} catch (Exception e) {
			disparouException = true;
		} 
		assertTrue(disparouException);
	}
}
