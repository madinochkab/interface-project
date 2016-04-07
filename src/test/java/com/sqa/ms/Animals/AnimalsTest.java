/**
 *   File Name: AnimalsTest.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 6, 2016
 *
 */

package com.sqa.ms.Animals;

import org.junit.*;

/**
 * AnimalsTest //ADDD (description of class)
 *
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AnimalsTest {

	/**
	 *
	 */
	@Test
	public void test() {
		IAnimals[] animals = { new Dog(), new Cat() };
		for (IAnimals animal : animals) {
			animal.calcSpeed();
			System.out.println(animal.getName());
		}
	}

}
