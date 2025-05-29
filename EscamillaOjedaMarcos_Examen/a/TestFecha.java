package a;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFecha {

	@Test
	public void testFecha1() {
		
		Fecha fecha = new Fecha();
		
		assertEquals(true, fecha.esBisiesto(2000));
		

	}
	@Test
	public void testFecha2() {
		
		Fecha fecha = new Fecha();
		
		
		assertEquals(true, fecha.esBisiesto(2001));

	}

}
