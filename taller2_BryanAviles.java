import static org.junit.Assert.*;

import org.junit.Test;

public class TestRational {
	
	Rational r1 = new Rational(3, 2);
	Rational r2 = new Rational(3, 4);
	
	public TestRational() {
		// TODO Auto-generated constructor stub
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testconstructor() {
		Rational r = new Rational(3, 0);
	}
	
	@Test
	public void toStringTest() {
		Rational r = new Rational(1, 2);
		assertEquals("Se espera:", "1/2",  r.toString());
		
	}
	
	@Test
	public void menorTest() {
		assertEquals(false , r1.isLessThan(r2));
	}
	
	@Test
	public void getGreaterTest() {
		assertEquals("3/2" , r1.getGreater(r2).toString());
	}
	
	@Test
	public void plusTest() {
		assertEquals("9/4" , r1.plus(r2).toString());
	}
	
	@Test
	public void minusTest() {
		assertEquals("3/4", r1.minus(r2).toString());
	}
	
	@Test
	public void timesTest() {
		assertEquals("9/8", r1.times(r2).toString());
	}
	
	@Test
	public void dividesTest() {
		assertEquals("2", r1.divides(r2).toString());
	}
	
	
}