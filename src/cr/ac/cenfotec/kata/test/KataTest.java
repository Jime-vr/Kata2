package cr.ac.cenfotec.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.kata.Kata;

public class KataTest {

	Kata kat = new Kata();
	
	@Test
	public void test() {
		assertEquals("[]", kat.generate(1));
	}

}
