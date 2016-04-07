/**
 *   File Name: Bird.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.ms.Animals;

/**
 * Bird //ADDD (description of class)
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
public class Bird implements IAnimals, iFlying {
	private String name = "birdy default name";
	double speed = 0;

	/**
	 * @param name
	 * @param speed
	 */
	public Bird(String name, double speed) {
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
	 * @see com.sqa.ms.Animals.IAnimals#calcSpeed()
	 */
	@Override

	public boolean calsSpeed() {
		if (this.speed > 3) {
			System.out.println("this is fast animal");
		} else {
			System.out.println("g");
		}
		System.out.println("r");
		return true;
	}

	/**
	 * @see com.sqa.ms.Animals.iFlying#fly()
	 */
	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see com.sqa.ms.Animals.IAnimals#getName()
	 */
	@Override
	public String getName() {

		return this.name;
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
