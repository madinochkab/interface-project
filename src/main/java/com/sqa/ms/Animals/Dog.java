/**
 *   File Name: Dog.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.ms.Animals;

/**
 * Dog //ADDD (description of class)
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
public class Dog implements IAnimals, iHomePet {
	private String name = "Basic Dog";
	double speed = 0;

	/**
	 * @param name
	 * @param speed
	 */
	public Dog() {
		setName("Default Dog");

	}

	/**
	 * @param name
	 * @param speed
	 */
	public Dog(String name, double speed) {
		setName(name);

	}

	/**
	 * @see com.sqa.ms.Animals.IAnimals#ageAnimal()
	 */
	@Override
	public double ageAnimal() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see com.sqa.ms.Animals.IAnimals#calcSpeed()
	 */
	@Override
	public int calcSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @see com.sqa.ms.Animals.IAnimals#calsSpeed()
	 */
	@Override
	public boolean calsSpeed() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see com.sqa.ms.Animals.IAnimals#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	/**
	 * @see com.sqa.ms.Animals.iHomePet#homePet()
	 */
	@Override
	public boolean homePet() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see com.sqa.ms.Animals.IAnimals#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;

	}

	/**
	 * @see com.sqa.ms.Animals.IAnimals#wildAnimal()
	 */
	@Override
	public boolean wildAnimal() {
		// TODO Auto-generated method stub
		return false;
	}

}
