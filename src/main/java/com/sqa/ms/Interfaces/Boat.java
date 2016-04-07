package com.sqa.ms.Interfaces;

public class Boat implements iVehicle, iCruise {
	private String name = "Plain Boat";
	double waterDepth = 0;

	public Boat() {

	}

	public Boat(String name, double waterDepth) {
		setName(name);

	}

	@Override
	public int calcSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see com.sqa.ms.Interfaces.iCruise#cruise()
	 */
	@Override
	public boolean cruise() {
		if (this.waterDepth > 0.5) {
			System.out.println("this is sliding in water");
		} else {
			System.out.println("this boat sinking");
		}
		System.out.println("boat glying on water");
		return true;
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
		System.out.println("puputpooBoat");
		cruise();

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
