package a;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperaturaTest {

	@Test
	public void testTemperatura() {
		
		Temperatura t = new Temperatura();
		assertEquals(50, t.convertirCelsiusAFahrenheit(10),0);
		
		
	}
	
	@Test
	public void testTemperatura2() {
		
		Temperatura t = new Temperatura();
		assertEquals(50, t.convertirCelsiusAFahrenheit(11),0);
		
		
	}

}