package com.sqa.ms.Interfaces;

public class Plane implements iVehicle, iFlyingObject {
	private String name = "Plain Plane";

	public Plane() {

	}

	public Plane(String name) {
		setName(name);
	}

	@Override
	public int calcSpeed() {
		System.out.println("Plane is flying with a HIGH! speed");
		return 0;
	}

	/**
	 * @see com.sqa.ms.Interfaces.iFlyingObject#fly()
	 */
	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
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
		System.out.println("plane flying zooom");
		fly();

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
