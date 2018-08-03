//taking input for distance and store them in third object

package com.cg.distance;

public class Distance {

	private int feet;
	private float inches;
	private int sum_feet;
	private float sum_inches;

	/**
	 * @param feet
	 * @param inches
	 */
	public void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

//getters and setters
	public int getFeet() {
		return feet;
	}

	public float getInches() {
		return inches;
	}

	public String display() {
		return "Distance:" + getFeet() + " feet " + getInches() + " inches";
	}

	public String toString() {
		return "Added Distance:" + sum_feet + " feet " + sum_inches + " iches";
	}

//storing distance in two objects and add them and store it in third object
	public Distance sum(Distance obj1, Distance obj2) {

		Distance dis = new Distance();

		int feet1 = obj1.getFeet();
		int feet2 = obj2.getFeet();

		float inches1 = obj1.getInches();
		float inches2 = obj2.getInches();
		int sum_feet = 0;
		dis.sum_feet = feet1 + feet2;// adding feet

		float sum_inches3 = 0.0f;
		dis.sum_inches = inches1 + inches2;// adding inches

		if (dis.sum_inches > 12) {// checks if sum of inches is greater than 12
			while (dis.sum_inches > 12) {
				float inchf = dis.sum_inches % 12;
				dis.sum_inches = dis.sum_inches - 12;
				dis.sum_feet++;
			}

		}

		return dis;
	}

}
