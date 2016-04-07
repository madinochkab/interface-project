package com.sqa.ms.Interfaces;

public class Car implements iVehicle {
	private String name = "Plain Car";

	public Car() {

	}

	public Car(String name) {
		setName(name);
	}

	/**
	 * @param name2
	 */

	@Override
	public int calcSpeed() {

		return 0;
	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean moveVehicle() {
		System.out.println("brrCAR");
		return true;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double stopVehicle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.getClass().getSimpleName() + " + " + getName());
		return stringBuilder.toString();
	}

}
