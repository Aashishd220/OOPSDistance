//class with main function passing values to distance and printing the sum

package com.cg.testdistance;

import com.cg.distance.Distance;

public class Distance_Test {

	public static void main(String args[]) {
		Distance distance1 = new Distance();// object creation
		Distance distance2 = new Distance();

		distance1.set(12, 20.0f);// passing the values
		distance2.set(1, 10.0f);

		System.out.println(distance1.display());// displaying distance
		System.out.println(distance2.display());

		Distance distance3 = new Distance();
		System.out.println(distance3.sum(distance1, distance2).toString());//displaying  sum 

	}
}
