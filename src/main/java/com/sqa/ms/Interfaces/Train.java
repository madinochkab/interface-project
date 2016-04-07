/**
 *   File Name: Train.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 4, 2016
 *
 */

package com.sqa.ms.Interfaces;

/**
 * Train //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Train implements iVehicle {
	private String name = "Plain Train";

	public Train() {

	}

	public Train(String name) {
		setName(name);
	}

	/**
	 * @see com.sqa.ms.Interfaces.iVehicle#calcSpeed()
	 */
	@Override
	public int calcSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * @see com.sqa.ms.Interfaces.iVehicle#moveVehicle()
	 */
	@Override
	public boolean moveVehicle() {
		System.out.println("choo choo");

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

	/**
	 * @see com.sqa.ms.Interfaces.iVehicle#stopVehicle()
	 */
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
