package cr.ac.cenfotec.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.kata.Kata;

public class KataTest {

	Kata kat = new Kata();
	
	@Test
	public void primoDe1() {
		assertEquals("[]", kat.generate(1));
	}
	
	@Test 
	public void primoDe2() {
		assertEquals("2 [2]", kat.generate(2));
	}
	
	@Test
	public void primoDe3() {
		assertEquals("3 [3]", kat.generate(3));
	}
	
	@Test 
	public void primoDe4() {
		assertEquals("4 [2,2]", kat.generate(4));
	}

	@Test
	public void primoDe5() {
		assertEquals("5 [5]", kat.generate(5));
	}
	
	@Test
	public void primoDe6() {
		assertEquals("6 [2,3]", kat.generate(6));
	}
	
	@Test
	public void primoDe7() {
		assertEquals("7 [7]", kat.generate(7));
	}
	
	@Test
	public void primoDe8() {
		assertEquals("8 [2,2,2]", kat.generate(8));
	}
	
	@Test
	public void primoDe9() {
		assertEquals("9 [3,3]", kat.generate(9));
	}
	
	@Test 
	public void primoDe36() {
		assertEquals("36 [2,2,3,3]", kat.generate(36));
	}
	
	@Test 
	public void primoDe42() {
		assertEquals("42 [2,3,7]", kat.generate(42));
	}
	
	@Test
	public void primoDe4620() {
		assertEquals("4620 [2,2,3,5,7,11]", kat.generate(4620));
	}
}
