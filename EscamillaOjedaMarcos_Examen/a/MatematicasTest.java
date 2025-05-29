package a;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatematicasTest {

	@Test
	public void testPrimos() {
		
		Matematicas m = new Matematicas();
		assertEquals(true, m.esPrimo(11));
		
	}
	
	@Test
	public void testPrimos2() {
		
		Matematicas m = new Matematicas();
		assertEquals(true, m.esPrimo(4));
		
	}
	
	@Test
	public void testDivisible() {
		
		Matematicas m = new Matematicas();
		assertEquals(true, m.esDivisible(4, 2));
		
	}
	
	@Test
	public void testDivisible2() {
		
		Matematicas m = new Matematicas();
		assertEquals(true, m.esDivisible(4, 3));
		
	}
	
	@Test
	public void testCapicua() {
		
		Matematicas m = new Matematicas();
		assertEquals(true, m.esCapicua(2002));
		
	}
	
	@Test
	public void testCapicua2() {
		
		Matematicas m = new Matematicas();
		assertEquals(true, m.esCapicua(2003));
		
	}

}
