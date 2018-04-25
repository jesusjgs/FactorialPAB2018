package org.uma.pab2018.Factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void shouldFactorialOfZeroReturnOne() {
		Factorial factorial= new Factorial();
		int result = factorial.compute(0);
		int expectedResult=1;
		
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void shouldFactorialOfOneReturnOne() {
		Factorial factorial= new Factorial();
		int result= factorial.compute(1);
		int expectedResult=1;
		
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void shouldFactorialOfTwoReturnTwo() {
		Factorial factorial= new Factorial();
		int result= factorial.compute(2);
		int expectedResult=2;
		
		assertEquals(expectedResult,result);
	}
	
	@Test
	public void shouldFactorialOfThreeReturnSix() {
		Factorial factorial= new Factorial();
		int result= factorial.compute(3);
		int expectedResult=6;
		
		assertEquals(expectedResult,result);
	}
	
}
