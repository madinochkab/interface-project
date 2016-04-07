package com.sqa.ms.Animals;

/**
 * iAnimals //ADDD (description of class)
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
public interface IAnimals {
	/**
	 * @return
	 */
	public double ageAnimal();

	/**
	 * @return
	 */
	public int calcSpeed();

	/**
	 * @return
	 */
	public String getName();

	/**
	 * @param name
	 */
	public void setName(String name);

	public boolean wildAnimal();

	/**
	 * @return
	 */
	boolean calsSpeed();
}
