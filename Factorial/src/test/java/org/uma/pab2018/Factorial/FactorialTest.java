package org.uma.pab2018.Factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	private Factorial factorial;
	
	@Before
	public void init() {
		factorial= new Factorial();
	}
	
	
	@Test
	public void shouldFactorialOfZeroReturnOne() {
		int result = factorial.compute(0);
		int expectedResult=1;
		
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void shouldFactorialOfOneReturnOne() {
		int result= factorial.compute(1);
		int expectedResult=1;
		
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void shouldFactorialOfTwoReturnTwo() {
		int result= factorial.compute(2);
		int expectedResult=2;
		
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void shouldFactorialOfThreeReturnSix() {
		int result= factorial.compute(3);
		int expectedResult=6;
		
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void shouldFactorialOfFiveReturn120() {
		int result= factorial.compute(5);
		int expectedResult=120;
		
		assertEquals(expectedResult,result);
	}
	
	@Test (expected= RuntimeException.class)
	public void shouldFactorialOfNegativeReturnException() {
		factorial.compute(-1);
		
	}
	
	// @After
	
}
