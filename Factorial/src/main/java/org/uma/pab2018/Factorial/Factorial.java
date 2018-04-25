package org.uma.pab2018.Factorial;

public class Factorial {

	public int compute(int number) {
		// TODO Auto-generated method stub
		int result;
		if(number < 0) {
			throw new RuntimeException("");
		}
		else {
			if (number == 0 || number == 1) {
				result = 1;
			} else {
				result = number * compute(number - 1);
			}
		}
		return result;
	}
		

}
