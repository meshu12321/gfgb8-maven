package gfgb8;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.MyCalculator;

public class TestClassCalculator {
	MyCalculator ob = new MyCalculator();
	@Test
	public void test_sum() {
		assertEquals(15, ob.sum(10, 5));
	}
	@Test
	public void test_sub() {
		MyCalculator ob = new MyCalculator();
		assertEquals(5, ob.sub(10, 5));
	}
	@Test
	public void test_mul() {
		MyCalculator ob = new MyCalculator();
		assertEquals(50, ob.mul(10, 5));
	}
	@Test
	public void test_div() {
		MyCalculator ob = new MyCalculator();
		assertEquals(50, ob.div(10, 5));
	}
}

